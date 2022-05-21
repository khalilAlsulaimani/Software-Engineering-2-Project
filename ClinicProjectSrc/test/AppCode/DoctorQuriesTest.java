/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package AppCode;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author khalil
 */
public class DoctorQuriesTest {

    public DoctorQuriesTest() {
    }

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {
        DoctorQuries instance = new DoctorQuries();
        instance.rollback();
    }

    @Before
    public void setUp() {
        DoctorQuries instance = new DoctorQuries();
        instance.autoCommitFalse();
    }

    @After
    public void tearDown() {
        DoctorQuries instance = new DoctorQuries();
        instance.rollback();
    }

    /**
     * Test of getDoctor method, of class DoctorQuries.
     */
    @Test
    public void testGetDoctor() {
        System.out.println("Test getDoctor");
        int id = 1;
        DoctorQuries instance = new DoctorQuries();
        Doctor expResult = null;
        Doctor result = instance.getDoctor(id);
        assertEquals(expResult, result);

    }

    /**
     * Test of addDoctor method, of class DoctorQuries.
     */
    @Test
    public void testIfDosntAddDuplicatedDoctor() {
        System.out.println("Test addDuplicatedDoctor");
        int id = 2;
        String fullName = "Tylor Jackson";
        String field = "Family physician";
        DoctorQuries instance = new DoctorQuries();
        int expResult = 0;
        try {
            int result = instance.addDoctor(id, fullName, field);
            assertEquals(expResult, result);
        } catch (Exception ex) {

        }
        

    }

    /**
     * Test of addDoctor method, of class DoctorQuries.
     */
    @Test
    public void testIfAddNewDoctor() {
        System.out.println("Test addNewDoctor");
        int id = 3000;
        String fullName = "milly brown";
        String field = "CPR";
        DoctorQuries instance = new DoctorQuries();
        int expResult = 1;
        instance.autoCommitFalse();
        int result = instance.addDoctor(id, fullName, field);
        assertEquals(expResult, result);

        
    }

    /**
     * Test of deleteDoc method, of class DoctorQuries.
     */
    @Test
    public void testDeleteDoc() {
        System.out.println("Test deleteDoc");
        int id = 1;
        DoctorQuries instance = new DoctorQuries();
        int expResult = 1;
        instance.autoCommitFalse();
        int result = instance.deleteDoc(id);
        assertEquals(expResult, result);
        

    }

    /**
     * Test of NumOfDoctors method, of class DoctorQuries.
     */
    @Test
    public void testNumOfDoctors() {
        System.out.println("Test NumOfDoctors");
        DoctorQuries instance = new DoctorQuries();
        int expResult = 3;
        int result = instance.NumOfDoctors();
        assertEquals(expResult, result);
        

    }

}
