package ca.monor.string;

public class StringDemo03 {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c'};
        String s = "";
        for (int i = 0; i < chars.length; i++) {
            s = s.concat(chars[i] + ""); // 需要用 s 来接受 concat 的结果
        }
        System.out.println(s);
        System.out.println(s.charAt(0));
        System.out.println(s.indexOf('a'));
        s = s.concat("a");
        System.out.println(s);
        System.out.println(s.replace("a", "haha"));
    }
}
