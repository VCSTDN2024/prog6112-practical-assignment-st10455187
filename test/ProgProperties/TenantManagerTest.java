/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ProgProperties;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Angel
 */
public class TenantManagerTest {

    public TenantManagerTest() {
    }

    /**
     * Test of testCheckTenantID_Valid method, of class TenantManager.
     */
    @Test
    public void testCheckTenantID_Valid() {
        String tenantID = "101";
        TenantManager instance = new TenantManager();
        boolean expResult = true;
        boolean result = instance.checkTenantID(tenantID);
        assertEquals(expResult, result);
    }

    /**
     * Test of testCheckTenantID_InValid method, of class TenantManager.
     */
    @Test
    public void testCheckTenantID_InValid() {
        String tenantID = "";
        TenantManager instance = new TenantManager();
        boolean expResult = false;
        boolean result = instance.checkTenantID(tenantID);
        assertEquals(expResult, result);
    }

    /**
     * Test of testCheckTenantFirstName_Valid method, of class TenantManager.
     */
    @Test
    public void testCheckTenantFirstName_Valid() {
        String tenantFirstName = "Angel";
        TenantManager instance = new TenantManager();
        boolean expResult = true;
        boolean result = instance.checkTenantFirstName(tenantFirstName);
        assertEquals(expResult, result);
    }

    /**
     * Test of testCheckTenantFirstName_InValid method, of class TenantManager.
     */
    @Test
    public void testCheckTenantFirstName_InValid() {
        String tenantFirstName = "";
        TenantManager instance = new TenantManager();
        boolean expResult = false;
        boolean result = instance.checkTenantFirstName(tenantFirstName);
        assertEquals(expResult, result);
    }

    /**
     * Test of testCheckTenantLastName_Valid method, of class TenantManager.
     */
    @Test
    public void testCheckTenantLastName_Valid() {
        String tenantLastName = "Maile";
        TenantManager instance = new TenantManager();
        boolean expResult = true;
        boolean result = instance.checkTenantLastName(tenantLastName);
        assertEquals(expResult, result);
    }

    /**
     * Test of testCheckTenantLastName_InValid method, of class TenantManager.
     */
    @Test
    public void testCheckTenantLastName_InValid() {
        String tenantLastName = "";
        TenantManager instance = new TenantManager();
        boolean expResult = false;
        boolean result = instance.checkTenantLastName(tenantLastName);
        assertEquals(expResult, result);
    }

    /**
     * Test of testCheckTenantEmail_Valid method, of class TenantManager.
     */
    @Test
    public void testCheckTenantEmail_Valid() {
        String tenantEmail = "angel@gmail.com";
        TenantManager instance = new TenantManager();
        boolean expResult = true;
        boolean result = instance.checkTenantEmail(tenantEmail);
        assertEquals(expResult, result);

    }

