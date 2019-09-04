import java.util.ArrayList;

public class ArrayListMethodDemo01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");

        System.out.println("get:" + list.get(0));
        System.out.println("get:" + list.get(1));
        System.out.println("get:" + list.get(2));

        System.out.println(list.size());
        System.out.println("remove: " + list.remove(2));

        System.out.println(list);
        for (String e : list
        ) {
            System.out.println(e);
        }
    }
}
