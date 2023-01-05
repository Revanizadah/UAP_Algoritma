/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uap_remidi;

import java.util.Scanner;

/**
 *
 * @author Revani Zadah
 */
public class UAP_REMIDI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in); 
        String nim,nama;
        String jurusan = " ";
        String pilihan;
        int tahun;
        
        do {    
        System.out.print("Masukkan NIM : ");
        nim = in.nextLine();
        System.out.print("Masukkan Nama : ");
        nama = in.nextLine();
        System.out.println();
        System.out.println("NIM = " + nim );
        System.out.println("NAMA = " + nama);
        
        String [] Character = nim.split("\\.");
        tahun = Integer.parseInt(Character[0]);
        
        System.out.println("Tahun Ajaran Masuk = "+ "20" + tahun + "-20" + (tahun + 1));
        
        switch (Character[1]) {
            case "31": jurusan = "D3 Sistem Informasi";
            break;
            case "51": jurusan = "S1 Sistem Informasi";
            break;
            case "52": jurusan = "S1 Teknologi Informasi";
            break;
            default: jurusan = "Jurusan Anda Tidak Ditemukan";
            break;
        }
        
        System.out.println("Jurusan = " + jurusan);
        System.out.println("No Urut Masuk = " + Character[2].replaceFirst("^0+(?!$)"," "));       
        System.out.println("Apakah Anda Ingin Memasukkan Data Lagi [ya/tidak]: ");
        pilihan = in.nextLine();
        }while (pilihan.equals("ya"));
        System.exit(0);
    
    }
    
}
