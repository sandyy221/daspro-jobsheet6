import java.util.Scanner;
public class Tugas27 {
    public static void main(String[] args) {
        Scanner input27 = new Scanner(System.in);
        String jenisBuku;
        int jumlahBuku, totalBayar, hargaAwal;
        double hargaBuku = 20000, totalDiskon = 0;

        System.out.print("Jenis Buku: ");
        jenisBuku = input27.nextLine();
        System.out.print("Jumlah Buku: ");
        jumlahBuku = input27.nextInt();

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            if (jumlahBuku >= 2) {
                totalDiskon = 0.12;
            } else if (jumlahBuku <= 2) {
                totalDiskon = 0.1;
            }
            hargaAwal = (int) (jumlahBuku*hargaBuku);
            System.out.println("Harga Buku: " + hargaAwal);
            totalBayar = (int) (hargaBuku - (totalDiskon*hargaBuku));
            System.out.println("Total Bayar setelah diskon: " + totalBayar);
            
        }
    }
}
