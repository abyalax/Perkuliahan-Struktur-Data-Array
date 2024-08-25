package HardCode;

//Tugas 2 Struktur Data
public class Array2 {
    // Menghapus semua kemunculan suatu nilai dari sebuah array
    public static int[] removeAll(int[] arrayParams, int item) {
        int count = 0;

        // Menghitung jumlah kemunculan nilai yang akan dihapus
        for (int i = 0; i < arrayParams.length; i++) {
            if (arrayParams[i] == item) {
                count++;
            }
        }

        // Membuat array baru dengan ukuran yang lebih kecil sesuai dengan jumlah nilai
        // yang akan dihapus
        int[] output = new int[arrayParams.length - count];
        int index = 0;

        // Mengisi array baru dengan nilai yang tidak dihapus
        for (int i = 0; i < arrayParams.length; i++) {
            if (arrayParams[i] != item) {
                output[index++] = arrayParams[i];
            }
        }
        return output;
    }

    // Main Method untuk mencoba method removeAll
    public static void main(String args[]) {
        // Inisialisai sebuah array
        int arr[] = { 2, 3, 4, 10, 4, 40, 4 };
        System.out.println("Array Awal");
        // Munculkan isi array ke console
        for (var i = 0; i < arr.length; i++) {
            var each = arr[i];
            System.out.print(each + " ");
        }
        // buat array baru untuk mencoba method removeAll
        // karena dalam java array tidak dapat dimanipulasi selain dengan membuat arry
        // baru dari array lama
        int[] testing = removeAll(arr, 4);
        // munculkan isi array setelah dilakukan method removeAll ke console
        System.out.println("\nArray setelah dilakukan penghapusan item");
        for (var i = 0; i < testing.length; i++) {
            var each = testing[i];
            System.out.print(each + " ");
        }
    }
}
