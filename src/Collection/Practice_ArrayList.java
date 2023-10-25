package Collection;

import java.util.ArrayList;

public class Practice_ArrayList {
    public static void main(String[] args) {
        ArrayList<IceCreams> arrayList = new ArrayList<>();
        arrayList.add(new IceCreams(1, "Ibacco"));
        arrayList.add(new IceCreams(2, "Arun"));
        arrayList.add(new IceCreams(3, "Naturals"));

//        Accessing value
        System.out.println(arrayList.get(0).getName());

//        Updating
        arrayList.set(2,new IceCreams(3, "Baskin Robbins"));

//        Print after updated
        for (IceCreams ic: arrayList){
            System.out.println(ic.getName());
        }

//        Removing
        arrayList.remove(2);

//        Print after removed:
        for (IceCreams ic: arrayList){
            System.out.println(ic.getName());
        }


    }
}
