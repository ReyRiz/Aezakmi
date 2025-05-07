import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<User> users = new ArrayList<>();

    public static void main(String[] args) {
        users.add(new User("admin", "admin123", new Admin()));
        users.add(new User("produsen", "produsen123", new Produsen("produsen")));

        while (true) {
            System.out.println("\n=== SISTEM LOGIN ===");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Keluar");
            System.out.print("Pilih: ");
            
            int pilih = sc.nextInt(); 
            sc.nextLine();


            switch (pilih) {
                case 1:
                    login();
                    break;
                case 2:
                    register();
                    break;
                default:
                    break;
            }
        }
    }

    static void login() {
        System.out.print("ID: ");
        String id = sc.nextLine();
        System.out.print("Password: ");
        String pw = sc.nextLine();

        for (User u : users) {
            if (u.login(id, pw)) {
                System.out.println("Login berhasil sebagai " + u.getRole().getClass().getSimpleName());
                u.akses();
                return;
            }
        }
        System.out.println("Login gagal. ID atau Password salah.");
    }

    static void register() {
        System.out.print("ID baru: ");
        String id = sc.nextLine();
        System.out.print("Password baru: ");
        String pw = sc.nextLine();

        System.out.print("Role (admin/produsen): ");
        String role = sc.nextLine();

        if (role.equalsIgnoreCase("admin")) {
            users.add(new User(id, pw, new Admin()));
        } else if (role.equalsIgnoreCase("produsen")) {
            users.add(new User(id, pw, new Produsen(id)));
        } else {
            System.out.println("Role tidak valid.");
        }
    }
}