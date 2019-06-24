package org.nl.hu.sie.bep.loader.models;

import org.junit.Before;
import org.junit.Test;

import java.sql.ResultSet;

import static org.junit.Assert.assertEquals;

public class DataTest {

    private Data dataUnderTest;

    @Before
    public void setUp() {
        dataUnderTest = new Data("straatData", "typeData", "huisnummerData", "postcodeData", "plaatsData", "bicData", 0, 0, "bedrijfsnaamData", "rechtsvormData", "vatData", "bankRekData", "giroData", "bikData", "voornaamData", "tussenvoegselData", "achternaamData", "telefoonData", "faxData", "geslachtData", "noteData");
    }

    @Test
    public void testToString() {
        // Setup
        final String expectedResult = "result";

        // Run the test
        final String result = dataUnderTest.toString();

        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public void testFromResultSet() {
        // Setup
        final ResultSet resultSet = null;
        final Data expectedResult = null;

        // Run the test
        final Data result = Data.fromResultSet(resultSet);

        // Verify the results
        assertEquals(expectedResult, result);
    }
}
