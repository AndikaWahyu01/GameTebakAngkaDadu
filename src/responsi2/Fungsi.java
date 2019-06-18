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
//        for (i = 0; i < tebak.length; i++) {
//            do {
//                System.out.print("Masukkan Angka yang Anda Tebak : ");
//                tebak[i] = input.nextInt();
//                if (kesempatan >= 1) {
//                    if (tebak[i] == dadu[i]) {
//                        System.out.println("Selamat ! Anda BENAR");
//                        System.out.println();
//                        break;
//                    } else if (tebak[i] < dadu[i]) {
//                        System.out.println("Angka yang anda masukkan terlalu KECIL.");
//                        System.out.println();
//                    } else if (tebak[i] > dadu[i]) {
//                        System.out.println("Angka yang anda masukkan terlalu BESAR.");
//                        System.out.println();
//                    }
//                    kesempatan--;
//                    System.out.println("Anda Memiliki " + kesempatan + " Kesempatan Lagi");
//                    System.out.println("=======================================");
//                    System.out.println();
//                } else {
//                    System.out.println();
//                    System.out.println("ANDA SALAH, KESEMPATAN TELAH HABIS. SILAHKAN COBA LAGI");
//                    break;
//                }
//            } while (kesempatan > 0);
//        }

    }
}
