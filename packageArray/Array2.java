package packageArray;

//Tugas 2 Struktur Data
public class Array2 {
     // Hapus semua elemen yang dibawa parameter yang ada di array
     public static String[] removeAll(String[] arrayParams, String item) {
        int count = 0;

        // Menghitung jumlah elemen array yang disebut pada parameter
        for (int i = 0; i < arrayParams.length; i++) {
            if (arrayParams[i] == item) {
                count++;
            }
        }

        // Membuat array baru dengan ukuran yang lebih kecil sesuai dengan jumlah nilai yang akan dihapus
        String[] output = new String[arrayParams.length - count];
        int index = 0;

        // Mengisi array baru dengan nilai yang tidak dihapus
        for (int i = 0; i < arrayParams.length; i++) {
            if (arrayParams[i] != item) {
                output[index++] = arrayParams[i];
            }
        }
        return output;
    }
};