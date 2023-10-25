package Tasks;

import java.util.Scanner;

public class FibonacciSeries {
    static Scanner sc;

    public static void main(String[] args) {
        sc = ArraySumPairFinder.scanner();
        System.out.println("Enter max range you want to print fibonacci series");
        int max = sc.nextInt();
        new FibonacciSeries().printFibonacci(max);
    }

    void printFibonacci(int max){
        int initialValue = 0, secondValue = 1;
        System.out.print(initialValue+"\t"+secondValue+"\t");
        for(int i=2;i<=max;i++){
            int thirdValue = initialValue+secondValue;
            System.out.print(thirdValue+"\t");
            initialValue = secondValue;
            secondValue = thirdValue;
            if(thirdValue>=max)
                break;
        }
    }
}
