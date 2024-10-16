import java.util.Scanner;

/**
 * KafeDoWhile15
 */
public class KafeDoWhile15 {

    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in);

        int kopi, teh, roti, totalHarga;
        int hargaKopi = 12000;
        int hargaTeh = 7000;
        int hargaRoti = 20000;
        String namaPelanggan;

        do { 
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");  
            namaPelanggan = input15.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
            System.out.println("Transaksi dibatalkan.");
            break;
        }
        System.out.print("Jumlah kopi: ");
        kopi = input15.nextInt();
        System.out.print("Jumlah teh: ");
        teh = input15.nextInt();
        System.out.print("Jumlah roti: ");
        roti = input15.nextInt();
        totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
        System.out.println("Total yang harus dibayar: Rp " + totalHarga);
        input15.nextLine();
        } while (true);

        System.out.println("Semua transaksi selesai. ");
    }
}