package ca.monor.sandbox;

public class SandBox01 {
    public static void main(String[] args) {
        boolean pingfang = pingfang(3);
//        System.out.println(pingfang);
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
