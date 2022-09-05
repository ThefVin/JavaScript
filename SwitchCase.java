
import java.util.Scanner;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author revin
 */
public class coba {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
         int jumlah,makanan,total,uang,kembalian = 0, pizza =15000, burger=10000 ,kebab=8000;
        
        System.out.println("pilih nomor makanan");
        System.out.print("1.Pizza dengan harga =15.000\n2.burger dengan harga = 10.000\n3.kebab dengan harga = 8.000  "
                + "pilih angka makanan yang anda mau = ");
        makanan = input.nextInt();
        
        System.out.print("masukkan jumlah makanan =");
        jumlah = input.nextInt();
        
        System.out.print("Masukkan jumlah uang anda =");
        uang = input.nextInt();
        
        total = pizza*jumlah;
        
        switch (makanan){
            case 1: 
                System.out.println("Harga total makanan anda adalah : "+pizza*jumlah);
                break;
            case 2: 
                System.out.println("Harga total makanan anda adalah : "+burger*jumlah);
                break;
            case 3: 
                System.out.println("Harga total makanan anda adalah : "+kebab*jumlah);
                break;
        }
        if(uang>=total){
                kembalian = uang-total;
                System.out.println("kembalian anda: "  +kembalian);
            }
            else {
                System.out.println("MAAF UANG ANDA KURANG!!");
            }    
    }
        
}
