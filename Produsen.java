import java.util.Scanner;
import java.util.ArrayList;

public class Produsen extends Role {
    static Scanner sc = new Scanner(System.in);
    private ArrayList<Produk> produkSaya = new ArrayList<>();
    private String namaProdusen;

    public Produsen(String namaProdusen) {
        this.namaProdusen = namaProdusen;
    }

    @Override
    public void aksesFitur() {
        while (true) {
            System.out.println("\n-- MENU PRODUSEN --");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Lihat Produk");
            System.out.println("3. Edit Produk");
            System.out.println("4. Hapus Produk");
            System.out.println("5. Kembali");
            System.out.print("Pilih: ");
            int pilih = sc.nextInt(); sc.nextLine();

            if (pilih == 1) Produk.tambahProduk(produkSaya);
            else if (pilih == 2) Produk.lihatProduk(produkSaya);
            else if (pilih == 3) Produk.editProduk(produkSaya);
            else if (pilih == 4) Produk.hapusProduk(produkSaya);
            else break;
        }
    }

    public ArrayList<Produk> getProdukSaya() {
        return produkSaya;
    }
}