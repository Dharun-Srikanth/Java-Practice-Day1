package Collection;

import java.util.HashMap;
import java.util.Map;

public class Practice_Map {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(5, "Brownie");
        map.put(6, "Brownie");
        map.put(7, "Brownie");

        for(Integer i: map.keySet()){
            System.out.println(i);
        }
    }
}
