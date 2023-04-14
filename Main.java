import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Warga> dataWarga = new ArrayList<Warga>();
        Scanner scanner = new Scanner(System.in);
        int jumlahBeras = 0;
        double jumlahUang = 0;
        double jumlahSedekah = 0;

        // Input data warga
        System.out.println("=== Input Data Warga ===");
        System.out.print("Masukkan jumlah warga yang membayar zakat fitri: ");
        int jumlahWarga = scanner.nextInt();
        for (int i = 0; i < jumlahWarga; i++) {
            System.out.println("Warga " + (i+1));
            System.out.print("Nama: ");
            String nama = scanner.next();
            System.out.print("Alamat: ");
            String alamat = scanner.next();
            System.out.print("Jenis zakat (1: beras, 2: uang): ");
            int jenisZakat = scanner.nextInt();
            System.out.print("Jumlah zakat: ");
            double jumlahZakat = scanner.nextDouble();

            dataWarga.add(new Warga(nama, alamat, jenisZakat, jumlahZakat));
        }

        // Hitung statistik
        int jumlahBerasZakat = 0;
        int jumlahUangZakat = 0;
        for (Warga warga : dataWarga) {
            if (warga.getJenisZakat() == 1) {
                jumlahBeras += warga.getJumlahZakat();
                jumlahBerasZakat++;
            } else {
                jumlahUang += warga.getJumlahZakat();
                jumlahUangZakat++;
            }
        }
        jumlahSedekah = jumlahUangZakat * 35000;

        // Output statistik
        System.out.println("\n=== Statistik Zakat Fitri dan Sedekah ===");
        System.out.println("Jumlah warga yang membayar zakat fitri dengan beras: " + jumlahBerasZakat);
        System.out.println("Jumlah warga yang membayar zakat fitri dengan uang: " + jumlahUangZakat);
        System.out.println("Jumlah beras zakat yang terkumpul: " + jumlahBeras + " Kg");
        System.out.println("Jumlah uang zakat yang terkumpul: Rp " + jumlahUang);
        System.out.println("Jumlah uang sedekah yang terkumpul: Rp " + jumlahSedekah);
    }
}
