package oprator.src.ca.monor.array_method;

import java.util.Random;

/**
 * 数组的访问
 * 索引：每一个储存到数组的元素，都会自动拥有一个编号，这个自动编号
 * 称为「数组索引」(index)，可以通过数组的索引访问到数组中的元素。
 * <p>
 * 格式： 数组名[索引]
 * <p>
 * 数组的长度属性：每个数组都具有长度，而且是固定的，Java中赋予了数组
 * 的一个属性，可以获取到数组的长度，语句为
 * 数组名.length
 * 属性 length 的执行结果就是数组的长度，int 类型结果，由此可以推断出，
 * 数组的最大索引值为 数组名.length -1
 */

public class L8_ArrayDemoIndex {
    public static void main(String[] args) {
        int[] arr = new int[4];
//        arr[0] = 10;
//        arr[2] = 20;
//        arr[3] = 30;
//        System.out.println(arr[0]);
//        System.out.println(arr[1]); // 未赋值，则默认为 0
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(1000);
            System.out.println(arr[i]);
        }

    }

}
