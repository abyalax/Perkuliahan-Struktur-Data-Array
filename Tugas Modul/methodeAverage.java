import java.util.Arrays;
public class methodeAverage {
    public static void main(String[] args) {
        System.out.println("main method ready boss");
        int[] nilai = new int[10];
        nilai[0] = 40;
        nilai[1] = 60;
        nilai[2] = 50;
        nilai[3] = 80;
        nilai[4] = 90;
        nilai[5] = 80;
        nilai[6] = 60;
        nilai[7] = 65;
        nilai[8] = 55;
        nilai[9] = 84;
        System.out.println(
            Arrays.toString(nilai)
        );
        int npm = 1107100029;
        for (var i = 0; i < nilai.length; i++) {
            var each = nilai[i];
            npm++;
            System.out.println("Nilai Mahasiswa NPM " + npm + " = " + each);
        }
        Double total = 0.0;
        for (var i = 0; i < nilai.length; i++) {
            total += nilai[i];
        }
        Double Average = total / nilai.length;
        System.out.println(total);
        System.out.println("nilai rata-rata mahasiswa = " + Average);
    }
}
