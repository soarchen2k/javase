package ca.monor.string;

public class StringDemo04 {
    public static void main(String[] args) {
        String s = "abc,def";
        String[] strings = s.split(",");
        for (String s1 : strings
        ) {
            System.out.println(s1);
        }
    }


}
