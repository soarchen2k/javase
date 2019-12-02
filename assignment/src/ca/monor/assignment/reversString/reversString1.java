package ca.monor.assignment.reversString;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class reversString1 {
    public static void main(String[] args) {
        String str = "ABCDE";
        System.out.println(reversStringByArray(str));
    }

    public static String reversStringByArray(String s) {
        if (s == null) {
            return s;
        }
        char[] chars = s.toCharArray();
        int first = 0;
        int last = chars.length - 1;
        while (first < last) {
            swap(chars, first++, last--);
        }
        s = new String(chars);
        return s;
    }

    private static void swap(char[] chars, int first, int last) {
        char temp = chars[first];
        chars[first] = chars[last];
        chars[last] = temp;
    }

    public static String reversStringByList(String s) {

        List<Character> strings = new LinkedList<>();
        char[] chars = s.toCharArray();
        for (char c :
                chars) {
            strings.add(c);
        }
        return s;
    }
}

class StringList {

}