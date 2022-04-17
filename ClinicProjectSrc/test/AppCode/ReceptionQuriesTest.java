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
public class ReceptionQuriesTest {
    
    public ReceptionQuriesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of isFirstLogin method, of class ReceptionQuries.
     */
    @Test
    public void testIsFirstLogin() {
        System.out.println("isFirstLogin");
        String username = "";
        ReceptionQuries instance = new ReceptionQuries();
        boolean expResult = false;
        boolean result = instance.isFirstLogin(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changeisFirstLogin method, of class ReceptionQuries.
     */
    @Test
    public void testChangeisFirstLogin() {
        System.out.println("changeisFirstLogin");
        String username = "";
        ReceptionQuries instance = new ReceptionQuries();
        instance.changeisFirstLogin(username);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of login method, of class ReceptionQuries.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        String username = "";
        String password = "";
        ReceptionQuries instance = new ReceptionQuries();
        boolean expResult = false;
        boolean result = instance.login(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReceptionist method, of class ReceptionQuries.
     */
    @Test
    public void testGetReceptionist() {
        System.out.println("getReceptionist");
        String username = "";
        ReceptionQuries instance = new ReceptionQuries();
        Repceptionest expResult = null;
        Repceptionest result = instance.getReceptionist(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editPassword method, of class ReceptionQuries.
     */
    @Test
    public void testEditPassword() {
        System.out.println("editPassword");
        String username = "";
        String password = "";
        ReceptionQuries instance = new ReceptionQuries();
        int expResult = 0;
        int result = instance.editPassword(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editUsername method, of class ReceptionQuries.
     */
    @Test
    public void testEditUsername() {
        System.out.println("editUsername");
        String oldUsername = "";
        String newUsername = "";
        ReceptionQuries instance = new ReceptionQuries();
        int expResult = 0;
        int result = instance.editUsername(oldUsername, newUsername);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of NumOfReps method, of class ReceptionQuries.
     */
    @Test
    public void testNumOfReps() {
        System.out.println("NumOfReps");
        ReceptionQuries instance = new ReceptionQuries();
        int expResult = 0;
        int result = instance.NumOfReps();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addRecptionest method, of class ReceptionQuries.
     */
    @Test
    public void testAddRecptionest() {
        System.out.println("addRecptionest");
        int id = 0;
        String fullName = "";
        String username = "";
        String password = "";
        ReceptionQuries instance = new ReceptionQuries();
        int expResult = 0;
        int result = instance.addRecptionest(id, fullName, username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteReceptionest method, of class ReceptionQuries.
     */
    @Test
    public void testDeleteReceptionest() {
        System.out.println("deleteReceptionest");
        String username = "";
        ReceptionQuries instance = new ReceptionQuries();
        int expResult = 0;
        int result = instance.deleteReceptionest(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
