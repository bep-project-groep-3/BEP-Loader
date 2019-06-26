package org.nl.hu.sie.bep.loader.models;

import org.bson.Document;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Data {
    public String getStraat() {
        return straat;
    }

    public void setStraat(String straat2) {
        straat = straat2;
    }

    public String getType() {
        return type;
    }

    public void setType(String type2) {
        type = type2;
    }

    public String getHuisnummer() {
        return huisnummer;
    }

    public void setHuisnummer(String huisnummer2) {
        huisnummer = huisnummer2;
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
        return bic;
    }

    public void setBIC(String bIC2) {
        this.bic = bIC2;
    }

    public String getBedrijfsnaam() {
        return bedrijfsnaam;
    }

    public void setBedrijfsnaam(String bedrijfsnaam2) {
        bedrijfsnaam = bedrijfsnaam2;
    }

    public String getRechtsvorm() {
        return rechtsvorm;
    }

    public void setRechtsvorm(String rechtsvorm2) {
        rechtsvorm = rechtsvorm2;
    }

    public String getVAT() {
        return vat;
    }

    public void setVAT(String vAT) {
        this.vat = vAT;
    }

    public String getBankRek() {
        return bankRek;
    }

    public void setBankRek(String bankRek2) {
        bankRek = bankRek2;
    }

    public String getGiro() {
        return giro;
    }

    public void setGiro(String giro2) {
        giro = giro2;
    }

    public String getBik() {
        return bik;
    }

    public void setBik(String bik2) {
        bik = bik2;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam2) {
        voornaam = voornaam2;
    }

    public String getTussenvoegsel() {
        return tussenvoegsel;
    }

    public void setTussenvoegsel(String tussenvoegsel2) {
        tussenvoegsel = tussenvoegsel2;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam2) {
        achternaam = achternaam2;
    }

    public String getTelefoon() {
        return telefoon;
    }

    public void setTelefoon(String telefoon2) {
        telefoon = telefoon2;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax2) {
        fax = fax2;
    }

    public String getGeslacht() {
        return geslacht;
    }

    public void setGeslacht(String geslacht2) {
        geslacht = geslacht2;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note2) {
        note = note2;
    }

    public int getKlantID() {
        return klantID;
    }

    public void setKlantID(int klantID2) {
        klantID = klantID2;
    }

    public int getPersoonID() {
        return persoonID;
    }

    public void setPersoonID(int persoonID2) {
        persoonID = persoonID2;
    }

    public List<Document> getInvoiceLines() {
        return invoiceLines;
    }

    public void setInvoiceLines(List<Document> invoiceLines) {
        this.invoiceLines = invoiceLines;
    }

    public java.util.Date getDate() {
        return date;
    }

    public void setDate(java.util.Date date2) {
        date = date2;
    }

    public double getInvoiceID() {
        return invoiceID;
    }

    public void setInvoiceID(double invoiceID2) {
        invoiceID = invoiceID2;
    }

    private String straat;
    private String type;
    private String huisnummer;
    private String postcode;
    private String plaats;
    private String bic;
    private String bedrijfsnaam;
    private String rechtsvorm;
    private String vat;
    private String bankRek;
    private String giro;
    private String bik;
    private String voornaam;
    private String tussenvoegsel;
    private String achternaam;
    private String telefoon;
    private String fax;
    private String geslacht;
    private String note;

    private int klantID;
    private int persoonID;

    private List<Document> invoiceLines;
    private java.util.Date date;
    private double invoiceID;

    public Data(String straatData,
                String typeData,
                String huisnummerData,
                String postcodeData,
                String plaatsData,
                String bicData,
                int klantIDData,
                int persoonIDData,
                String bedrijfsnaamData,
                String rechtsvormData,
                String vatData,
                String bankRekData,
                String giroData,
                String bikData,
                String voornaamData,
                String tussenvoegselData,
                String achternaamData,
                String telefoonData,
                String faxData,
                String geslachtData,
                String noteData

    ) {
        straat = straatData;
        type = typeData;
        huisnummer = huisnummerData;
        this.postcode = postcodeData;
        this.plaats = plaatsData;
        this.bic = bicData;
        klantID = klantIDData;
        persoonID = persoonIDData;
        bedrijfsnaam = bedrijfsnaamData;
        rechtsvorm = rechtsvormData;
        this.vat = vatData;
        bankRek = bankRekData;
        giro = giroData;
        bik = bikData;
        voornaam = voornaamData;
        tussenvoegsel = tussenvoegselData;
        achternaam = achternaamData;
        telefoon = telefoonData;
        fax = faxData;
        geslacht = geslachtData;
        note = noteData;


    }

    public static Data fromResultSet(ResultSet resultSet) {
        try {
            String straat = resultSet.getString("straat");
            String type = resultSet.getString("type");
            String huisnummer = resultSet.getString("huisnummer");
            String postcode = resultSet.getString("postcode");
            String plaats = resultSet.getString("plaats");
            String biC = resultSet.getString("BIC");
            int klantID = resultSet.getInt("klantID");
            int persoonID = resultSet.getInt("persoonID");
            String bedrijfsnaam = resultSet.getString("bedrijfsnaam");
            String rechtsvorm = resultSet.getString("rechtsvorm");
            String vaT = resultSet.getString("VAT");
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
                    biC,
                    klantID,
                    persoonID,
                    bedrijfsnaam,
                    rechtsvorm,
                    vaT,
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
                "Straat='" + straat + '\'' +
                ", Type='" + type + '\'' +
                ", Huisnummer='" + huisnummer + '\'' +
                ", postcode='" + postcode + '\'' +
                ", plaats='" + plaats + '\'' +
                ", BIC='" + bic + '\'' +
                ", KlantID=" + klantID +
                ", PersoonID=" + persoonID +
                ", Bedrijfsnaam='" + bedrijfsnaam + '\'' +
                ", Rechtsvorm='" + rechtsvorm + '\'' +
                ", VAT='" + vat + '\'' +
                ", BankRek='" + bankRek + '\'' +
                ", Giro='" + giro + '\'' +
                ", Bik='" + bik + '\'' +
                ", Voornaam='" + voornaam + '\'' +
                ", Tussenvoegsel='" + tussenvoegsel + '\'' +
                ", Achternaam='" + achternaam + '\'' +
                ", Telefoon='" + telefoon + '\'' +
                ", Fax='" + fax + '\'' +
                ", Geslacht='" + geslacht + '\'' +
                ", note='" + note + '\'' +
                ", invoiceLines='" + invoiceLines + '\'' +
                ", invoiceID=" + invoiceID + '\'' +
                ", Date=" + date + '\'' +
                '}';
    }
}
