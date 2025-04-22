/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.loginapp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author LENOVO T495
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginAppTest {

    @BeforeAll
    public static void setUpClass() throws Exception {
    }

    @AfterAll
    public static void tearDownClass() throws Exception {
    }

    @BeforeEach
    public void setUp() throws Exception {
    }

    @AfterEach
    public void tearDown() throws Exception {
    }

    @Test
    public void testCheckUserName_CorrectFormat() {
        LoginApp user = new LoginApp("amy_2", "Secur3!Pass", "+27711234567", "Amy", "Smith");
        assertTrue(user.checkUserName());
    }

    @Test
    public void testCheckUserName_IncorrectFormat() {
        LoginApp user = new LoginApp("amyTooLong", "Secur3!Pass", "+27711234567", "Amy", "Smith");
        assertFalse(user.checkUserName());
    }

    @Test
    public void testCheckPasswordComplexity_CorrectFormat() {
        LoginApp user = new LoginApp("amy_2", "Secur3!Pass", "+27711234567", "Amy", "Smith");
        assertTrue(user.checkPasswordComplexity());
    }

    @Test
    public void testCheckPasswordComplexity_MissingSpecialChar() {
        LoginApp user = new LoginApp("amy_2", "Secure123", "+27711234567", "Amy", "Smith");
        assertFalse(user.checkPasswordComplexity());
    }

    @Test
    public void testCheckCellPhoneNumber_CorrectFormat() {
        LoginApp user = new LoginApp("amy_2", "Secur3!Pass", "+27831112222", "Amy", "Smith");
        assertTrue(user.checkCellPhoneNumber());
    }

    @Test
    public void testCheckCellPhoneNumber_IncorrectFormat() {
        LoginApp user = new LoginApp("amy_2", "Secur3!Pass", "0831234567", "Amy", "Smith");
        assertFalse(user.checkCellPhoneNumber());
    }

    @Test
    public void testLoginUser_CorrectCredentials() {
        LoginApp user = new LoginApp("amy_2", "Secur3!Pass", "+27711234567", "Amy", "Smith");
        assertTrue(user.loginUser("amy_2", "Secur3!Pass"));
    }

    @Test
    public void testLoginUser_IncorrectCredentials() {
        LoginApp user = new LoginApp("amy_2", "Secur3!Pass", "+27711234567", "Amy", "Smith");
        assertFalse(user.loginUser("amy_2", "WrongPass123"));
    }

    @Test
    public void testRegisterUser_Successful() {
        LoginApp user = new LoginApp("amy_2", "Secur3!Pass", "+27711234567", "Amy", "Smith");
        String result = user.registerUser();
        assertTrue(result.contains("Username successfully captured"));
    }

    @Test
    public void testRegisterUser_InvalidUsername() {
        LoginApp user = new LoginApp("amyTooLong", "Secur3!Pass", "+27711234567", "Amy", "Smith");
        String result = user.registerUser();
        assertEquals("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.", result);
    }

    /**
     * Test of checkUserName method, of class LoginApp.
     */
    @Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        LoginApp instance = null;
        boolean expResult = false;
        boolean result = instance.checkUserName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkPasswordComplexity method, of class LoginApp.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        LoginApp instance = null;
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkCellPhoneNumber method, of class LoginApp.
     */
    @Test
    public void testCheckCellPhoneNumber() {
        System.out.println("checkCellPhoneNumber");
        LoginApp instance = null;
        boolean expResult = false;
        boolean result = instance.checkCellPhoneNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerUser method, of class LoginApp.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        LoginApp instance = null;
        String expResult = "";
        String result = instance.registerUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loginUser method, of class LoginApp.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String inputUsername = "";
        String inputPassword = "";
        LoginApp instance = null;
        boolean expResult = false;
        boolean result = instance.loginUser(inputUsername, inputPassword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWelcomeMessage method, of class LoginApp.
     */
    @Test
    public void testGetWelcomeMessage() {
        System.out.println("getWelcomeMessage");
        LoginApp instance = null;
        String expResult = "";
        String result = instance.getWelcomeMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class LoginApp.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        LoginApp.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
