package HardCode;

import java.util.Arrays;

public class Mystery {

    public static void main(String[] args) {
        int x = 1;
        int[] a = new int[2];
        mystery1(x, a);
        // System.out.println(x + " " + Arrays.toString(a)); // 2 [0,1]

        // x -= 1;
        // a[1] = a.length;
        // mystery1(x,a);
        // System.out.println(x + " " + Arrays.toString(a)); // 1 [0, 1]

        // mystery2(x, a);
        // System.out.println(x + " " + Arrays.toString(a)); // 1 [1, 2]
    }

    public static void mystery1(int x, int[] list) {
        list[x] += 1;
        x += 1;
        System.out.println(x + " " + Arrays.toString(list));
    }

    public static void mystery2(int x, int[] list) {
        list = new int[] { x, x };
        // System.out.println(x + " " + Arrays.toString(list));
    }
}
