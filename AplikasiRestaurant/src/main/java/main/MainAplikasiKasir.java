/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import com.azmi.aplikasirestaurant.classes.DaftarMenu;
import com.azmi.aplikasirestaurant.classes.Ramen;


/**
 *
 * @author azmi
 */


public class MainAplikasiKasir {   
    public DaftarMenu daftarMenu;
    
    public static void main(String[] args) {}
    
    public void generateDaftarMenu() { 
        daftarMenu = new DaftarMenu();
        daftarMenu.tambahMenu(new Ramen("Ramen Seafood", 25000));
        daftarMenu.tambahMenu(new Ramen("Ramen Original", 18000));
        daftarMenu.tambahMenu(new Ramen("Ramen Vegetarian", 22000));
        daftarMenu.tambahMenu(new Ramen("Ramen Karnivor", 28000));
        daftarMenu.tambahMenu(new Kuah("Ramen Orisinil", 25000));
        daftarMenu.tambahMenu(new Kuah("Ramen Seafood", 25000));
        daftarMenu.tambahMenu(new Kuah("Ramen Seafood", 25000));
        daftarMenu.tambahMenu(new Kuah ("Ramen Seafood", 25000));
        daftarMenu.tambahMenu(new Ramen("Ramen Seafood", 25000));
        daftarMenu.tambahMenu(new Ramen("Ramen Seafood", 25000));
        daftarMenu.tambahMenu(new Ramen("Ramen Seafood", 25000));
        daftarMenu.tambahMenu(new Ramen("Ramen Seafood", 25000));
        daftarMenu.tambahMenu(new Ramen("Ramen Seafood", 25000));
        
        
        
    }

    
    
}
