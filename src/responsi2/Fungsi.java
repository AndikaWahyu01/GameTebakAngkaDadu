package responsi2;

import java.util.Scanner;

public class Fungsi {

    Scanner input = new Scanner(System.in);
    int JD, acak, kesempatan, i, x, total, dadu;
    int[] tebak;

    public void Dadu(int total, int JD) {
        do {
            System.out.print("Tentukan Jumlah Dadu [MAX 3 DADU]: ");
            JD = input.nextInt();
            tebak = new int[JD];
            x = 6;
            total = JD * x;
            for (i = 0; i < JD; i++) {
                do {
                    acak = (int) (Math.random() * total);
                    if (acak < JD) {
                        acak = (int) (Math.random() * total);
                    }
                } while (acak == 0);
                dadu = acak;
            }
        } while (JD < 1 || JD > 3);
    }

    public void kesempatan() {
        kesempatan = 3;
        System.out.println("");
        System.out.println("Mari Menebak Angka Dadu dengan " + kesempatan + "x Kesempatan");
    }

    public void tebakdadu() {
        for (i = 0; i < kesempatan; i++) {
            System.out.println("");

            do {
                System.out.print("Masukkan Angka yang Anda Tebak : ");
                tebak[i] = input.nextInt();
                if (kesempatan > 0) {
                    if (tebak[i] == dadu) {
                        System.out.println("Selamat! Angka yang anda masukkan BENAR.");
                        kesempatan = 1;
                        break;
                    }
                    if (tebak[i] < dadu) {
                        System.out.println("Angka yang anda masukkan terlalu KECIL.");
                    } else if (tebak[i] > dadu) {
                        System.out.println("Angka yang anda masukkan terlalu BESAR.");
                    }
                    kesempatan--;
                    System.out.println("Anda Memiliki " + kesempatan + " Kesempatan Lagi");
                    System.out.println("---------------------------------------------------");
                }
                if (kesempatan == 0) {
                    System.out.println("---------------------------------------------------");
                    System.out.println("ANDA SALAH!!KESEMPATAN TELAH HABIS. SILAHKAN COBA LAGI");
                    System.out.println("ANGKA YANG DIMAKSUD ADALAH " + dadu);
                    System.out.println("---------------------------------------------------");
                    break;
                }
            } while (kesempatan >= 0);
        }
    }
}
