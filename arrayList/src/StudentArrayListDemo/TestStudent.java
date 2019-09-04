package StudentArrayListDemo;

import java.util.ArrayList;

public class TestStudent {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        String s1 = "Cao Cao";
        String s2 = "Liu Bei";
        String s3 = "Sun Quan";

        System.out.println(list);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        System.out.println(list);

    }
}
