package oprator.src.ca.monor.oprator;

public class demo自增自减 {
    public static void main(String[] args) {
////        ++ 自增 1 -- 自减 1
//        int i =10;
////        i++;
//        System.out.println(i++); // 当在 i 之后操作 ++ 时，后增 1
//        System.out.println(i++);
//        System.out.println(i++);
//        System.out.println(i++);
//
//        int a = 10;
//        System.out.println(++a); // 当在 a 之前操作 ++ 时，先增 1


        int i = 10;
        int j = 100;
        int k = 1000;

        int res = i++ * (k-- * ++i - j++) + ++j - ++k; // 自增运算和自减运算的优先级高于括号 ()
        System.out.println(res);
        int num1 = 787889796;
        int num2 = 23;
        System.out.println(num1 % num2);


    }
}
