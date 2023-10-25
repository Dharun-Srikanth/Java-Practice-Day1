package Exception;

public class Practice_Exception {
    public static void main(String[] args) {
        try {
            Testing.checking();
        }catch (Exception e){
            if(e instanceof ArithmeticException){
                System.out.println("You met with an error");
            }else{
                System.out.println(e.getMessage());
            }
        }
    }
    class Testing{
        static void checking() throws Exception{
            throw new Exception("Hello");
        }
    }
}


