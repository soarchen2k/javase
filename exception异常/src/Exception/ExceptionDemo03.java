package Exception;

public class ExceptionDemo03 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        try {
//            if (arr == null) {
//                throw new NullPointerException("nULL pOINT");
//            }
            System.out.println(arr[5]);
        } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }
}