package responsi2;

import java.util.Scanner;

public class Responsi2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pilihan;
        boolean ulang = true;
        int total = 0, JD = 0;

        Fungsi obj = new Fungsi();
        do {
            obj.Dadu(total, JD);
            obj.kesempatan();
            obj.tebakdadu();
            System.out.println();
            System.out.println("Apakah Anda Ingin Mengulang? (Y/N)");
            pilihan = input.next();

            if ("Y".equalsIgnoreCase(pilihan)) {
                ulang = true;
            } else if ("N".equalsIgnoreCase(pilihan)) {
                ulang = false;
            } else {
                do {
                    System.out.println("Apakah Anda Ingin Mengulang? (Y/N)");
                    pilihan = input.next();

                } while (!pilihan.equalsIgnoreCase("Y") && !pilihan.equalsIgnoreCase("N"));
                if ("N".equalsIgnoreCase(pilihan)) {
                    ulang = false;
                }
            }
        } while (ulang == true);
    }
}
