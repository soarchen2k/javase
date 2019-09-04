package ca.monor.assignment.LX_4;

import java.util.Scanner;

public class Test4有疑问 {
    /**
     * 无法通过输入 ## 来中断程序
     *
     * @param args
     */
    public static void main(String[] args) {

        String coulor = "";
        while (true) {
            System.out.println("Please input color : ");
            coulor = new Scanner(System.in).next();
            if (coulor == "") {
                return;
            } else {
                showColor(coulor);
            }


        }
    }

    public static String showColor(String color) {
//        System.out.println("Input Color");
//        String color = new Scanner(System.in).next();
        switch (color) {
            case "red":
                System.out.println(color + " 是红色！");
                break;

            case "yellow":
                System.out.println(color + " 是黄色！");
                break;

            case "black":
                System.out.println(color + " 是黑色！");
                break;

            case "blue":
                System.out.println(color + " 是蓝色！");
                break;

            case "green":
                System.out.println(color + " 是绿色！");
                break;

            default:
                System.out.println("error input");
                break;
        }
        return color;
    }
}
