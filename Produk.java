import java.util.Scanner;
import java.util.ArrayList;

public class Produk {
    private String nama;
    private int jumlah;
    private double harga;

    public Produk(String nama, int jumlah, double harga) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    public String getNama() { return nama; }
    public int getJumlah() { return jumlah; }
    public double getHarga() { return harga; }

    public void setNama(String nama) { this.nama = nama; }
    public void setJumlah(int jumlah) { this.jumlah = jumlah; }
    public void setHarga(double harga) { this.harga = harga; }

    static Scanner sc = new Scanner(System.in);

    public static void tambahProduk(ArrayList<Produk> list) {
        System.out.print("Nama Produk: ");
        String nama = sc.nextLine();
        System.out.print("Jumlah: ");
        int jumlah = sc.nextInt(); sc.nextLine();
        System.out.print("Harga: ");
        double harga = sc.nextDouble(); sc.nextLine();
        list.add(new Produk(nama, jumlah, harga));
        System.out.println("Produk berhasil ditambahkan.");
    }

    public static void lihatProduk(ArrayList<Produk> list) {
        System.out.println("-- Daftar Produk --");
        for (int i = 0; i < list.size(); i++) {
            Produk p = list.get(i);
            System.out.println((i + 1) + ". " + p.getNama() + " | Jumlah: " + p.getJumlah() + " | Harga: Rp" + (p.getHarga() * p.getJumlah()));
        }
    }

    public static void editProduk(ArrayList<Produk> list) {
        lihatProduk(list);
        System.out.print("Pilih nomor produk yang akan diubah: ");
        int idx = sc.nextInt(); sc.nextLine();
        Produk p = list.get(idx - 1);

        System.out.print("Nama baru: ");
        String nama = sc.nextLine();
        System.out.print("Jumlah baru: ");
        int jumlah = sc.nextInt(); sc.nextLine();
        System.out.print("Harga baru: ");
        double harga = sc.nextDouble(); sc.nextLine();

        p.setNama(nama);
        p.setJumlah(jumlah);
        p.setHarga(harga);
        System.out.println("Produk berhasil diperbarui.");
    }

    public static void hapusProduk(ArrayList<Produk> list) {
        lihatProduk(list);
        System.out.print("Pilih nomor produk yang akan dihapus: ");
        int idx = sc.nextInt(); sc.nextLine();
        list.remove(idx - 1);
        System.out.println("Produk berhasil dihapus.");
    }
}
