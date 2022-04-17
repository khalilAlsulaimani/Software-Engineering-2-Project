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
public class PatiantQuriesTest {
    
    public PatiantQuriesTest() {
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
     * Test of getPatiant method, of class PatiantQuries.
     */
    @Test
    public void testGetPatiant() {
        System.out.println("getPatiant");
        int id = 0;
        PatiantQuries instance = new PatiantQuries();
        Patiant expResult = null;
        Patiant result = instance.getPatiant(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of numOfPatiants method, of class PatiantQuries.
     */
    @Test
    public void testNumOfPatiants() {
        System.out.println("numOfPatiants");
        PatiantQuries instance = new PatiantQuries();
        int expResult = 0;
        int result = instance.numOfPatiants();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addPatiant method, of class PatiantQuries.
     */
    @Test
    public void testAddPatiant() {
        System.out.println("addPatiant");
        int id = 0;
        String fullName = "";
        int doctorID = 0;
        int age = 0;
        int number = 0;
        PatiantQuries instance = new PatiantQuries();
        int expResult = 0;
        int result = instance.addPatiant(id, fullName, doctorID, age, number);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
