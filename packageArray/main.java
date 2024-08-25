package packageArray;
/**
 * main
 */
public class main {

    public static void main(String[] args) {

    //buat object array bertipe Array1
    Array1 a1 = new Array1();
    //buat array dari object array a1
    String[] list = a1.arr(9);

    list[0] = "a";
    list[1] = "b";
    list[2] = "c";
    list[3] = "d";
    list[4] = "e";
    list[5] = "f";
    list[6] = "i";
    list[7] = "i";
    list[8] = "i";

    //Tampilkan array pada console
    System.out.println("array sebelum di hapus elemen depannya ");
    printArr.printArray(list);

    list = Array1.removeFront(list, 5);
    
    // Tampilkan hasil array yang sudah dihapus beberapa elemennya
    System.out.println("array setelah dihapus elemen depannya");
    printArr.printArray(list);
    
    list = Array2.removeAll(list, "i");
    // Tampilkan hasilnya
    System.out.println("\narray setelah dihapus semua element yang berisi 'i'");
    printArr.printArray(list);

    }
}