package Method;

public class Testing_Method {
    public static void main(String[] args) {
        Practice_Method methodObj = new Practice_Method();
        methodObj.message("Hi");
        System.out.println(methodObj.getMessage());
        Practice_Method methodObj2 = new Practice_Method();
        methodObj2.message();
        System.out.println(methodObj2.getMessage());

        System.out.println(methodObj.getMessage()+" "+methodObj2.getMessage());
    }
}
