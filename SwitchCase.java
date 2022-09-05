/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchcase;

import java.util.Scanner;

/**
 *
 * @author revin
 */
public class SwitchCase {
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
        
        String makanan;
        
        System.out.println("Masukan menu makanannya : ");
        makanan = input.nextLine();
        
        switch (makanan){
            case "pizza":
                    System.out.println("Harga makanan Rp.15.000");
                    break;
            case "burger":
                System.out.println("Harga makanan Rp.10.000");
                break;
            case "kebab":
                System.out.println("Harga makanan Rp.8.000");
                break;
        }
    }
    
}
