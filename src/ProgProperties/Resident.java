/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProgProperties;

/**
 *
 * @author angel
 */

public class Resident {

    // Fields for a resident.
    protected String tenantId;
    protected String tenantName;
    protected int apartmentUnit;
    protected double rent;

    // Creating a constructor
    public Resident(String tenantId, String tenantName, int apartmentUnit, double rent) {
        this.tenantId = tenantId;
        this.tenantName = tenantName;
        this.apartmentUnit = apartmentUnit;
        this.rent = rent;
    }

    // Getters and setters
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public int getApartmentUnit() {
        return apartmentUnit;
    }

    public void setApartmentUnit(int apartmentUnit) {
        this.apartmentUnit = apartmentUnit;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }
}
