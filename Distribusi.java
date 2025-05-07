import java.util.Scanner;
import java.util.ArrayList;

public class Distribusi {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> laporan = new ArrayList<>();

    public static void tambahDistribusi() {
        System.out.print("Masukkan nama produk: ");
        String produk = sc.nextLine();

        System.out.print("Tujuan Distribusi: ");
        String tujuan = sc.nextLine();

        System.out.print("Biaya Distribusi: ");
        double biaya = sc.nextDouble(); sc.nextLine();

        String lap = "Produk: " + produk +
                     ", Tujuan: " + tujuan +
                     ", Biaya: Rp" + biaya;
        laporan.add(lap);
        System.out.println("Distribusi berhasil dicatat.");
    }

    public static void laporanDistribusi() {
        System.out.println("\n-- Laporan Distribusi --");
        for (String l : laporan) {
            System.out.println(l);
        }
    }
}

