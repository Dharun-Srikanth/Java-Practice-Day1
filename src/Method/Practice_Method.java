package Method;

public class Practice_Method {
    private String msg;
    void message(){
        this.msg = "Tata, Bye, Goodubye, Gaya";
    }

//    Method Overloading
    void message(String msg){
        this.msg = msg;
    }

//    Getters
    String getMessage(){
        return this.msg;
    }
}
