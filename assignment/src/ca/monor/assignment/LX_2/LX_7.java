package ca.monor.assignment.LX_2;

public class LX_7 {
    public static void main(String[] args) {

        printNum();

    }

    public static void printNum() {
        float f1 = 12345.01F;
        float f2 = 12345.00F;
        float var1 = f1 > f2 ? 12456F : 12456.02F;
        float var2 = var1 + 1024F;

        System.out.println("var1 = " + var1 + "; var2 = " + var2);
    }
}
