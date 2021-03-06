package Driver;

import java.io.*;

class Login {
    // deklarasi
    private String username, password, nama;

    // constructor
    public Login() {
        username = "reza";
        password = "12345678";
        nama = "Reza Herdiansyah";
    }

    public Login(String username, String password, String nama) {
        this.username = username;
        this.password = password;
        this.nama = nama;
    }

    // setter
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // getter
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getNama() {
        return nama;
    }

}

class Menu {
    public static void main(String[] args) throws Exception {
        String my_user, my_password;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // instance of class
        Login user1 = new Login();
        System.out.println("╔════════════════════════════════════════════╗");
        System.out.println("║                  LOGIN                     ║");
        System.out.println("╚════════════════════════════════════════════╝");
        System.out.print("|  Masukan username = ");
        my_user = br.readLine();
        System.out.print("|  Masukan password = ");
        my_password = br.readLine();
        System.out.println("════════════════════════════════════════════");

        if (my_user.equals(user1.getUsername()) && my_password.equals(user1.getPassword())) {
            System.out.println("╔════════════════════════════════════════════╗");
            System.out.println("║               SELAMAT DATANG               ║");
            System.out.println("║        " + user1.getNama() + "             ║");
            System.out.println("╚════════════════════════════════════════════╝");
            SalonLagi.menu();
        } else {
            System.out.println("╔════════════════════════════════════════════╗");
            System.out.println("║                  LOGIN  GAGAL              ║");
            System.out.println("╚════════════════════════════════════════════╝");
            do {
                System.out.println("╔════════════════════════════════════════════╗");
                System.out.println("║                  LOGIN                     ║");
                System.out.println("╚════════════════════════════════════════════╝");
                System.out.print("|  Masukan username = ");
                my_user = br.readLine();
                System.out.print("|  Masukan password = ");
                my_password = br.readLine();
                System.out.println("════════════════════════════════════════════");
            } while (my_user.equals(user1.getUsername()) && my_password.equals(user1.getPassword()));
        }
    }
}