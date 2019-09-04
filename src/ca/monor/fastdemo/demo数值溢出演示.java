package ca.monor.fastdemo;

public class demo数值溢出演示 {
    public static void main(String[] args) {
//        out of bound exception
        byte b1 = (byte) 120;
        byte b2 = (byte) 8;
        byte res = (byte) (b1 + b2);
        System.out.println(res);
    }
}
