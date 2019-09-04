package ca.monor.assignment.LX_5;

public class Test7_Equals {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 3, 2, 3};
        int[] arr2 = {1, 2, 3, 4, 3, 2, 3};
        System.out.println("数组 arr1 与 arr2 " + (equals(arr1, arr2) ? "完全一致" : "不一致"));

        /**
         * 在 sout 语句中使用三元判断，需要把三元的部分用括号括起来，再使用 + 与其他部分相连
         */

    }

    public static boolean equals(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        } else {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
