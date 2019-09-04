package oprator.src.ca.monor.for_while;

/**
 * 初始表达式 1
 * while (布尔表达式 2){
 * 循环体 3
 * 步进表达式 4
 * }
 * <p>
 * 执行顺序 1 2 3 4 > 2 3 4 > 2 3 4... 直到 2 不满足为止
 * 1 负责变量初始化
 * 2 负责判断是否满足循环条件，不满足则跳出循环
 * 3 具体执行的语句
 * 4 循环后，循环变量的变化情况
 */
public class L01_While {
    public static void main(String[] args) {
        /*
        use "while" to print 10 times "Hello World"
         */

        int i = 1;
        while (i <= 10) {
            if (i == 1) {
                System.out.println("Hello World ! " + i + " Time");
            } else {
                System.out.println("Hello World ! " + i + " Times");
            }
            i++;
        }

    }
}
