package oprator.src.ca.monor.array_method;

/**
 * print a square 6*7
 * methodName is print()
 * return: void
 */
public class L1_MethodDemo {
    public static void main(String[] args) {
        print();

    }

    public static void print() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.printf("* ");
            }
            System.out.println();
        }
    }
}
