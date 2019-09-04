package oprator.src.ca.monor.oprator;


/**
 * 方法的重载 overload
 * 方法重载与返回值无关，只与参数列表有关
 * 1.参数类型不同，type
 * 2.参数数量不同，count
 * 3.参数顺序不同，order
 * 方法中的参数，我们称为形式参数
 * main 方法中，或者说真实被调用时，传入的参数，我们称为实际参数
 */
public class demo方法的重载 {
    public static void main(String[] args) {
        add(1, 10);
        add(2, 3, 4);


    }

    public static int add(int a, int b) {
        return a + b;
    }

//    public static int add(int a, int b, int c){
//        return a+b+c;
//    }

    public static double add(int a, double b) {
        return a + b;
    }

    public static double add(double a, int b) {
        return a + b;
    }

    public static double add(int a, int b, int c) {
        return add(a, b) + c;
    }
}
