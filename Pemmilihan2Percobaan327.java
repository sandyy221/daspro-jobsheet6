import java.util.Scanner;
public class Pemmilihan2Percobaan327 {
    public static void main(String[] args) {
        Scanner input27 = new Scanner(System.in);
        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;

        System.out.print("Masukan Kategori: ");
        kategori = input27.nextLine();
        System.out.print("Masukan Besarnya Penghasilan: ");
        penghasilan = input27.nextInt();

        if (kategori.equals("pekerja")) {
            if (penghasilan <= 2000000) {
                pajak = 0.1;
            } else if (penghasilan <= 3000000) {
                pajak = 0.15;
            } else {
                pajak = 0.2;
            }

            gajiBersih = (int) (penghasilan - (pajak*penghasilan));
            System.out.println("Penghasilan Bersih: " + gajiBersih); 
            
        } else if (kategori.equals("pebisnis")) {
            if (penghasilan <= 2500000) {
                pajak = 0.15;
            } else if (penghasilan <= 3500000) {
                pajak = 0.2;
            } else {
                pajak = 0.25;
            }

            gajiBersih = (int) (penghasilan - (pajak*penghasilan));
            System.out.println("Penghasilan Bersih: " + gajiBersih);
        } else {
            System.out.println("Masukan Kategori Salah");

        }
    }
}
