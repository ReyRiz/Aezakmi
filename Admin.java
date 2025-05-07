import java.util.Scanner;

public class Admin extends Role {
    static Scanner sc = new Scanner(System.in);

    @Override
    public void aksesFitur() {
        while (true) {
            System.out.println("\n-- MENU ADMIN --");
            System.out.println("1. Distribusi Produk");
            System.out.println("2. Lihat Laporan Distribusi");
            System.out.println("3. Kembali");
            System.out.print("Pilih: ");
            int pilih = sc.nextInt(); sc.nextLine();

            if (pilih == 1) Distribusi.tambahDistribusi();
            else if (pilih == 2) Distribusi.laporanDistribusi();
            else break;
        }
    }
}