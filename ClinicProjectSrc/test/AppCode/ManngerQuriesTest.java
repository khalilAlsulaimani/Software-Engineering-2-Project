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
public class ManngerQuriesTest {
    
    public ManngerQuriesTest() {
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
     * Test of login method, of class ManngerQuries.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        String username = "";
        String password = "";
        ManngerQuries instance = new ManngerQuries();
        boolean expResult = false;
        boolean result = instance.login(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isFirstLogin method, of class ManngerQuries.
     */
    @Test
    public void testIsFirstLogin() {
        System.out.println("isFirstLogin");
        String username = "";
        ManngerQuries instance = new ManngerQuries();
        boolean expResult = false;
        boolean result = instance.isFirstLogin(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changeisFirstLogin method, of class ManngerQuries.
     */
    @Test
    public void testChangeisFirstLogin() {
        System.out.println("changeisFirstLogin");
        String username = "";
        ManngerQuries instance = new ManngerQuries();
        instance.changeisFirstLogin(username);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getManngerName method, of class ManngerQuries.
     */
    @Test
    public void testGetManngerName() {
        System.out.println("getManngerName");
        String username = "";
        ManngerQuries instance = new ManngerQuries();
        String expResult = "";
        String result = instance.getManngerName(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addMannger method, of class ManngerQuries.
     */
    @Test
    public void testAddMannger() {
        System.out.println("addMannger");
        int id = 0;
        String fullName = "";
        String username = "";
        String password = "";
        ManngerQuries instance = new ManngerQuries();
        int expResult = 0;
        int result = instance.addMannger(id, fullName, username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMannger method, of class ManngerQuries.
     */
    @Test
    public void testGetMannger() {
        System.out.println("getMannger");
        String username = "";
        ManngerQuries instance = new ManngerQuries();
        Mannger expResult = null;
        Mannger result = instance.getMannger(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editPassword method, of class ManngerQuries.
     */
    @Test
    public void testEditPassword() {
        System.out.println("editPassword");
        String username = "";
        String password = "";
        ManngerQuries instance = new ManngerQuries();
        int expResult = 0;
        int result = instance.editPassword(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editUsername method, of class ManngerQuries.
     */
    @Test
    public void testEditUsername() {
        System.out.println("editUsername");
        String oldUsername = "";
        String newUsername = "";
        ManngerQuries instance = new ManngerQuries();
        int expResult = 0;
        int result = instance.editUsername(oldUsername, newUsername);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of numOfManngers method, of class ManngerQuries.
     */
    @Test
    public void testNumOfManngers() {
        System.out.println("numOfManngers");
        ManngerQuries instance = new ManngerQuries();
        int expResult = 0;
        int result = instance.numOfManngers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteMannger method, of class ManngerQuries.
     */
    @Test
    public void testDeleteMannger() {
        System.out.println("deleteMannger");
        String username = "";
        ManngerQuries instance = new ManngerQuries();
        int expResult = 0;
        int result = instance.deleteMannger(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
