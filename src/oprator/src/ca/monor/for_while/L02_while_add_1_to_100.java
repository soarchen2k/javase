package oprator.src.ca.monor.for_while;

public class L02_while_add_1_to_100 {
    public static void main(String[] args) {
        int i = 1;
        int totalSum = 0;
        while (i <= 100) {
            totalSum += i;
            i++;
        }
        System.out.println(totalSum);
    }
}
