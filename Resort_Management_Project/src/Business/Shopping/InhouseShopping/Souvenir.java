/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Shopping.InhouseShopping;

/**
 *
 * @author siddh
 */
public class Souvenir {

    String souvenirId;
    String souvenirName;
    Double price;

    public String getSouvenirId() {
        return souvenirId;
    }

    public void setSouvenirId(String souvenirId) {
        this.souvenirId = souvenirId;
    }

    public String getSouvenirName() {
        return souvenirName;
    }

    public void setSouvenirName(String souvenirName) {
        this.souvenirName = souvenirName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return souvenirId;
    }
}
