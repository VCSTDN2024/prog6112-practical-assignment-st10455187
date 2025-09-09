/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 * 
 * Reference:
 * Farrell, J. (2019) Java Programming. 9th ed. Boston: Cengage Learning. [Accessed 30 August 2025].
 */
package ProgProperties;

/**
 *
 * @author angel
 */
public class Invoice extends Resident {

    // Fields of an invoice.
    private int bedrooms;
    private double vat;
    private int waterUsed;
    private double levies;
    private double total;
    private String invoiceMonth;
    private double vatRate = 0.15;
    private double waterCostPerUnit = 17.0;
    private double leviesAmount = 650.0;

    // Creating a constructor
    public Invoice(String tenantId, String tenantName, int apartmentUnit, int bedrooms, double rent, int waterUsed, String invoiceMonth) {
        super(tenantId, tenantName, apartmentUnit, rent);
        this.bedrooms = bedrooms;
        this.vat = rent * vatRate;
        this.levies = leviesAmount;
        this.waterUsed = waterUsed;
        this.invoiceMonth = invoiceMonth;
        calculateTotal();
    }

    // Getters and setters
    // tenantId, tenantName, apartmentUnit, and rent are inherited from Resident
    public int getWaterUsed() {
        return waterUsed;
    }

    public void setWaterUsed(int waterUsed) {
        this.waterUsed = waterUsed;
        calculateTotal();
    }

    public void setInvoiceMonth(String invoiceMonth) {
        this.invoiceMonth = invoiceMonth;
    }

    public double getTotal() {
        return total;
    }

    // Calculating the total
    private void calculateTotal() {
        this.total = rent + vat + (waterUsed * waterCostPerUnit) + levies;
    }

    // Display method
    public void displayInvoice() {
        System.out.println(
                "---------------------------------\n"
                        + "Tenant ID: " + tenantId + "\n"
                        + "Tenant Name: " + tenantName + "\n"
                        + "Apartment Unit: " + apartmentUnit + "\n"
                        + "Bedrooms: " + bedrooms + "\n"
                        + "Month: " + invoiceMonth + "\n"
                        + "Rent: R" + rent + "\n"
                        + "VAT (15%): R" + vat + "\n"
                        + "Water Used: " + waterUsed + " x R" + waterCostPerUnit + " = R"
                        + (waterUsed * waterCostPerUnit) + "\n"
                        + "Levies: R" + levies + "\n"
                        + "Total: R" + total + "\n"
                        + "Due Date: 30 " + invoiceMonth + "\n"
                        + "---------------------------------");
    }
}

/*
 *  Reference:
 *  Farrell, J. (2019) Java Programming. 9th ed. Boston: Cengage Learning. [Accessed 30 August 2025].
 */