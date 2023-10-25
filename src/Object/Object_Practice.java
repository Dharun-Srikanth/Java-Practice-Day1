package Object;

// Shift F6 for refactoring (Renaming all occurrence)

public class Object_Practice {
    String fName = "Dharun";

    public static void main(String[] args) {
//        Creating object 1 for this class
        Object_Practice obj1 = new Object_Practice();
        System.out.println(obj1);   // Gives id reference of the object
        System.out.println("Object 1: "+obj1.fName);

//      Creating object 2 for this class
        Object_Practice obj2 = new Object_Practice();
        System.out.println(obj2);   // Gives difference id reference of the object
        System.out.println("Object 2: "+obj2.fName);

    }
}
