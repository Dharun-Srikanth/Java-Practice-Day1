package Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SubsetArrayOrNot {
    private static Scanner sc;

    public static void main(String[] args) {
        sc = ArraySumPairFinder.scanner();

        System.out.println("Enter the array 1 length: ");
        int arrLen = sc.nextInt();
        int[] array = new int[arrLen];
        System.out.println("Array 1 values");
        array = ArraySumPairFinder.createArray(arrLen, array);
        System.out.println("Enter the array 2 length: ");
        int arrLen2 = sc.nextInt();
        System.out.println("Array 1 values");
        int[] array2 = new int[arrLen2];
        array2 = ArraySumPairFinder.createArray(arrLen2, array2);

        System.out.println(new SubsetArrayOrNot().findSubset(array, array2));


    }

    boolean findSubset(int[] arr1, int[] arr2) {
        boolean ans = false;
//        Find Subset
        for (int i=0;i<arr2.length;i++){
            for (int j=0;j<arr1.length;j++){
                if(arr2[i]==arr1[j]){
                    ans = true;
                    break;
                }
            }
            if(!ans){
                return ans;
            }
        }
        return true;
    }
}
