package ca.monor.staticDemo01;

import java.util.ArrayList;

public class StaticCode {
    /**
     * 静态代码块
     * 定义在成员位置，使用 static 修饰的代码块{}
     * 位置：类中方法外
     * 执行：随着类的加载而执行，且只执行一次，优先于 main 方法和构造方法的执行
     */

    public static void main(String[] args) {

    }
}

class Game {
    private static int number;
    private static ArrayList<String> list;

    static {
        number = 2;
        list = new ArrayList<>();
        list.add("张三");
        list.add("李思");
    }
}