    /**
     * Test of testCheckTenantEmail_InValid method, of class TenantManager.
     */
    @Test
    public void testCheckTenantEmail_InValid() {
        String tenantEmail = "angelgmail";
        TenantManager instance = new TenantManager();
        boolean expResult = false;
        boolean result = instance.checkTenantEmail(tenantEmail);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkApartmentUnit method, of class TenantManager.
     */
    @Test
    public void testCheckApartmentUnitValid() {
        int apartmentUnit = 1001;
        TenantManager instance = new TenantManager();
        boolean expResult = true;
        boolean result = instance.checkApartmentUnit(apartmentUnit);
        assertEquals(expResult, result);
    }

    /**
     * Test of testCheckApartmentUnitInvalid method, of class TenantManager.
     */
    @Test
    public void testCheckApartmentUnitInvalid() {
        int apartmentUnit = 100;
        TenantManager instance = new TenantManager();
        boolean expResult = false;
        boolean result = instance.checkApartmentUnit(apartmentUnit);
        assertEquals(expResult, result);
    }

    /**
     * Test of testCheckApartmentTypeValid method, of class TenantManager.
     */
    @Test
    public void testCheckApartmentTypeValid() {
        int apartmentType = 2;
        TenantManager instance = new TenantManager();
        boolean expResult = true;
        boolean result = instance.checkApartmentType(apartmentType);
        assertEquals(expResult, result);
    }

    /**
     * Test of testCheckApartmentTypeValid method, of class TenantManager.
     */
    @Test
    public void testCheckApartmentTypeInValid() {
        int apartmentType = 7;
        TenantManager instance = new TenantManager();
        boolean expResult = false;
        boolean result = instance.checkApartmentType(apartmentType);
        assertEquals(expResult, result);
    }

    /**
     * Test of getAllTenants method, of class TenantManager.
     */
    @Test
    public void testGetAllTenants() {
        TenantManager instance = new TenantManager();
        ArrayList<Tenant> expResult = new ArrayList<>();
        ArrayList<Tenant> result = instance.getAllTenants();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAllInvoices method, of class TenantManager.
     */
    @Test
    public void testGetAllInvoices() {
        TenantManager instance = new TenantManager();
        ArrayList<Invoice> expResult = new ArrayList<>();
        ArrayList<Invoice> result = instance.getAllInvoices();
        assertEquals(expResult, result);
    }

    /**
     * Test of captureTenant method, of class TenantManager.
     */
    @Test
    public void testCaptureTenant() {
        Tenant newTenant = null;
        TenantManager instance = new TenantManager();
        instance.captureTenant(newTenant);

    }

    /**
     * Test of tenantsReport method, of class TenantManager.
     */
    @Test
    public void testTenantsReport() {
        TenantManager instance = new TenantManager();
        instance.tenantsReport();
    }

    /**
     * Test of searchTenant method, of class TenantManager.
     */
    @Test
    public void testSearchTenantValid() {
        String searchTenantID = "101";
        TenantManager instance = new TenantManager();
        boolean expResult = false;
        boolean result = instance.searchTenant(searchTenantID);
        assertEquals(expResult, result);
    }

    /**
     * Test of testUpdateTenantValid method, of class TenantManager.
     */
    @Test
    public void testUpdateTenantValid() {
        String oldTenantID = "101";
        String newTenantID = "102";
        String newTenantFirstName = "Kagiso";
        String newTenantLastName = "Maile";
        String newTenantEmail = "kagiso@gmail.com";
        int newApartmentUnit = 1002;
        int newApartmentType = 2;
        TenantManager instance = new TenantManager();
        boolean expResult = false;
        boolean result = instance.updateTenant("101", "102", "Kagiso", "Maile", "kagiso@gmail.com", 1002, 2);
        assertEquals(expResult, result);
    }

    /**
     * Test of testUpdateTenantInValid method, of class TenantManager.
     */
    @Test
    public void testUpdateTenantInValid() {
        String oldTenantID = "101";
        String newTenantID = "102";
        String newTenantFirstName = "Kagiso";
        String newTenantLastName = "";
        String newTenantEmail = "kagiso@gmail.com";
        int newApartmentUnit = 1002;
        int newApartmentType = 2;
        TenantManager instance = new TenantManager();
        boolean expResult = false;
        boolean result = instance.updateTenant("101", "102", "Kagiso", "Maile", "kagiso@gmail.com", 1002, 4);
        assertEquals(expResult, result);
    }

    /**
     * Test of removeTenant method, of class TenantManager.
     */
    @Test
    public void testRemoveTenant() {
        String tenantIdToRemove = "101";
        TenantManager instance = new TenantManager();
        boolean expResult = false;
        boolean result = instance.removeTenant(tenantIdToRemove);
        assertEquals(expResult, result);
    }

    /**
     * Test of invoicesReport method, of class TenantManager.
     */
    @Test
    public void testInvoicesReport() {
        TenantManager instance = new TenantManager();
        instance.invoicesReport();
    }

    /**
     * Test of updateInvoice method, of class TenantManager.
     */
    @Test
    public void testUpdateInvoice() {
        String tenantId = "101";
        String newInvoiceMonthName = "May";
        int newWaterUsed = 54;
        TenantManager instance = new TenantManager();
        boolean expResult = false;
        boolean result = instance.updateInvoice(tenantId, newInvoiceMonthName, newWaterUsed);
        assertEquals(expResult, result);

    }

    /**
     * Test of testDeleteInvoiceValid method, of class TenantManager.
     */
    @Test
    public void testDeleteInvoiceValid() {
        String invoiceToDelete = "101";
        TenantManager instance = new TenantManager();
        boolean expResult = false;
        boolean result = instance.deleteInvoice(invoiceToDelete);
        assertEquals(expResult, result);
    }

    /**
     * Test of testDeleteInvoiceInvalid method, of class TenantManager.
     */
    @Test
    public void testDeleteInvoiceInvalid() {
        String invoiceToDelete = "hi";
        TenantManager instance = new TenantManager();
        boolean expResult = false;
        boolean result = instance.deleteInvoice(invoiceToDelete);
        assertEquals(expResult, result);
    }

    /**
     * Test of exitApplication method, of class TenantManager.
     */
    @Test
    public void testExitApplication() {
        TenantManager instance = new TenantManager();
        boolean result = instance.exitApplication();
        assertTrue(result);
    }

}
