/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProgProperties;

/**
 *
 * @author angel
 */
public class Tenant {

    // Fields for a tenant
    private String tenantId;
    private String firstName;
    private String lastName;
    private String tenantEmail;
    private int apartmentUnit;
    private int apartmentType;
    private double rent;

    // Creating a constructor
    public Tenant(String tenantId, String firstName, String lastName, String tenantEmail, int apartmentUnit, int apartmentType) {
        this.tenantId = tenantId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.tenantEmail = tenantEmail;
        this.apartmentUnit = apartmentUnit;
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
    }

    // Getters and setters
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

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

    public int getApartmentUnit() {
        return apartmentUnit;
    }

    public void setApartmentUnit(int apartmentUnit) {
        this.apartmentUnit = apartmentUnit;
    }

    public int getApartmentType() {
        return apartmentType;
    }

    public void setApartmentType(int apartmentType) {
        this.apartmentType = apartmentType;
    }

    public double getRent() {
        return rent;
    }

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
