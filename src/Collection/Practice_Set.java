package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Practice_Set {
    public static void main(String[] args) {
        System.out.println("---------HashSet -> Random Order------------");
        Set<IceCreams> set = new HashSet<>();

        set.add(new IceCreams(1, "Brownie"));
        set.add(new IceCreams(2, "Brownie"));
        set.add(new IceCreams(3, "Brownie"));

//        Print
        for (IceCreams val:set){
            System.out.println(val.getId());
        }

        System.out.println("----------LinkedHashSet -> Insertion Order -----------");
        Set<IceCreams> set2 = new LinkedHashSet<>();

        set2.add(new IceCreams(1, "Choco Lava Cake"));
        set2.add(new IceCreams(2, "Choco Lava Cake"));
        set2.add(new IceCreams(3, "Choco Lava Cake"));
        set2.add(new IceCreams(4, "Choco Lava Cake"));

        for (IceCreams val: set2){
            System.out.println(val.getId());
        }

        System.out.println("-------TreeSet -> Sorted Order-------");
    }
}
