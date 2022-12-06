/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.FoodandBev.Menu;

/**
 *
 * @author siddh
 */
public class FBItem {
    String fbItemId;
    String category;
    String fbName;
    Double price;

    public String getFbItemId() {
        return fbItemId;
    }

    public void setFbItemId(String fbItemId) {
        this.fbItemId = fbItemId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getFbName() {
        return fbName;
    }

    public void setFbName(String fbName) {
        this.fbName = fbName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    
    @Override
    public String toString() {
        return fbItemId;
    }
}
