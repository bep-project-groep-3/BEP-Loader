package org.nl.hu.sie.bep.loader;

import org.nl.hu.sie.bep.loader.models.Data;
import org.nl.hu.sie.bep.loader.models.DatabaseInformationRetriever;

import java.sql.SQLException;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        try {
            connect();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    private static void connect() throws ClassNotFoundException, SQLException {
        DatabaseInformationRetriever data = new DatabaseInformationRetriever();
        List<Data> entries = data.getCustomerInformation(5);

        entries.forEach(System.out::println);
    }
}

