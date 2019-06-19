package responsi2;

import java.util.Scanner;

public class Fungsi {

    Scanner input = new Scanner(System.in);
    int JD, acak, kesempatan, i, x;
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
    }

    public void kesempatan() {
        kesempatan = 3;
        System.out.println("Mari Menebak Angka Dadu dengan " + kesempatan + "x Kesempatan");
    }

    public void tebakdadu() {
        for (i = 0; i < dadu.length; i++) {
            System.out.println("");
            System.out.println("Dadu ke-" + (i + 1));
            do {
                System.out.print("Masukkan Angka yang Anda Tebak : ");
                tebak[i] = input.nextInt();
                if (kesempatan > 0) {
                    if (tebak[i] == dadu[i]) {
                        System.out.println("Selamat! Angka yang anda masukkan BENAR.");
                        break;
                    } else if (tebak[i] < dadu[i]) {
                        System.out.println("Angka yang anda masukkan terlalu KECIL.");
                    } else if (tebak[i] > dadu[i]) {
                        System.out.println("Angka yang anda masukkan terlalu BESAR.");
                    }
                    kesempatan--;
                    System.out.println("Anda Memiliki " + kesempatan + " Kesempatan Lagi");
                    System.out.println("---------------------------------------------------");
                }
                if (kesempatan == 0) {
                    System.out.println("---------------------------------------------------");
                    System.out.println("ANDA SALAH!!KESEMPATAN TELAH HABIS. SILAHKAN COBA LAGI");
                    System.out.println("ANGKA YANG DIMAKSUD ADALAH " + dadu[i]);
                    System.out.println("---------------------------------------------------");
                    break;
                }
            } while (kesempatan > 0);
        }
    }
}
