package ca.monor.sandbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SandBox01 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1.add(1);
        list2.add(1);
        list1.add(3);
        list1.add(2);
        list2.add(2);
        list2.add(3);
        List<Integer> list3 = new ArrayList<>(list1);
        Collections.sort(list1);

        System.out.println(list1.equals(list3));
    }

    private static boolean pingfang(int i) {
        if (i == 16) {
            return true;
        }
        if (i > 17) {
            return false;
        }
        return pingfang(i * i);
    }
}
