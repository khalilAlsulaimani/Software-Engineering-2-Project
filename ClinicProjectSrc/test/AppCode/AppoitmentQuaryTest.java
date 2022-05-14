/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package AppCode;

import java.util.Date;
import java.util.List;
import javafx.collections.ObservableList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author khalil
 */
public class AppoitmentQuaryTest {

    public AppoitmentQuaryTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
        AppoitmentQuary instance = new AppoitmentQuary();
        instance.rollback();
    }

    @BeforeEach
    public void setUp() {
        AppoitmentQuary instance = new AppoitmentQuary();
        instance.autoCommitFalse();
    }

    @AfterEach
    public void tearDown() {
        AppoitmentQuary instance = new AppoitmentQuary();
        instance.rollback();
    }

    /**
     * Test of getNumberOfBookingsOnDate method, of class AppoitmentQuary.
     */
    @Test
    public void testGetNumberOfBookingsOnDate() {
        long millis = System.currentTimeMillis();
        Date sqlDate = new Date(millis);
        System.out.println("getNumberOfBookingsOnDate");
        Date date = null;
        int ID = 23;
        AppoitmentQuary instance = new AppoitmentQuary();
        int expResult = 0;
        instance.bookAppoitment(0, sqlDate, ID, "TestPatient", 2, "TestDoctor");
        int result = instance.getNumberOfBookingsOnDate(sqlDate, ID);
        assertEquals(expResult, result);

    }

    /**
     * Test of getAllAppoitments method, of class AppoitmentQuary.
     */
    @Test
    public void testGetAllAppoitments() {
        System.out.println("getAllAppoitments");
        AppoitmentQuary instance = new AppoitmentQuary();
        ObservableList<Appoitment> expResult = null;
        ObservableList<Appoitment> result = instance.getAllAppoitments();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTodaysAppoitments method, of class AppoitmentQuary.
     */
    @Test
    public void testGetTodaysAppoitments() {
        System.out.println("getTodaysAppoitments");
        Date date = null;
        AppoitmentQuary instance = new AppoitmentQuary();
        List<Appoitment> expResult = null;
        List<Appoitment> result = instance.getTodaysAppoitments(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bookAppoitment method, of class AppoitmentQuary.
     */
    @Test
    public void testBookAppoitment() {
        System.out.println("bookAppoitment");
        int time = 0;
        Date date = null;
        int patiantID = 0;
        String patiantName = "";
        int doctorID = 0;
        String dotorName = "";
        AppoitmentQuary instance = new AppoitmentQuary();
        int expResult = 0;
        int result = instance.bookAppoitment(time, date, patiantID, patiantName, doctorID, dotorName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkIfBooked method, of class AppoitmentQuary.
     */
    @Test
    public void testCheckIfBooked() {
        System.out.println("checkIfBooked");
        int time = 0;
        Date date = null;
        int doctorID = 0;
        AppoitmentQuary instance = new AppoitmentQuary();
        boolean expResult = false;
        boolean result = instance.checkIfBooked(time, date, doctorID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
