// Tugas 1 Struktur Data
public class Array1 {

    //method untuk menghapus elemen array dengan parameter array dan banyaknya elemen yang dihapus
    public static String[] removeFront(String[] arrayParams, int params) {
        // validasi parameter yang digunakan melebihi batas array atau tidak
        if (params <= 0 || params > arrayParams.length) {
            System.out.println("Jumlah elemen yang ingin dihapus tidak valid.");
            return arrayParams;
        }
        //jika tidak maka jalankan kode berikut
        //buat array baru dengan panjang setelah dikurangi parameter
        String[] newArray = new String[arrayParams.length - params];
    
        for (int i = 0; i < newArray.length; i++) {
            // Geser index array sebanyak yang diiberikan oleh params ke kiri
            newArray[i] = arrayParams[i + params]; // Mulai dari indeks setelah elemen yang ingin dihapus
        }
        return newArray;
    }
    // Main method untuk mencoba method RemoveFront
    public static void main(String[] args) {
        //Buat array dengan tipe data string
        String[] list = {"satu","dua","tiga","empat","lima","enam","tujuh"};

        //Tampilkan array pada console
        System.out.println("array sebelum di hapus elemen depannya ");
        // Buat Perulangan untuk menampilkan keseluruhan isi array
        for (var i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        
        //Jalankan method removeFront untuk menghapus beberapa elemen array yang depan
        list = removeFront(list, 3);

        //Tampilkan hasil array yang sudah dihapus beberapa elemennya
        System.out.println("\narray setelah dihapus elemen depannya");
        // Buat Perulangan untuk menampilkan keseluruhan isi array
        for (var i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
