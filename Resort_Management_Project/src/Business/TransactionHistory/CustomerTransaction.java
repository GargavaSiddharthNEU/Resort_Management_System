/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.TransactionHistory;

/**
 *
 * @author Subbu
 */
public class CustomerTransaction {
    
    String userId;
    String facilityUsed;
    Float price;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFacilityUsed() {
        return facilityUsed;
    }

    public void setFacilityUsed(String facilityUsed) {
        this.facilityUsed = facilityUsed;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
    
}
