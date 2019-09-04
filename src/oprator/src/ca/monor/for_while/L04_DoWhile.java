package oprator.src.ca.monor.for_while;

/**
 * 初始化表达式 1
 * do {
 * 循环体 3
 * 步进表达式 4
 * } while (布尔表达式) 2
 * <p>
 * 执行顺序 1 3 4 > 2 3 4 > 2 3 4 ... 2 不满足为止
 * 1 负责循环变量初始化
 * 2 负责判断是否满足循环条件，不满足则跳出循环
 * 3 具体执行的语句
 * 4 循环后，循环变量的变化情况
 * <p>
 * 经常在需要 Login 的地方使用
 * <p>
 * for 循环 和 while 循环的区别
 * <p>
 * 适用的场合不同，已知循环次数的时候，一般使用 for 循环；
 * 已知循环的终止条件时，一般使用 while 循环。
 */
public class L04_DoWhile {
    public static void main(String[] args) {

    }
}
