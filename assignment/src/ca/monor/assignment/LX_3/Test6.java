package ca.monor.assignment.LX_3;

public class Test6 {
    public static void main(String[] args) {
        String str = "J";
        for (int i = 0; i < 5; i++) {
            int key = i % 3;
            switch (key) {
                case 0:
                    str = str + "a";
                    i++;
                    break;

                case 2:
                    str = str + "V";
                    break;
            }
        }
        System.out.println(str);
    }
}
