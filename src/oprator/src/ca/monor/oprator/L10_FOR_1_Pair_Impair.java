package oprator.src.ca.monor.oprator;

/**
 * for (初始化表达式(1) ; 布尔表达式(2) ; 步进表达式(4) {
 * 循环体(3)
 * }
 * <p>
 * 执行顺序 1 2 3 4 > 2 3 4 > 2 3 4 .... 2 不满足为止
 */
public class L10_FOR_1_Pair_Impair {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is pair");
            } else {
                System.out.println(i + " is impair");
            }
        }

    }
}
