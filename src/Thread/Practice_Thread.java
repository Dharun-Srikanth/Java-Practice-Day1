package Thread;

public class Practice_Thread extends Thread{
    public void run() {
        System.out.println("Thread is running");
        check2();
        check();
    }

    public void check(){
        for (int i=0;i<5;i++) {
            System.out.println("Hello");
        }
    }

    public void check2(){
        for (int i=0;i<5;i++) {
            System.out.println("Bye");
        }
    }

    public static void main(String[] args) {
        Practice_Thread obj = new Practice_Thread();
        obj.start();
        Practice_Thread obj2 = new Practice_Thread();
        obj2.start();

    }
}
