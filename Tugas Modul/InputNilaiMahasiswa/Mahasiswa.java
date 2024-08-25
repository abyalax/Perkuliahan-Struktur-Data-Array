package InputNilaiMahasiswa;

/**
 * Objek mahasiswa memiliki atribut nama, npm dan nilai
 * 
 */
public class Mahasiswa {
    private String nama;
    private int npm;
    private int nilai;

    // Constructor
    public Mahasiswa() {

    }

    public Mahasiswa(String nama, int npm, int nilai) {
        this.nama = nama;
        this.npm = npm;
        this.nilai = nilai;
    }

    // Method untuk menambahkan nilai berdasarkan index
    public void addNama(String newNama) {
        System.out.print("\n" + nama);
        nama = newNama;
        System.out.println(" sudah diupdate namanya menjadi: " + newNama + "\n");
    }

    public void addNilai(int newNilai) {
        this.nilai = newNilai;
        System.out.println("\n" + this.nama + " sudah diupdate niainya menjadi: " + this.nilai + "\n");
    }

    public void addNpm(int newNpm) {
        this.npm = newNpm;
        System.out.println("\n" + this.nama + " sudah diupdate npmnya menjadi: " + this.npm + "\n");
    }

    public int getNpm() {
        return this.npm;
    }

    public int getNilai() {
        return this.nilai;
    }

    public String getNama() {
        return this.nama;
    }

    @Override
    public String toString() {
        return "Nilai Mahasiswa NPM " + npm + " = " + nilai;
    }

}