package ca.monor.string;

public class StringEquals {
    public static void main(String[] args) {
        String s1 = "Abc";
        String s2 = "aBc";
        String s3 = new String("abC");
//        System.out.println(s1.equals(s2)); // value
//        System.out.println(s1 == s2);      // address
//        System.out.println(s1.equals(s3));
//        System.out.println(s1 == s3);
//        System.out.println(s2 == s3);
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s2.equalsIgnoreCase(s3));
    }

}
