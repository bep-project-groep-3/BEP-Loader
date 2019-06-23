package org.nl.hu.sie.bep.business;

import org.nl.hu.sie.bep.business.models.Data;
import org.nl.hu.sie.bep.business.models.KlantMysqlImpl;

import java.sql.SQLException;
import java.util.List;

public class DatabaseFacade {
    private final KlantMysqlImpl mysql;

    public DatabaseFacade() {
        this.mysql = new KlantMysqlImpl();
    }

    public List<Data> get(int month) throws SQLException {
        return this.mysql.get(month);
    }
}
