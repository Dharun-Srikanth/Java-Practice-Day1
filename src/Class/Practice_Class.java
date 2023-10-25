package Class;

public class Practice_Class {
    String name;
    Practice_Class(String name){
        this.name = name;
    }
    void nickname(String nick){
        this.name += nick;
    }

    public static void main(String[] args) {
        Practice_Class PracticeObj = new Practice_Class("Sravani ");
        PracticeObj.nickname("Reddy");
        System.out.println(PracticeObj.name);

        Practice_Class PracticeObj2 = new Practice_Class("Roobinee ");
        PracticeObj2.nickname("Roobie");
        System.out.println(PracticeObj2.name);
    }

}
