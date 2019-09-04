package ca.monor.stringApiDemo;

public class StringApiDemo01 {
    public static void main(String[] args) {
        String s1 = "abcdefg";
        System.out.println(s1);
        String temp1 = s1.replace("a", "A");
        String temp2 = temp1.replace("g", "G");

        System.out.println(s1);
        System.out.println(temp1);
        System.out.println(temp2);

        String s2 = "aa-bb-cc-dd";
        String[] s2Split = s2.split("-");
        for (int i = 0; i < s2Split.length; i++) {
            System.out.println(s2Split[i]);
        }
    }
}
