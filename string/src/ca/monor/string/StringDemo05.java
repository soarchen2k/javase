package ca.monor.string;

public class StringDemo05 {
    public static void main(String[] args) {
        StringDemo05 stringDemo05 = new StringDemo05();
        int[] a = {1, 2, 3, 4, 5, 6};
        stringDemo05.printS(stringDemo05.concatString(a));

    }

    public String concatString(int[] array) {
        String s = "[word";
        String s1 = "#word";
        String s2 = "]";
        for (int i = 0; i < array.length - 1; i++) {
            s = s.concat(array[i] + s1);
        }
        s = s.concat(array[array.length - 1] + s2);
        return s;
    }

    public void printS(String string) {
        System.out.println(string);
    }
}
