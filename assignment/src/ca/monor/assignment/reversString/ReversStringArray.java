package ca.monor.assignment.reversString;

/**
 * 使用数组反转字符串
 */
public class ReversStringArray {
    public static void main(String[] args) {
        String string = "ABCDEFG";
        System.out.println(revers(string));
    }

    private static String revers(String string) {
        if (string == null) {
            return null;
        }
        char[] chars = string.toCharArray();
        int first = 0;
        int last = chars.length - 1;
        while (first < last) {
            swap(chars, first++, last--);
        }

        /*
         * char[] 数组可以直接返回为 String
         */
        string = new String(chars);
        return string;
    }

    private static void swap(char[] chars, int first, int last) {
        char tmp = chars[first];
        chars[first] = chars[last];
        chars[last] = tmp;
    }
}
