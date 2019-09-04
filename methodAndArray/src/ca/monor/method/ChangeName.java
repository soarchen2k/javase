package ca.monor.method;

/**
 * name: age:
 * dal  27
 * david 28
 * lucas 30
 * tony 5
 * <p>
 * find the max age
 * modify his name to king
 */
public class ChangeName {
    public static void main(String[] args) {
        String[] names = {"dal", "david", "lucas", "tony"};
        int[] ages = {27, 28, 30, 5};
        change(names, ages);
    }

    public static void change(String[] names, int[] ages) {
        int maxAge = ages[0];
        int index = 0;
        for (int i = 0; i < ages.length; i++) {
            if (maxAge < ages[i]) {
                maxAge = ages[i];
                index = i;
            }
        }
        names[index] = "king";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " : " + ages[i]);
        }
    }
}
