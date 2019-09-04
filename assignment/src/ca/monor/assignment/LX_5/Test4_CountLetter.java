package ca.monor.assignment.LX_5;

public class Test4_CountLetter {
    public static void main(String[] args) {
        char[] chars = {'a', 'l', 'f', 'm', 'f', 'o', 'b', 'b', 's', 'n'};
        printCount(chars);
    }

    private static void printCount(char[] chars) {
        int[] counter = new int[26];
        for (int i = 0; i < chars.length; i++) {
            int charCount = chars[i]; //if chars[0]=97, charCount = 97, counter[97-97]+1
            counter[charCount - 97]++;
        }
        for (int i = 0, ch = 97; i < counter.length; i++, ch++) {
            if (counter[i] != 0) {
                System.out.println((char) ch + "---" + counter[i]);
            }
        }

    }


}
