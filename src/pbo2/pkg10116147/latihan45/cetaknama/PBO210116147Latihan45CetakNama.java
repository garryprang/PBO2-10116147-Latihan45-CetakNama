/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116147.latihan45.cetaknama;

import java.util.Scanner;

/**
 * @author 
 * Nama      : Garry Prang
 * Kelas     : PBO2
 * NIM       : 10116147
 * Deskripsi : Program untuk mencetak nama yang sudah dimasukkan.
 */

public class PBO210116147Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Printer cetakNama = new Printer();
        
        System.out.println("======= Aplikasi Pencetak Nama ========");
        System.out.print("Masukkan nama anda: ");
        String inputNama = "";
        inputNama+=scanner.nextLine();
        cetakNama.setNama(inputNama);
        String nama = cetakNama.getNama();
        
        System.out.print("Mau cetak nama berapa kali? ");
        cetakNama.setJmlCetak(scanner.nextInt());
        int jmlCetak = cetakNama.getJmlCetak();
        scanner.close();
        
        cetakNama.cetak(nama);
        cetakNama.cetak(jmlCetak, nama);
    }
    
}