package packageArray;
// Tugas 1 Struktur Data
public class Array1 {

    public String[] arr(int maks) {
        String[] newArray = new String[maks];
        // Inisialisasi elemen array
        for (int i = 0; i < maks; i++) {
            newArray[i] = "";  // nilai default dari isi array baru
        }
        return newArray;
    }


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

}
