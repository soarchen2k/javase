package ca.monor.string;

public class StringDemo06 {
    public static void main(String[] args) {
        String string = "ABCD abcde 123456 ABCD abcde 123456";
        StringDemo06 stringDemo06 = new StringDemo06();
        stringDemo06.printCounter(stringDemo06.counter(string));
    }

    public int[] counter(String string) {
        char[] chars = string.toCharArray();
        int majorCounter = 0;
        int minorCounter = 0;
        int numberCounter = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 48 && chars[i] <= 57) numberCounter++;
            else if (chars[i] >= 65 && chars[i] <= 90) majorCounter++;
            else if (chars[i] >= 97 && chars[i] <= 122) minorCounter++;
        }
        return new int[]{majorCounter, minorCounter, numberCounter};
    }

    public void printCounter(int[] counter) {
        System.out.println("Majors : " + counter[0]);
        System.out.println("Minors : " + counter[1]);
        System.out.println("Numbers: " + counter[2]);
    }
}
