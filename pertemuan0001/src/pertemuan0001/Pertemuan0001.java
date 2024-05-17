/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan0001;

import java.util.Scanner;

/**
 *
 * @author 2201010020_GungNadita
 * tgl: 2024-03-28
 */
public class Pertemuan0001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //meminta input alas dan tinggi dari user
        System.out.print("Masukkan alas segitiga: ");
            double alas = scanner.nextDouble();
        System.out.println("Masukkan nilai tinggi segitiga: ");
            double tinggi = scanner.nextDouble();
            
        //Menghitung Luas Segitiga
        double luas =0.5*alas*tinggi;
         
        //Menampilkan Hasil Luas Segitiga
        
        System.out.println("Luas segitiga dengan alas" + alas +"dan tinggi" + tinggi +"adalah"+ luas);
    }
    
}
