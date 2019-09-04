package oprator.src.ca.monor.array_method;

/**
 * Container : contain data
 * <p>
 * array, list, tree, map(hashMao hash), stack, heap, queue.... : data structure
 * <p>
 * 数组都有初始值
 */

public class L7_ArrayDemoDefine {
    public static void main(String[] args) {
        int[] arr1 = new int[4]; //第一种声明数组的方法
        for (int i = 0; i < 4; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println(arr1);

        double[] dArray = {1.1, 4.4, 6}; // 第三种创建数组都方式

        int[] arr3 = new int[]{1, 2, 3, 4, 5}; // 第二种创建数组都方式，过于啰嗦，基本上没有人用
    }
}
