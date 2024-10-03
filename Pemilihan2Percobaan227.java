import java.util.Scanner;
public class Pemilihan2Percobaan227 {
    public static void main(String[] args) {
        Scanner input27 = new Scanner(System.in);
        String member;
        int pilihan_menu;
        double harga, totalBayar, diskon;

        System.out.println("----------------------------------");
        System.out.println("========== MENU KAFE JTI==========");
        System.out.println("----------------------------------");
        System.out.println("1. Rice Bowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Rice Bowl + Ice Tea)");
        System.out.println("----------------------------------");
        System.out.print("Masukan angka dari menu yang dipilih = ");
        pilihan_menu = input27.nextInt();
        input27.nextLine();
        System.out.print("Apakah punya member y/n ? = ");
        member = input27.nextLine();
        System.out.println("----------------------------------");

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga Rice Bowl = " + harga);
                
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);
                
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga Paket Bundling = " + harga);
                
            } else {
                System.out.println("Masukan pilihan menu dengan benar");
                return;
            }
        totalBayar = harga - (harga*diskon);
        System.out.println("Total bayar setelah diskon = " + totalBayar);

            
        } else if (member.equalsIgnoreCase("n")) {
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga Rice Bowl = " + harga);
                
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);
                
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga Paket Bundling = " + harga);
                
            } else {
                System.out.println("Masukan pilihan menu dengan benar");
                return;
            }
        System.out.println("Total bayar = " + harga);

        } else {
            System.out.println("Member tidak valid");
        }
        System.out.println("---------------------------------");

        
    }
}