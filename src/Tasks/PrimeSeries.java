package Tasks;

import java.util.Scanner;

public class PrimeSeries {
    static Scanner sc;

    public static void main(String[] args) {
        sc = ArraySumPairFinder.scanner();
        System.out.println("Enter max range to check prime");
        int max = sc.nextInt();

        new PrimeSeries().printPrimeSeries(max);
    }

    void printPrimeSeries(int max) {
        for (int i = 1; i <= max; i++){
            if(isPrime(i) && i!=1){
                System.out.print(i+"\t");
            }
        }
    }

    boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
