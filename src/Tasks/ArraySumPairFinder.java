package Tasks;

import java.util.Scanner;

public class ArraySumPairFinder {
    private static Scanner sc;

    public static void main(String[] args) {
        sc = scanner();
        System.out.println("Give array length you want: ");
        int arrLen = sc.nextInt();
        int[] array = new int[arrLen];

        array = createArray(arrLen, array);

        System.out.println("Enter sum value to check: ");
        int k = sc.nextInt();

        System.out.println(pairFinder(array, arrLen, k));

    }

    static Scanner scanner() {
        if (sc == null) {
            sc = new Scanner(System.in);
        }
        return sc;
    }

    static int[] createArray(int arrLen, int[] array){
        //        Array value storing
        for (int i = 0; i < arrLen; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    static boolean pairFinder(int[] array, int arrLen, int k){
        //Finding pair in array
        for (int i = 0; i < arrLen - 1; i++) {
            for (int j = i + 1; j < arrLen; j++) {
                if (array[i] + array[j] == k){
                    return true;
                }
            }
        }
        return false;
    }
}
