package org.nl.hu.sie.bep.loader.generic;

import org.nl.hu.sie.bep.loader.models.Data;

import java.sql.SQLException;
import java.util.List;

public interface Adapter {
    List<Data> returnDataFromMonth(int monthNumber) throws SQLException;
}
