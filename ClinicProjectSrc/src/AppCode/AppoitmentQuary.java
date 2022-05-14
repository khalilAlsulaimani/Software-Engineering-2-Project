/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppCode;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author alsul
 */
public class AppoitmentQuary {

    DatabaseConnection dbConnect = new DatabaseConnection();
    Connection connection = dbConnect.connection;

    private PreparedStatement getAllAppoitments;
    private PreparedStatement getTodaysAppoitments;
    private PreparedStatement bookAppoitment;
    private PreparedStatement checkIfBooked;
    private PreparedStatement numberOfAppoitmentsOnDate;

    AppoitmentQuary() {
        try {

            getAllAppoitments = connection.prepareStatement("SELECT * FROM clinicdb.appoitment");
            getTodaysAppoitments = connection.prepareStatement("SELECT * FROM clinicdb.appoitment WHERE  date=?");
            bookAppoitment = connection.prepareStatement("INSERT INTO clinicdb.appoitment (time,date,patiantID,patiantName,doctorID,doctorName) "
                    + " VALUES (?,?,?,?,?,?)");
            checkIfBooked = connection.prepareStatement("SELECT * FROM clinicdb.appoitment WHERE TIME =? AND DATE =? and doctorID= ?");
            numberOfAppoitmentsOnDate = connection.prepareStatement("SELECT COUNT(*) as numberOfAppoitments FROM clinicdb.appoitment where date =? and patiantID=?");

        } catch (SQLException ex) {
            Logger.getLogger(AppoitmentQuary.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int getNumberOfBookingsOnDate(Date date, int ID) {

        try {
            numberOfAppoitmentsOnDate.setDate(1, (java.sql.Date) date);
            numberOfAppoitmentsOnDate.setInt(2, ID);

            ResultSet resultSet = numberOfAppoitmentsOnDate.executeQuery();
            resultSet.next();
            int numberOfAppoitments = resultSet.getInt("numberOfAppoitments");

            return numberOfAppoitments;

        } catch (SQLException ex) {
            Logger.getLogger(AppoitmentQuary.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    public ObservableList<Appoitment> getAllAppoitments() {
        try {
            ResultSet resultSet = getAllAppoitments.executeQuery();
            ObservableList<Appoitment> result = FXCollections.observableArrayList();
            while (resultSet.next()) {
                result.add(new Appoitment(resultSet.getInt("time"), resultSet.getDate("date"), resultSet.getInt("patiantID"),
                        resultSet.getString("patiantName"), resultSet.getInt("doctorID"), resultSet.getString("doctorName")));
            }
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(AppoitmentQuary.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<Appoitment> getTodaysAppoitments(Date date) {
        try {
            getTodaysAppoitments.setDate(1, (java.sql.Date) date);
            ResultSet resultSet = getTodaysAppoitments.executeQuery();
            List<Appoitment> result = new ArrayList<>();
            while (resultSet.next()) {
                result.add(new Appoitment(resultSet.getInt("time"), resultSet.getDate("date"), resultSet.getInt("patiantID"),
                        resultSet.getString("patiantName"), resultSet.getInt("doctorID"), resultSet.getString("doctorName")));
            }
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(AppoitmentQuary.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    public int bookAppoitment(int time, Date date, int patiantID, String patiantName, int doctorID, String doctorName) {
        try {
            bookAppoitment.setInt(1, time);
            bookAppoitment.setDate(2, (java.sql.Date) date);
            bookAppoitment.setInt(3, patiantID);
            bookAppoitment.setString(4, patiantName);
            bookAppoitment.setInt(5, doctorID);
            bookAppoitment.setString(6, doctorName);
            bookAppoitment.executeUpdate();

            return 1;
        } catch (SQLException ex) {
            Logger.getLogger(AppoitmentQuary.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public boolean checkIfBooked(int time, Date date, int doctorID) {
        try {
            checkIfBooked.setInt(1, time);
            checkIfBooked.setDate(2, (java.sql.Date) date);
            checkIfBooked.setInt(3, doctorID);
            ResultSet result = checkIfBooked.executeQuery();

            if (result.next()) {
                return true;
            }

            return false;
        } catch (SQLException ex) {
            Logger.getLogger(AppoitmentQuary.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Trueeee");
        return false;

    }

    void rollback() {
        try {
            autoCommitFalse();
            connection.rollback();
        } catch (SQLException ex) {
            Logger.getLogger(DoctorQuries.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void autoCommitFalse() {
        try {
            connection.setAutoCommit(false);
        } catch (SQLException ex) {
            Logger.getLogger(DoctorQuries.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
