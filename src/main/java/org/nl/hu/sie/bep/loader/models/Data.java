package org.nl.hu.sie.bep.loader.models;

import org.bson.Document;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Data {
    public String getStraat() {
        return Straat;
    }

    public void setStraat(String straat) {
        Straat = straat;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getHuisnummer() {
        return Huisnummer;
    }

    public void setHuisnummer(String huisnummer) {
        Huisnummer = huisnummer;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getPlaats() {
        return plaats;
    }

    public void setPlaats(String plaats) {
        this.plaats = plaats;
    }

    public String getBIC() {
        return BIC;
    }

    public void setBIC(String BIC) {
        this.BIC = BIC;
    }

    public String getBedrijfsnaam() {
        return Bedrijfsnaam;
    }

    public void setBedrijfsnaam(String bedrijfsnaam) {
        Bedrijfsnaam = bedrijfsnaam;
    }

    public String getRechtsvorm() {
        return Rechtsvorm;
    }

    public void setRechtsvorm(String rechtsvorm) {
        Rechtsvorm = rechtsvorm;
    }

    public String getVAT() {
        return VAT;
    }

    public void setVAT(String VAT) {
        this.VAT = VAT;
    }

    public String getBankRek() {
        return BankRek;
    }

    public void setBankRek(String bankRek) {
        BankRek = bankRek;
    }

    public String getGiro() {
        return Giro;
    }

    public void setGiro(String giro) {
        Giro = giro;
    }

    public String getBik() {
        return Bik;
    }

    public void setBik(String bik) {
        Bik = bik;
    }

    public String getVoornaam() {
        return Voornaam;
    }

    public void setVoornaam(String voornaam) {
        Voornaam = voornaam;
    }

    public String getTussenvoegsel() {
        return Tussenvoegsel;
    }

    public void setTussenvoegsel(String tussenvoegsel) {
        Tussenvoegsel = tussenvoegsel;
    }

    public String getAchternaam() {
        return Achternaam;
    }

    public void setAchternaam(String achternaam) {
        Achternaam = achternaam;
    }

    public String getTelefoon() {
        return Telefoon;
    }

    public void setTelefoon(String telefoon) {
        Telefoon = telefoon;
    }

    public String getFax() {
        return Fax;
    }

    public void setFax(String fax) {
        Fax = fax;
    }

    public String getGeslacht() {
        return Geslacht;
    }

    public void setGeslacht(String geslacht) {
        Geslacht = geslacht;
    }

    public String getNote() {
        return Note;
    }

    public void setNote(String note) {
        Note = note;
    }

    public int getKlantID() {
        return KlantID;
    }

    public void setKlantID(int klantID) {
        KlantID = klantID;
    }

    public int getPersoonID() {
        return PersoonID;
    }

    public void setPersoonID(int persoonID) {
        PersoonID = persoonID;
    }

    public List<Document> getInvoiceLines() {
        return invoiceLines;
    }

    public void setInvoiceLines(List<Document> invoiceLines) {
        this.invoiceLines = invoiceLines;
    }

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }

    public double getInvoiceID() {
        return InvoiceID;
    }

    public void setInvoiceID(double invoiceID) {
        InvoiceID = invoiceID;
    }

    private String Straat;
    private String Type;
    private String Huisnummer;
    private String postcode;
    private String plaats;
    private String BIC;
    private String Bedrijfsnaam;
    private String Rechtsvorm;
    private String VAT;
    private String BankRek;
    private String Giro;
    private String Bik;
    private String Voornaam;
    private String Tussenvoegsel;
    private String Achternaam;
    private String Telefoon;
    private String Fax;
    private String Geslacht;
    private String Note;

    private int KlantID;
    private int PersoonID;

    private List<Document> invoiceLines;
    private java.util.Date Date;
    private double InvoiceID;

    public Data(String straat,
                String type,
                String huisnummer,
                String postcode,
                String plaats,
                String BIC,
                int klantID,
                int persoonID,
                String bedrijfsnaam,
                String rechtsvorm,
                String VAT,
                String bankRek,
                String giro,
                String bik,
                String voornaam,
                String tussenvoegsel,
                String achternaam,
                String telefoon,
                String fax,
                String geslacht,
                String note

    ) {
        Straat = straat;
        Type = type;
        Huisnummer = huisnummer;
        this.postcode = postcode;
        this.plaats = plaats;
        this.BIC = BIC;
        KlantID = klantID;
        PersoonID = persoonID;
        Bedrijfsnaam = bedrijfsnaam;
        Rechtsvorm = rechtsvorm;
        this.VAT = VAT;
        BankRek = bankRek;
        Giro = giro;
        Bik = bik;
        Voornaam = voornaam;
        Tussenvoegsel = tussenvoegsel;
        Achternaam = achternaam;
        Telefoon = telefoon;
        Fax = fax;
        Geslacht = geslacht;
        Note = note;


    }

    public static Data fromResultSet(ResultSet resultSet) {
        try {
            String straat = resultSet.getString("straat");
            String type = resultSet.getString("type");
            String huisnummer = resultSet.getString("huisnummer");
            String postcode = resultSet.getString("postcode");
            String plaats = resultSet.getString("plaats");
            String BIC = resultSet.getString("BIC");
            int klantID = resultSet.getInt("klantID");
            int persoonID = resultSet.getInt("persoonID");
            String bedrijfsnaam = resultSet.getString("bedrijfsnaam");
            String rechtsvorm = resultSet.getString("rechtsvorm");
            String VAT = resultSet.getString("VAT");
            String bankRek = resultSet.getString("bankRek");
            String giro = resultSet.getString("giro");
            String bik = resultSet.getString("bik");
            String voornaam = resultSet.getString("voornaam");
            String tussenvoegsel = resultSet.getString("tussenvoegsel");
            String achternaam = resultSet.getString("achternaam");
            String telefoon = resultSet.getString("telefoon");
            String fax = resultSet.getString("fax");
            String geslacht = resultSet.getString("geslacht");

            return new Data(
                    straat,
                    type,
                    huisnummer,
                    postcode,
                    plaats,
                    BIC,
                    klantID,
                    persoonID,
                    bedrijfsnaam,
                    rechtsvorm,
                    VAT,
                    bankRek,
                    giro,
                    bik,
                    voornaam,
                    tussenvoegsel,
                    achternaam,
                    telefoon,
                    fax,
                    geslacht,
                    ""

            );
        } catch (SQLException ex) {

            Logger logger = LoggerFactory.getLogger(DatabaseInformationRetriever.class);

            logger.info(ex.getMessage());
            return null;
        }
    }

    @Override
    public String toString() {
        return "Data{" +
                "Straat='" + Straat + '\'' +
                ", Type='" + Type + '\'' +
                ", Huisnummer='" + Huisnummer + '\'' +
                ", postcode='" + postcode + '\'' +
                ", plaats='" + plaats + '\'' +
                ", BIC='" + BIC + '\'' +
                ", KlantID=" + KlantID +
                ", PersoonID=" + PersoonID +
                ", Bedrijfsnaam='" + Bedrijfsnaam + '\'' +
                ", Rechtsvorm='" + Rechtsvorm + '\'' +
                ", VAT='" + VAT + '\'' +
                ", BankRek='" + BankRek + '\'' +
                ", Giro='" + Giro + '\'' +
                ", Bik='" + Bik + '\'' +
                ", Voornaam='" + Voornaam + '\'' +
                ", Tussenvoegsel='" + Tussenvoegsel + '\'' +
                ", Achternaam='" + Achternaam + '\'' +
                ", Telefoon='" + Telefoon + '\'' +
                ", Fax='" + Fax + '\'' +
                ", Geslacht='" + Geslacht + '\'' +
                ", note='" + Note + '\'' +
                ", invoiceLines='" + invoiceLines + '\'' +
                ", invoiceID=" + InvoiceID + '\'' +
                ", Date=" + Date + '\'' +
                '}';
    }
}
