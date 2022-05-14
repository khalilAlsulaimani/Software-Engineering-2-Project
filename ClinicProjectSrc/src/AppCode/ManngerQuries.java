/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppCode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alsul
 */
public class ManngerQuries {

    DatabaseConnection dbConnect = new DatabaseConnection();
    Connection connection = dbConnect.connection;
    private PreparedStatement getMannger;
    private PreparedStatement editUsername;
    private PreparedStatement editPassword;
    private PreparedStatement addReceptionest;
    private PreparedStatement addMannger;
    private PreparedStatement getAllManggers;
    private PreparedStatement deleteMannger;
    private PreparedStatement getManngerName;
    private PreparedStatement isFirstLogin;
    private PreparedStatement changeisFirstLogin;

    public ManngerQuries() {
        try {

            getManngerName = connection.prepareStatement("SELECT fullName FROM clinicdb.mannger WHERE username = ?");
            getMannger = connection.prepareStatement("SELECT * FROM  clinicdb.mannger WHERE username = ?");
            editUsername = connection.prepareStatement("UPDATE  clinicdb.mannger SET username =? where username = ?  ");
            editPassword = connection.prepareStatement("UPDATE  clinicdb.mannger SET password =? where username = ?  ");
            addReceptionest = connection.prepareStatement("UPDATE clinicdb.mannger SET receptionistID =? WHERE username =?");
            getAllManggers = connection.prepareStatement("SELECT COUNT(1) as numOfRows FROM  mannger");
            addMannger = connection.prepareStatement("INSERT INTO clinicdb.mannger VALUES (?,?,NULL,?,?,1)");
            deleteMannger = connection.prepareStatement("DELETE FROM clinicdb.mannger WHERE username = ?");
            isFirstLogin = connection.prepareStatement("SELECT isFirstLogin from clinicdb.mannger WHERE username = ?");
            changeisFirstLogin = connection.prepareStatement("UPDATE clinicdb.mannger SET isFirstLogin = 0 WHERE username=?");

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public boolean login(String username, String password) {
        try {
            getMannger.setString(1, username);
            ResultSet resultSet = getMannger.executeQuery();

            if (resultSet.next()) {
                Mannger result = new Mannger(resultSet.getInt("id"), resultSet.getString("fullName"), username, resultSet.getString("password"),
                        resultSet.getInt("receptionistID"));
                if (password.equals(result.getPassword())) {
                    return true;
                }
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return false;

    }

    public boolean isFirstLogin(String username) {
        try {
            isFirstLogin.setString(1, username);
            ResultSet result = isFirstLogin.executeQuery();
            result.next();
            int res = result.getInt("isFirstLogin");
            if (res == 0) {
                System.out.print("false");
                return false;
            } else {
                System.out.print("true");
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(ManngerQuries.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }

    public void changeisFirstLogin(String username) {
        try {
            changeisFirstLogin.setString(1, username);
            changeisFirstLogin.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(ManngerQuries.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getManngerName(String username) {
        try {
            getManngerName.setString(1, username);
            ResultSet result = getManngerName.executeQuery();
            if (result.next()) {
                return result.getString("fullName");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManngerQuries.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public int addMannger(int id, String fullName, String username, String password) {
        try {
            addMannger.setInt(1, id);
            addMannger.setString(2, fullName);
            addMannger.setString(3, username);
            addMannger.setString(4, password);
            addMannger.executeUpdate();
            return 1;
        } catch (SQLException ex) {
            Logger.getLogger(ManngerQuries.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;

    }

    public Mannger getMannger(String username) {

        try {
            getMannger.setString(1, username);
            ResultSet resultSet = getMannger.executeQuery();

            if (resultSet.next()) {
                Mannger result = new Mannger(resultSet.getInt("id"), resultSet.getString("fullname"), username, resultSet.getString("password"),
                        resultSet.getInt("receptionistID"));
                return result;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public int editPassword(String username, String password) {
        try {

            editPassword.setString(1, password);
            editPassword.setString(2, username);
            editPassword.executeUpdate();
            return 1;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return 0;

    }

    public int editUsername(String oldUsername, String newUsername) {
        try {

            editUsername.setString(1, newUsername);
            editUsername.setString(2, oldUsername);
            editUsername.executeUpdate();
            return 1;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return 0;

    }

    public int numOfManngers() {
        int numOfReps = 0;

        try {
            ResultSet result = getAllManggers.executeQuery();
            result.next();
            numOfReps = result.getInt("numOfRows");

        } catch (SQLException ex) {
            Logger.getLogger(ReceptionQuries.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        return numOfReps;
    }

    public int deleteMannger(String username) {
        try {
            deleteMannger.setString(1, username);
            deleteMannger.executeUpdate();
            return 1;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return 0;

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
