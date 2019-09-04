package ca.monor.assignment.LX_2;

public class LX_8 {
    public static void main(String[] args) {
        printNum();
    }

    public static void printNum() {

        int i = 10;
        int j = 20;
//        j = i / 5 + j;
        j += i / 5;
        int k = j;
        System.out.println("i = " + i + ", j = " + j + ", k = " + k);

    }
}
