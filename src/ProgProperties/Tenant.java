/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 * 
 *  References:
 *  Copilot. (2025). GitHub Copilot (GPT-4.1 version). https://copilot.github.com [Accessed 9 September 2025].
 *  Farrell, J. (2019) Java Programming. 9th ed. Boston: Cengage Learning. [Accessed 30 August 2025].
 */
package ProgProperties;

/**
 *
 * @author angel
 */
public class Tenant extends Resident {

    // Fields for a tenant
    private String firstName;
    private String lastName;
    private String tenantEmail;
    private int apartmentType;

    // Creating a constructor
    public Tenant(String tenantId, String firstName, String lastName, String tenantEmail, int apartmentUnit, int apartmentType) {
        super(tenantId, firstName + " " + lastName, apartmentUnit, 0.0);
        this.firstName = firstName;
        this.lastName = lastName;
        this.tenantEmail = tenantEmail;
        this.apartmentType = apartmentType;

        // Assign rent based on number of bedrooms
        switch (apartmentType) {
            case 1:
                this.rent = 7500.0;
                break;
            case 2:
                this.rent = 10000.0;
                break;
            case 3:
                this.rent = 13000.0;
                break;
            default:
                break;
        }
        super.setRent(this.rent);
    }

    // Getters and setters
    // tenantId, apartmentUnit, and rent are inherited from Resident
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String surname) {
        this.lastName = surname;
    }

    public String getTenantEmail() {
        return tenantEmail;
    }

    public void setTenantEmail(String email) {
        this.tenantEmail = email;
    }

    // apartmentUnit is inherited from Resident

    public int getApartmentType() {
        return apartmentType;
    }

    public void setApartmentType(int apartmentType) {
        this.apartmentType = apartmentType;
        // Update rent when apartment type changes. I got assistance from Copilot for this.
        switch (apartmentType) {
            case 1:
                this.rent = 7500.0;
                break;
            case 2:
                this.rent = 10000.0;
                break;
            case 3:
                this.rent = 13000.0;
                break;
            default:
                break;
        }
        super.setRent(this.rent);
    }
    // rent is inherited from Resident

    // Display tenant details
    public void displayTenant() {
        System.out.println("---------------------------------");
        System.out.println("Tenant ID: " + tenantId);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Email: " + tenantEmail);
        System.out.println("Apartment Unit: " + apartmentUnit);
        System.out.println("Bedrooms: " + apartmentType);
        System.out.println("Rent: R" + rent);
        System.out.println("---------------------------------");
    }
}

/*
 *  References:
 *  Copilot. (2025). GitHub Copilot (GPT-4.1 version). https://copilot.github.com [Accessed 9 September 2025].
 *  Farrell, J. (2019) Java Programming. 9th ed. Boston: Cengage Learning. [Accessed 30 August 2025].
 */