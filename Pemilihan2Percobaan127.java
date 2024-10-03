import java.util.Scanner;
public class Pemilihan2Percobaan127 {

    public static void main(String[] args) {
        Scanner input27 = new Scanner(System.in);
        int tahun;
        System.out.print("Masukan tahun: ");
        tahun = input27.nextInt();
        
        if ((tahun % 4) != 0) {
            if ((tahun % 100) != 0);
            System.out.println("Tahun kabiset");
        }   else
            System.out.println("Bukan tahun kabiset");

    }
}