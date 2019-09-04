package ca.monor;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo03 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("a");
        collection.add("b");
        collection.add("c");

        Student[] objects = (Student[]) collection.toArray();
        for (Object o : objects
        ) {
            System.out.println(o);
        }
    }
}
