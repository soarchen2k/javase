package ca.monor.assignment.LX_4;

public class Test7 {
    public static void main(String[] args) {
        double a = 10.1, b = 10.4, c = 10.5, d = 10.9;
        round(a);
        round(b);
        round(c);
        round(d);
    }

    public static void round(double doubleNum) {
        int intNum = (int) (doubleNum + .5);
        System.out.println(doubleNum + " -> " + intNum);
    }

}
