package ca.monor.assignment.LX_4;

public class Test2 {
    public static void main(String[] args) {

        System.out.println(doCheck(2));
        System.out.println(doCheck(3));
    }

    public static boolean doCheck(int iVar) {
        boolean flag = false;
        if (iVar % 2 == 0) {
            for (int i = 0; i <= 20; i++) {
                iVar -= i;
                flag = true;
            }
        } else {
            for (int i = 0; i <= 20; i++) {
                iVar += i;
                flag = false;
            }
        }
        System.out.println("iVar = " + iVar);
        return flag;
    }
}
