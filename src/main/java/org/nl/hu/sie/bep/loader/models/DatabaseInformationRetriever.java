package org.nl.hu.sie.bep.loader.models;

import com.mongodb.*;
import com.mongodb.client.*;
import com.mongodb.client.MongoClient;
import com.mongodb.client.model.Aggregates;
import com.mongodb.client.model.Projections;
import com.mysql.jdbc.Connection;
import org.bson.Document;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.function.Consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.mongodb.client.model.Filters.eq;

public class DatabaseInformationRetriever {
    private Connection con = null;
    private PreparedStatement statement;
    private ResultSet result;
    Properties props = new Properties();



    public List<Data> getCustomerInformation(int month)  {
        AggregateIterable<Document> entries = this.getInvoiceData(month);

        List<Data> data = new ArrayList<>();
        entries.forEach((Consumer<? super Document>) invoice -> {
            try {
                PreparedStatement statement2 = prepare("SELECT * FROM Klant " +
                        " JOIN Adres A on Klant.KlantID = A.KlantID " +
                        " JOIN Persoon P on Klant.KlantID = P.KlantID " +
                        "WHERE Klant.KlantID = ? AND P.PersoonID = ?"
                );

                statement2.setDouble(1, invoice.getDouble("customerId"));
                statement2.setDouble(2, invoice.getDouble("personId"));

                ResultSet resultSet = executeQuery(statement2);

                while (resultSet.next()) {
                    Data dataObject = Data.fromResultSet(resultSet);

                    if (dataObject == null) {
                        continue;
                    }

                    dataObject.setNote(invoice.getString("note"));
                    dataObject.setInvoiceLines(invoice.getList("invoiceLines", Document.class));
                    dataObject.setInvoiceID(invoice.getDouble("invoiceId"));
                    dataObject.setDate(invoice.getDate("date"));

                    data.add(dataObject);
                }
            } catch (Exception ex) {
                Logger logger = LoggerFactory.getLogger(DatabaseInformationRetriever.class);

                logger.info(ex.getMessage());

            }
        });
        return data;
    }

    public AggregateIterable<Document> getInvoiceData(int month) {
        MongoClient mongoClient = null;


        try {
            mongoClient = MongoClients.create();
            MongoDatabase database = mongoClient.getDatabase("bifi");
            MongoCollection<Document> mongoCollection = database.getCollection("factuur");
            return returnInvoiceDataFromMongoCollection(mongoCollection, month);

        }
        catch (MongoException e) {
            Logger logger = LoggerFactory.getLogger(DatabaseInformationRetriever.class);
            logger.info(e.getMessage());

        }
        return null;

    }

    private AggregateIterable<Document> returnInvoiceDataFromMongoCollection(MongoCollection<Document> mongoCollection, int monthNumber){
        return mongoCollection.aggregate(Arrays.asList(
                Aggregates.project(
                        Projections.fields(
                                Projections.excludeId(),
                                Projections.include("customerId"),
                                Projections.include("personId"),
                                Projections.include("date"),
                                Projections.include("invoiceId"),
                                Projections.include("note"),
                                Projections.include("invoiceLines"),
                                Projections.computed("month", new Document("$month", "$date")
                                )
                        )),
                Aggregates.match(eq("month", monthNumber))));
    }

    public PreparedStatement prepare(final String statement) throws SQLException {
        return this.prepare(statement, Statement.NO_GENERATED_KEYS);
    }

    public PreparedStatement prepare(final String statement, int autoGeneratedKeys) throws SQLException {

        this.close(this.statement, this.result);


        if (this.con == null || this.con.isClosed()) {
            InputStream input = null;
            try {
                input = new FileInputStream("C:\\Users\\Dima\\IdeaProjects\\BEP-Loader\\login.properties");
            } catch (FileNotFoundException e) {
                Logger logger = LoggerFactory.getLogger(DatabaseInformationRetriever.class);
                logger.info("File not found", e);


            }
            try {
                props.load(input);
            } catch (IOException e) {
                Logger logger = LoggerFactory.getLogger(DatabaseInformationRetriever.class);
                logger.info("IO Exception", e);

            }
            try {

                String password2 = props.getProperty("password");

                this.con = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bifi", "root", password2
                );
            } catch (SQLException ex) {
                Logger logger = LoggerFactory.getLogger(DatabaseInformationRetriever.class);

                logger.info(ex.getMessage());
            }
        }

            try {
                this.statement = this.con.prepareStatement(statement, autoGeneratedKeys);

                return this.statement;
            }    catch (NullPointerException ex) {

                    Logger logger = LoggerFactory.getLogger(DatabaseInformationRetriever.class);

                    logger.info(ex.getMessage());
            }

        return this.statement;
    }

    public ResultSet executeQuery(PreparedStatement statement) throws SQLException {
        this.result = statement.executeQuery();

        return this.result;
    }

    public void close(PreparedStatement preparedStatement, ResultSet resultSet) {
        try {
            if (resultSet != null){
                resultSet.close();
            }

            if(preparedStatement != null){
                preparedStatement.close();
            }
        } catch (Exception ex) {
            Logger logger = LoggerFactory.getLogger(DatabaseInformationRetriever.class);

            logger.info(ex.getMessage());
        }
    }
}
