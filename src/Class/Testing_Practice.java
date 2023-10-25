package Class;

import java.util.Scanner;

public class Testing_Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give your Friend name: ");
        String name = sc.next();
        Practice_Class PracticeObj = new Practice_Class(name+" ");
        System.out.println("Give a nickname for "+name);
        String nick = sc.next();
        PracticeObj.nickname(nick);
        System.out.println("Hi "+PracticeObj.name);

    }
}
