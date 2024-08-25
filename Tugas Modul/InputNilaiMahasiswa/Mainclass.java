package InputNilaiMahasiswa;

import java.util.Scanner;

public class Mainclass {
    public static void main(String[] args) {
        Mahasiswa[] arrayMahasiswa = new Mahasiswa[10];
        arrayMahasiswa[0] = new Mahasiswa("Mahasiswa", 1107100030, 40);
        arrayMahasiswa[1] = new Mahasiswa("Mahasiswa", 1107100031, 60);
        arrayMahasiswa[2] = new Mahasiswa("Mahasiswa", 1107100032, 50);
        arrayMahasiswa[3] = new Mahasiswa("Mahasiswa", 1107100033, 80);
        arrayMahasiswa[4] = new Mahasiswa("Mahasiswa", 1107100034, 90);
        arrayMahasiswa[5] = new Mahasiswa("Mahasiswa", 1107100035, 80);
        arrayMahasiswa[6] = new Mahasiswa("Mahasiswa", 1107100036, 60);
        arrayMahasiswa[7] = new Mahasiswa("Mahasiswa", 1107100037, 65);
        arrayMahasiswa[8] = new Mahasiswa("Mahasiswa", 1107100038, 55);
        arrayMahasiswa[9] = new Mahasiswa("Mahasiswa", 1107100039, 84);

        for (int i = 0; i < arrayMahasiswa.length; i++) {
            System.out.println(arrayMahasiswa[i]);
        }

        float totalNilai = 0;
        for (var i = 0; i < arrayMahasiswa.length; i++) {
            totalNilai += arrayMahasiswa[i].getNilai();
        }
        float jumlahMahasiswa = arrayMahasiswa.length;
        System.out.println("Nilai rata-rata Mahasiswa = " + totalNilai /
                jumlahMahasiswa);

    }
}

// Scanner scanner = new Scanner(System.in);
// int jumlahMahasiswa;

// System.out.println("Mau Input berapa siswa ?..... ");
// jumlahMahasiswa = scanner.nextInt();

// Mahasiswa[] arrayMahasiswa = new Mahasiswa[jumlahMahasiswa];

// for (int i = 0; i < jumlahMahasiswa; i++) {
// System.out.println("Masukkan Nama Mahasiswa:");
// String nama = scanner.next();

// System.out.println("Masukkan NPM:");
// int npm = scanner.nextInt();

// System.out.println("Masukkan Nilai:");
// int nilai = scanner.nextInt();

// arrayMahasiswa[i] = new Mahasiswa(nama, npm, nilai);
// }
// scanner.close();