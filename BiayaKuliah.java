/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import java.util.Scanner;

/**
 *
 * @author revin
 */
public class Tugas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String jalur, nilai;

        System.out.println("pilih jalur yang dipilih :");
        System.out.print("1.SNMPTN\n2.SBMPTN\n3.MANDIRI");
        jalur = input.next();

        if (jalur.equalsIgnoreCase("SNMPTN")) {
            System.out.println("pilih golongan pendaftaran : \nA \nB \nC");
            nilai = input.next();
            if (nilai.equalsIgnoreCase("A")) {
                System.out.println("DSP = 5 JUTA");
                System.out.println("SPP = 500 RIBU");
            } else if (nilai.equalsIgnoreCase("B")) {
                System.out.println("DSP = 15 JUTA");
                System.out.println("SPP = 1 JUTA");
            } else if (nilai.equalsIgnoreCase("C")) {
                System.out.println("DSP = 30 JUTA");
                System.out.println("SPP = 2 JUTA");
            } else {
                System.out.println("Golongan Pendaftaram tidak di temukan");
            }

        } else if (jalur.equalsIgnoreCase("SBMPTN")) {
            System.out.println("pilih golongan pendaftaran: \nA\nB\nC");
            nilai = input.next();
            if (nilai.equalsIgnoreCase("A")) {
                System.out.println("DSP = 5 JUTA");
                System.out.println("SPP = 500 RIBU");
            } else if (nilai.equalsIgnoreCase("B")) {
                System.out.println("DSP = 15 JUTA");
                System.out.println("SPP = 1 JUTA");
            } else if (nilai.equalsIgnoreCase("C")) {
                System.out.println("DSP = 30 JUTA");
                System.out.println("SSP = 2 JUTA");
            } else {
                System.out.println("Golongan Pendaftaram tidak di temukan");
            }
        } else if (jalur.equalsIgnoreCase("MANDIRI")) {
            System.out.println("pilih golongan pendaftaran: \nA\nB\nC");
            nilai = input.next();
            if (nilai.equalsIgnoreCase("A")) {
                System.out.println("DSP = 10 JUTA");
                System.out.println("SPP = 1 JUTA");
            } else if (nilai.equalsIgnoreCase("B")) {
                System.out.println("DSP = 25 JUTA");
                System.out.println("SPP = 2 JUTA");
            } else if (nilai.equalsIgnoreCase("C")) {
                System.out.println("DSP = 50 JUTA");
                System.out.println("SPP = 3 JUTA");
            } else {
                System.out.println("Golongan Pendaftaram tidak di temukan");
            }
        } else {
            System.out.println("Jalur tidak ditemukan");
        }

    }

}
