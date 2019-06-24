package org.nl.hu.sie.bep.loader;

import org.nl.hu.sie.bep.loader.models.Data;
import org.nl.hu.sie.bep.loader.models.DatabaseInformationRetriever;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.SQLException;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        try {
            connect();
        } finally {

        }
    }

    private static void connect()  {
        DatabaseInformationRetriever data = new DatabaseInformationRetriever();
        List<Data> entries = data.getCustomerInformation(5);

        entries.forEach(System.out::println);
    }
}

