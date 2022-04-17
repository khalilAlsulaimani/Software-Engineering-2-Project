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
public class OwnerQuriesTest {
    
    public OwnerQuriesTest() {
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
     * Test of isFirstLogin method, of class OwnerQuries.
     */
    @Test
    public void testIsFirstLogin() {
        System.out.println("isFirstLogin");
        String username = "";
        OwnerQuries instance = new OwnerQuries();
        boolean expResult = false;
        boolean result = instance.isFirstLogin(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changeisFirstLogin method, of class OwnerQuries.
     */
    @Test
    public void testChangeisFirstLogin() {
        System.out.println("changeisFirstLogin");
        String username = "";
        OwnerQuries instance = new OwnerQuries();
        instance.changeisFirstLogin(username);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of login method, of class OwnerQuries.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        String username = "";
        String password = "";
        OwnerQuries instance = new OwnerQuries();
        boolean expResult = false;
        boolean result = instance.login(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOwner method, of class OwnerQuries.
     */
    @Test
    public void testGetOwner() {
        System.out.println("getOwner");
        String username = "";
        OwnerQuries instance = new OwnerQuries();
        Owner expResult = null;
        Owner result = instance.getOwner(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editPassword method, of class OwnerQuries.
     */
    @Test
    public void testEditPassword() {
        System.out.println("editPassword");
        String username = "";
        String password = "";
        OwnerQuries instance = new OwnerQuries();
        int expResult = 0;
        int result = instance.editPassword(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editUsername method, of class OwnerQuries.
     */
    @Test
    public void testEditUsername() {
        System.out.println("editUsername");
        String oldUsername = "";
        String newUsername = "";
        OwnerQuries instance = new OwnerQuries();
        int expResult = 0;
        int result = instance.editUsername(oldUsername, newUsername);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editName method, of class OwnerQuries.
     */
    @Test
    public void testEditName() {
        System.out.println("editName");
        String username = "";
        String name = "";
        OwnerQuries instance = new OwnerQuries();
        int expResult = 0;
        int result = instance.editName(username, name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOwnerName method, of class OwnerQuries.
     */
    @Test
    public void testGetOwnerName() {
        System.out.println("getOwnerName");
        String username = "";
        OwnerQuries instance = new OwnerQuries();
        String expResult = "";
        String result = instance.getOwnerName(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
