import java.util.Scanner;
public class Tugas27 {
    public static void main(String[] args) {
        Scanner input27 = new Scanner(System.in);
        String jenisBuku;
        int jumlahBuku, totalBayar, hargaAwal;
        double hargaBuku = 20000, totalDiskon = 0, jumlahDiskon;

        System.out.print("Jenis Buku: ");
        jenisBuku = input27.nextLine();
        System.out.print("Jumlah Buku: ");
        jumlahBuku = input27.nextInt();

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            if (jumlahBuku > 2) {
                totalDiskon = 0.12;
            } else if(jumlahBuku <= 2) {
                totalDiskon = 0.1;
            }
            hargaAwal = (int) (jumlahBuku*hargaBuku);
            System.out.println("Harga Buku: " + hargaAwal);

            jumlahDiskon = (int) (hargaBuku*totalDiskon) * jumlahBuku;
            System.out.println("Jumlah Diskon: " + jumlahDiskon);

            totalBayar = (int) ((hargaBuku*jumlahBuku) - jumlahDiskon);
            System.out.println("Total Bayar setelah diskon: " + totalBayar);

        }else if (jenisBuku.equalsIgnoreCase("novel")) {
            if (jumlahBuku > 3) {
                totalDiskon = 0.09;
            } else if (jumlahBuku >= 1 && jumlahBuku <= 3) {
                totalDiskon = 0.08;
            } else {
                totalDiskon = 0.05;
            }
            hargaAwal = (int) (jumlahBuku*hargaBuku);
            System.out.println("Harga Buku: " + hargaAwal);

            jumlahDiskon = (int) (hargaBuku*totalDiskon) * jumlahBuku;
            System.out.println("Jumlah Diskon: " + jumlahDiskon);

            totalBayar = (int) ((hargaBuku*jumlahBuku) - jumlahDiskon);
            System.out.println("Total Bayar setelah diskon: " + totalBayar);
        } else {
            if (jumlahBuku > 3) {
                totalDiskon = 0;
            }
            totalBayar = (int)(jumlahBuku*hargaBuku);
            System.out.println("Harga pembelian buku: " + totalBayar);   
        }
    }
}
