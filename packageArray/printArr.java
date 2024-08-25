package packageArray;

public class printArr {
    public static void printArray(Object[] arrParams) {
        for (var i = 0; i < arrParams.length; i++) {
            var each = arrParams[i];
            System.out.print(each + ", ");
        }
        System.out.println();
    }

}
