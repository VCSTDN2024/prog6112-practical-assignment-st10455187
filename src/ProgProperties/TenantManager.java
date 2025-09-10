/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProgProperties;
import java.util.ArrayList;
/**
 *
 * @author Angel
 */
public class TenantManager {

    // ArrayList to store all tenants captured in the system
    private ArrayList<Tenant> tenantsRecord = new ArrayList<>();

    // ArrayList to store all invoices generated for tenants
    private ArrayList<Invoice> invoicesRecord = new ArrayList<>();

    // Method 1: Validates tenant id
    public boolean checkTenantID(String tenantID) {
        return tenantID.length() > 0;
    }

    // Method 2: Validates tenant first name.
    public boolean checkTenantFirstName(String tenantFirstName) {
        return tenantFirstName.length() > 0;
    }

    // Method 3: Validates tenant last name.
    public boolean checkTenantLastName(String tenantLastName) {
        return tenantLastName.length() > 0;
    }

    // Method 4: Validates Tenant email address.
    public boolean checkTenantEmail(String tenantEmail) {
        return tenantEmail.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    }

    // Method 5: Validates apartment unit.
    public boolean checkApartmentUnit(int apartmentUnit) {
        return apartmentUnit >= 1001 && apartmentUnit <= 2001;
    }

    // Method 6: Validates apartment bedroom type.
    public boolean checkApartmentType(int apartmentType) {
        return apartmentType >= 1 && apartmentType <= 3;
    }

    // Method 7: Returns all the tenants and all invoices
    public ArrayList<Tenant> getAllTenants() {
        return tenantsRecord;
    }

    public ArrayList<Invoice> getAllInvoices() {
        return invoicesRecord;
    }

    // Method 8: Captures a new tenant.
    public void captureTenant(Tenant newTenant) {
        tenantsRecord.add(newTenant);
    }

    // Method 9: Print all the tenants report.
    public void tenantsReport() {
        if (tenantsRecord.isEmpty()) {
            System.out.println("Tenants not found.");
            return;
        }
        for (int i = 0; i < tenantsRecord.size(); i++) {
            System.out.println("Tenant " + (i + 1));
            tenantsRecord.get(i).displayTenant();
        }
    }

    // Method 10: Search for a tenant.
    public boolean searchTenant(String searchTenantID) {
        for (int i = 0; i < tenantsRecord.size(); i++) {
            if (tenantsRecord.get(i).getTenantId().equalsIgnoreCase(searchTenantID)) {
                tenantsRecord.get(i).displayTenant();
                return true;
            }
        }
        return false;
    }

    // Method 11: Update tenants details.
    public boolean updateTenant(String oldTenantID, String newTenantID, String newTenantFirstName, String newTenantLastName,
            String newTenantEmail, int newApartmentUnit, int newApartmentType) {
        for (int i = 0; i < tenantsRecord.size(); i++) {
            if (tenantsRecord.get(i).getTenantId().equalsIgnoreCase(oldTenantID)) {

                tenantsRecord.get(i).setTenantId(newTenantID);
                tenantsRecord.get(i).setFirstName(newTenantFirstName);
                tenantsRecord.get(i).setLastName(newTenantLastName);
                tenantsRecord.get(i).setTenantEmail(newTenantEmail);
                tenantsRecord.get(i).setApartmentUnit(newApartmentUnit);
                tenantsRecord.get(i).setApartmentType(newApartmentType); // Rent updates automatically here

                return true;
            }
        }
        return false;
    }

    // Method 12: Remove a tenant from the system.
    public boolean removeTenant(String tenantIdToRemove) {
        for (int i = 0; i < tenantsRecord.size(); i++) {
            if (tenantsRecord.get(i).getTenantId().equalsIgnoreCase(tenantIdToRemove)) {
                tenantsRecord.remove(i);
                return true;
            }
        }
        return false;
    }

    // Method 13: Generate invoice
    public Invoice generateInvoice(Tenant tenantInvoice, String invoiceMonth, int waterUsed) {
        Invoice monthlyInvoice = new Invoice(
                tenantInvoice.getTenantId(),
                tenantInvoice.getFirstName() + " " + tenantInvoice.getLastName(),
                tenantInvoice.getApartmentUnit(),
                tenantInvoice.getApartmentType(),
                tenantInvoice.getRent(),
                waterUsed,
                invoiceMonth);

        invoicesRecord.add(monthlyInvoice);
        return monthlyInvoice;
        // Export or save the invoce as txt file
        monthlyInvoice.generateTxtInvoice();
        return monthlyInvoice;
    }

    // Method 14: Display all invoices.
    public void invoicesReport() {
        if (invoicesRecord.isEmpty()) {
            System.out.println("Series not found.");
            return;
        }
        for (int i = 0; i < invoicesRecord.size(); i++) {
            System.out.println("Series " + (i + 1));
            invoicesRecord.get(i).displayInvoice();
        }
    }

    // Method 15: Search for an invoice
    public boolean searchInvoice(String tenantID) {
        for (int i = 0; i < invoicesRecord.size(); i++) {
            if (invoicesRecord.get(i).getTenantId().equalsIgnoreCase(tenantID)) {
                invoicesRecord.get(i).displayInvoice();
                return true;
            }
        }
        return false;
    }

    // Method 16: Edit an invoice
    public boolean updateInvoice(String tenantId, String newInvoiceMonthName, int newWaterUsed) {
        for (int i = 0; i < invoicesRecord.size(); i++) {
            Invoice updatedInvoice = invoicesRecord.get(i);
            if (String.valueOf(updatedInvoice.getTenantId()).equalsIgnoreCase(tenantId)) {
                updatedInvoice.setInvoiceMonth(newInvoiceMonthName);
                updatedInvoice.setWaterUsed(newWaterUsed);
                return true;
            }
        }
        return false;
    }

    // Method 17: Deletes an invoice
    public boolean deleteInvoice(String invoiceToDelete) {
        for (int i = 0; i < invoicesRecord.size(); i++) {
            if (invoicesRecord.get(i).getTenantId().equalsIgnoreCase(invoiceToDelete)) {
                invoicesRecord.remove(i);
                return true;
            }
        }
        return false;
    }

    // Method 18: Exit the application
    public boolean exitApplication() {
        System.out.println("Thanks for using PROG PROPERTIES!");
        return true;
    }
}
