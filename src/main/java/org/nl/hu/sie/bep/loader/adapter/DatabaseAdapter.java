package org.nl.hu.sie.bep.loader.adapter;

import org.nl.hu.sie.bep.loader.generic.Adapter;
import org.nl.hu.sie.bep.loader.models.Data;
import org.nl.hu.sie.bep.loader.models.DatabaseInformationRetriever;

import java.sql.SQLException;
import java.util.List;

public class DatabaseAdapter implements Adapter {
    DatabaseInformationRetriever databaseInformationRetriever = new DatabaseInformationRetriever();

    @Override
    public List<Data> returnDataFromMonth(int monthNumber) throws SQLException {
        return databaseInformationRetriever.getCustomerInformation(monthNumber);
    }
}
