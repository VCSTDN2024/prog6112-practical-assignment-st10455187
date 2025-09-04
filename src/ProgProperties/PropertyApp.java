/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ProgProperties;

import ProgSeries.Series;
import ProgrammingAssignment.ProgAssignment;
import java.util.*;

/**
 *
 * @author Angel
 */
public class PropertyApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Instantiate a scanner.
        Scanner scn = new Scanner(System.in);

        // Instantiate the TenantManager class.
        TenantManager tm = new TenantManager();

        System.out.println("*****PROG PROPERTIES (PTY) LTD*****");
        System.out.print("Enter (1) to launch menu or any other key to exit: ");
        String userKey = scn.next();

        if (!userKey.equals("1")) {
            System.out.println("Thanks for using the application. Bye!");
            ProgAssignment.main(null);
            return;
        }

        while (true) {
            System.out.println("Please select one of the following menu items:\n"
                    + "(1) Capture a new tenant.\n"
                    + "(2) Print all tenants report.\n"
                    + "(3) Search for a tenant.\n"
                    + "(4) Update tenants details.\n"
                    + "(5) Remove a tenant from the system.\n"
                    + "(6) Generate invoices\n"
                    + "(7) Print all invoices report\n"
                    + "(8) Search for an invoice\n"
                    + "(9) Edit an invoice\n"
                    + "(10) Delete an invoice\n"
                    + "(11) Exit application");

            int userOption = scn.nextInt();
            scn.nextLine();

            switch (userOption) {
                case 1: // Captures tenant details.
                    System.out.println("CAPTURE A NEW TENANT");
                    System.out.println("********************");

                    // Prompt for tenant id.
                    String tenantId;
                    while (true) {
                        System.out.print("Enter the tenant ID: ");
                        tenantId = scn.nextLine();
                        if (tm.checkTenantID(tenantId)) {
                            break;
                        } else {
                            System.out.println("Tenant ID cannot be empty!");
                        }
                    }

                    // Prompt for tenant first name.
                    String tenantFirstName;
                    while (true) {
                        System.out.print("Enter tenant first name: ");
                        tenantFirstName = scn.nextLine();
                        if (tm.checkTenantFirstName(tenantFirstName)) {
                            break;
                        } else {
                            System.out.println("Tenant first name cannot be empty!");
                        }

                    }

                    // Prompt for tenant last name.
                    String tenantLastName;
                    while (true) {
                        System.out.print("Enter tenant last name: ");
                        tenantLastName = scn.nextLine();
                        if (tm.checkTenantLastName(tenantLastName)) {
                            break;
                        } else {
                            System.out.println("Tenant last name cannot be empty!");
                        }

                    }

                    // Prompt for tenant email adress.
                    String tenantEmail;
                    while (true) {
                        System.out.print("Enter tenant email address: ");
                        tenantEmail = scn.nextLine();
                        if (tm.checkTenantEmail(tenantEmail)) {
                            break;
                        } else {
                            System.out.println("Tenant email address does not meet the requirements, make sure you include (@)!");
                        }
                    }

                    // Prompt for apartment unit number.
                    int apartmentUnit;
                    while (true) {
                        try {
                            System.out.print("Enter the apartment unit number(1001 - 2001) for " + tenantFirstName + " " + tenantLastName + ": ");
                            apartmentUnit = scn.nextInt();

                            if (tm.checkApartmentUnit(apartmentUnit)) {
                                break;
                            } else {
                                System.out.println("You have entered an invalid unit number , please try again!!!");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid! Please enter a valid apartment unit number.");
                            scn.nextLine();
                        }
                    }

                    // Prompt for number of bedrooms
                    int bedrooms;
                    while (true) {
                        try {
                            System.out.print("Enter number of bedrooms (1-3): ");
                            bedrooms = scn.nextInt();
                            scn.nextLine();
                            if (bedrooms >= 1 && bedrooms <= 3) {
                                break;
                            } else {
                                System.out.println("Invalid input. Enter 1, 2, or 3.");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input. Enter a number.");
                            scn.nextLine();
                        }
                    }

                    // Create the tenant object
                    Tenant capturedTenant = new Tenant(tenantId, tenantFirstName, tenantLastName, tenantEmail, apartmentUnit, bedrooms);
                    tm.captureTenant(capturedTenant);
                    System.out.println("Tenant captured successfully!");
                    System.out.println("*******************************************");
                    break;

                case 2: // Display the tenants report.
                    tm.tenantsReport();
                    break;

                case 3: // Search for a tenant
                    System.out.print("Enter the tenant ID to search: ");
                    String searchID = scn.nextLine();

                    if (tm.searchTenant(searchID)) {
                    } else {
                        System.out.println("Tenant with ID: " + searchID + " was not foundd!");
                    }
                    break;

                case 4: // Update Tenant Details
                    System.out.print("Enter the tenant ID to update: ");
                    String oldTenantID = scn.nextLine();

                    // Check if tenant exists
                    if (!tm.searchTenant(oldTenantID)) {
                        System.out.println("Tenant with ID: " + oldTenantID + " was not found!");
                        break;
                    }

                    // Prompt for new tenant id
                    String newTenantID;
                    while (true) {
                        System.out.print("Enter the new ID for the tenant: ");
                        newTenantID = scn.nextLine();
                        if (tm.checkTenantID(newTenantID)) {
                            break;
                        } else {
                            System.out.println("Tenant ID cannot be empty!");
                        }
                    }

                    // Prompt for new tenant first name
                    String newTenantFirstName;
                    while (true) {
                        System.out.print("Enter the new first name for the tenant: ");
                        newTenantFirstName = scn.nextLine();
                        if (tm.checkTenantFirstName(newTenantFirstName)) {
                            break;
                        } else {
                            System.out.println("Tenant first name cannot be empty!");
                        }
                    }

                    // Prompt for new tenant last name
                    String newTenantLastName;
                    while (true) {
                        System.out.print("Enter the new last name for the tenant: ");
                        newTenantLastName = scn.nextLine();
                        if (tm.checkTenantLastName(newTenantLastName)) {
                            break;
                        } else {
                            System.out.println("Tenant last name cannot be empty!");
                        }
                    }

                    // Prompt for new tenant email address
                    String newTenantEmail;
                    while (true) {
                        System.out.print("Enter the new tenant email address: ");
                        newTenantEmail = scn.nextLine();
                        if (tm.checkTenantEmail(newTenantEmail)) {
                            break;
                        } else {
                            System.out.println("Tenant email address cannot be empty!");
                        }
                    }

                    // Prompt for apartment unit number
                    int newApartmentUnit;
                    while (true) {
                        try {
                            System.out.print("Enter the new apartment unit number: ");
                            newApartmentUnit = scn.nextInt();

                            if (tm.checkApartmentUnit(newApartmentUnit)) {
                                break;
                            } else {
                                System.out.println("You have entered an invalid unit number, please try again!");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid! Please enter a valid apartment unit number.");
                            scn.nextLine();
                        }
                    }

                    // Prompt for the new number of bedrooms type.
                    int newNumberOfBedrooms;
                    while (true) {
                        try {
                            System.out.print("Enter number of bedrooms (1-3): ");
                            newNumberOfBedrooms = scn.nextInt();
                            scn.nextLine();
                            if (newNumberOfBedrooms >= 1 && newNumberOfBedrooms <= 3) {
                                break;
                            } else {
                                System.out.println("Invalid input. Enter 1, 2, or 3.");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input. Enter a number.");
                            scn.nextLine();
                        }
                    }

                    if (tm.updateTenant(oldTenantID, newTenantID, newTenantFirstName, newTenantLastName, newTenantEmail, newApartmentUnit, newNumberOfBedrooms)) {
                        System.out.println("Tenant updated successfully!");
                    } else {
                        System.out.println("Tenant was not updated, please try again!");
                    }
                    break;

                case 5: // Remove a tenant from the system.
                    System.out.print("Enter the tenant ID to remove: ");
                    String tenantToDelete = scn.nextLine();

                    System.out.print("Are you sure you want to remove tenant " + tenantToDelete + " from the system? Yes (y) to delete: ");
                    String confirm = scn.nextLine();

                    if (confirm.equalsIgnoreCase("y")) {
                        if (tm.removeTenant(tenantToDelete)) {
                            System.out.println("Tenant removed successfully.");
                        } else {
                            System.out.println("Tenant with ID " + tenantToDelete + " was not found.");
                        }
                    } else {
                        System.out.println("Invalid, please try again");
                    }
                    break;

                case 6: // Generate Invoice.
                    System.out.print("Enter Tenant ID to generate invoice: ");
                    String invoiceId = scn.nextLine();

                    // Find tenant using for loop and initializing it temporarily.
                    Tenant tenantInvoice = tm.getAllTenants().get(0);
                    boolean tenantFound = false;

                    for (int i = 0; i < tm.getAllTenants().size(); i++) {
                        if (tm.getAllTenants().get(i).getTenantId().equalsIgnoreCase(invoiceId)) {
                            tenantInvoice = tm.getAllTenants().get(i);
                            tenantFound = true;
                            break;
                        }
                    }

                    if (!tenantFound) {
                        System.out.println("Tenant not found.");
                        break;
                    }

                    // Prompt for month.
                    String month;
                    while (true) {
                        System.out.print("Enter month: ");
                        month = scn.nextLine().trim();
                        if (!month.isEmpty()) {
                            break;
                        }
                        System.out.println("Month cannot be empty!");
                    }

                    // Prompt for water used.
                    int waterUsed;
                    while (true) {
                        try {
                            System.out.print("Enter the water used ( in liters): ");
                            waterUsed = Integer.parseInt(scn.nextLine().trim());
                            if (waterUsed >= 0) {
                                break;
                            }
                            System.out.println("Water used cannot be  negative!");
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input! Please enter a valid number.");
                        }
                    }

                    // Generate invoice
                    tm.generateInvoice(tenantInvoice, month, waterUsed);
                    System.out.println("Invoice generated successfully!");
                    break;

                case 7: // Print all the invoices report
                    ArrayList<Invoice> invoices = tm.getAllInvoices();
                    if (invoices.isEmpty()) {
                        System.out.println("No invoices found.");
                        break;
                    }

                    for (int i = 0; i < invoices.size(); i++) {
                        System.out.println("\nInvoice " + (i + 1));
                        invoices.get(i).displayInvoice();
                    }
                    break;

                case 8: // Search for an invoice
                    System.out.print("Enter Tenant ID to search for invoice: ");
                    String searchInvoiceId = scn.nextLine();

                    ArrayList<Invoice> invoicesList = tm.getAllInvoices();
                    boolean invoiceFound = false;

                    for (int i = 0; i < invoicesList.size(); i++) {
                        if (String.valueOf(invoicesList.get(i).getTenantId()).equalsIgnoreCase(searchInvoiceId)) {
                            System.out.println("Invoice for tenant id: " + searchInvoiceId);
                            invoicesList.get(i).displayInvoice();
                            invoiceFound = true;
                            break;
                        }
                    }

                    if (!invoiceFound) {
                        System.out.println("Invoice for Tenant ID: " + searchInvoiceId + " was not found!");
                    }
                    break;

                case 9: // Edit an invoice
                    System.out.print("Enter Tenant ID to edit invoice: ");
                    String tenantIdForInvoice = scn.nextLine().trim();

                    // verify if tenant exists
                    if (!tm.searchTenant(tenantIdForInvoice)) {
                        System.out.println("Tenant with ID " + tenantIdForInvoice + " was not found!");
                        break;
                    }

                    System.out.print("Enter new invoice month: ");
                    String newMonth = scn.nextLine();

                    int newWaterUsed;
                    while (true) {
                        try {
                            System.out.print("Enter new water usage: ");
                            newWaterUsed = scn.nextInt();
                            scn.nextLine();
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input! Please enter a number.");
                            scn.nextLine();
                        }
                    }

                    if (tm.updateInvoice(tenantIdForInvoice, newMonth, newWaterUsed)) {
                        System.out.println("Invoice updated successfully!");
                    } else {
                        System.out.println("No invoice found for that tenant.");
                    }
                    break;

                case 10: // removes an invoice
                    System.out.print("Enter the tenat ID to delete invoice: ");
                    String invoiceToDelete = scn.nextLine();

                    System.out.print("Are you sure you want to delete invoice " + invoiceToDelete + " from the system? Yes (y) to delete: ");
                    String deleteConfirmation = scn.nextLine();

                    if (deleteConfirmation.equalsIgnoreCase("y")) {
                        if (tm.deleteInvoice(invoiceToDelete)) {
                            System.out.println("Invoice deleted successfully.");
                        } else {
                            System.out.println("Invoice with tenant ID " + invoiceToDelete + " was not found.");
                        }
                    } else {
                        System.out.println("Invalid, please try again");
                    }
                    break;

                case 11: // Exit the application, but goes to the main project
                    tm.exitApplication();
                    ProgAssignment.main(null);
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
