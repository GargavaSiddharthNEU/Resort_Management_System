/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Shopping.InhouseShopping;

import java.util.ArrayList;

/**
 *
 * @author siddh
 */
public class SouvenirDirectory {
    ArrayList<Souvenir> souvenirDirectory;

    public SouvenirDirectory() {
        this.souvenirDirectory = new ArrayList<Souvenir>();
    }
    
    public ArrayList<Souvenir> getSouvenirDirectory() {
        return souvenirDirectory;
    }

    public void setSouvenirDirectory(ArrayList<Souvenir> souvenirDirectory) {
        this.souvenirDirectory = souvenirDirectory;
    }
        
    public void addNewSouvenirData(Souvenir sv) {
        this.souvenirDirectory.add(sv);
    }
    
    public Souvenir getSouvenirByName(String souvenirName) {

        Souvenir selectedSouvenir = new Souvenir();
        for (Souvenir souvenir : souvenirDirectory) {
            if (souvenir.getSouvenirName().equals(souvenirName)) {
                selectedSouvenir = souvenir;
                break;
            }
        }
        return selectedSouvenir;
    }
}
