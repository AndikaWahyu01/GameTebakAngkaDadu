package responsi2;

import java.util.Scanner;

public class Fungsi {

    Scanner input = new Scanner(System.in);
    int JD, total, acak, kesempatan, i, x;
    int[] dadu;
    int[] tebak;

    public void Dadu(int total, int JD) {
        System.out.print("Tentukan Jumlah Dadu : ");
        JD = input.nextInt();
        dadu = new int[JD];
        tebak = new int[JD];
        x = 6;
        for (i = 0; i < JD; i++) {
            do {
                acak = (int) (Math.random() * x);
                if (acak < JD) {
                    acak = (int) (Math.random() * x);
                }
            } while (acak == 0);
            dadu[i] = acak;
        }
        System.out.println("ANGKA YANG DIMAKSUD ADALAH");
        for (i = 0; i < JD; i++) {
            System.out.print(dadu[i] + " ");
        }
    }

    public void kesempatan() {
        kesempatan = 3;
        System.out.println("Mari Menebak Angka Dadu dengan " + (kesempatan) + "x Kesempatan");
        System.out.println();
    }

    public void tebakdadu() {
    }
}
