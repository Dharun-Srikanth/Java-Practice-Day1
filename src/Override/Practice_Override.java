package Override;

public class Practice_Override {
    public static void main(String[] args) {
        Cartoons cartoonObj = new Cartoons();
        Cartoons cartoonObj2 = new Ben10();     // Parent class type = child class object creation
        Ben10 ben10Obj = new Ben10();

        System.out.println(cartoonObj.getCartoonName());
        System.out.println(cartoonObj2.getCartoonName());
        System.out.println(ben10Obj.getCartoonName());

        Doraemon doraemonObj = new Doraemon();
        System.out.println(doraemonObj.getCartoonName());

//        Alien alienObj = (Alien) new Ben10();
//        alienObj.setAlienName("Four Arms");
//        System.out.println(alienObj.getAlienName());

        Ben10 obj = (Ben10) cartoonObj2;


        System.out.println(obj.getCartoonName());





    }
}
