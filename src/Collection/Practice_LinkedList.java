package Collection;

import java.util.LinkedList;

public class Practice_LinkedList {
    public static void main(String[] args) {
        LinkedList<IceCreams> linkedIce = new LinkedList<>();
        linkedIce.add(new IceCreams(1, "Baskin Robbins"));
        linkedIce.add(new IceCreams(2, "Cream stone"));

        System.out.println(linkedIce.get(1).getName());
    }
}
