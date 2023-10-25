package Tasks;

import java.util.Scanner;

public class PalindromeOrNot {
    static Scanner sc;

    public static void main(String[] args) {
        sc = ArraySumPairFinder.scanner();
        System.out.println("Give the string to check palindrome");
        String value = sc.nextLine();
        System.out.println(new PalindromeOrNot().isPalindrome(value));
    }

    boolean isPalindrome(String value){
        String temp = "";
        for(int i=value.length()-1;i>=0;i--){
            temp += value.charAt(i);
        }
        if(temp.equals(value)){
            return true;
        }
        return false;
    }
}
