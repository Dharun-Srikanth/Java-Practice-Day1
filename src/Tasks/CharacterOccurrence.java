package Tasks;

import java.util.Scanner;

public class CharacterOccurrence {
    static Scanner sc;

    public static void main(String[] args) {
        sc = ArraySumPairFinder.scanner();
        System.out.println("Enter the string");
        String value = sc.nextLine();
        System.out.println("Enter the character to check character occurrence:");
        String val = sc.next();
        new CharacterOccurrence().characterCount(value,val);

    }

    void characterCount(String val, String check){
        int count = 0;
        for(int i=0;i<val.length();i++){
            if((val.charAt(i)+"").equals(check)){
                count++;
            }
        }
        System.out.println(check+": "+count);
    }
}
