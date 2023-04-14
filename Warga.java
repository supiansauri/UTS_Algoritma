public class Warga {
    private String nama;
    private String alamat;
    private int jenisZakat; // 1: beras, 2: uang
    private double jumlahZakat;

    public Warga(String nama, String alamat, int jenisZakat, double jumlahZakat) {
        this.nama = nama;
        this.alamat = alamat;
        this.jenisZakat = jenisZakat;
        this.jumlahZakat = jumlahZakat;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getJenisZakat() {
        return jenisZakat;
    }

    public double getJumlahZakat() {
        return jumlahZakat;
    }
}
