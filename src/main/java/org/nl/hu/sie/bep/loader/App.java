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
        } catch (SQLException e) {

            Logger logger = LoggerFactory.getLogger(DatabaseInformationRetriever.class);

            logger.info(e.getMessage());
        }
    }

    private static void connect() throws SQLException {
        DatabaseInformationRetriever data = new DatabaseInformationRetriever();
        List<Data> entries = data.getCustomerInformation(5);

        Logger logger = LoggerFactory.getLogger(DatabaseInformationRetriever.class);

        logger.info(entries.toString());

        entries.forEach(System.out::println);
    }
}

