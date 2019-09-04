package Exception;

public class ExceptionDemo01 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 1, 1};
//        try {
        getElements(arr, 5);
//        } catch (Exception e) {
//            System.out.println(e);
//        }

        System.out.println("aaaa");
    }

    public static int getElements(int[] arr, int index) {
        if (arr == null) {
            throw new NullPointerException("Null Point");
        }
        if (index < 0 || index >= arr.length) {
            throw new ArrayIndexOutOfBoundsException("Out of bounds");
        }
        return arr[index];
    }
}
