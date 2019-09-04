package ca.monor.method.array;

public class CountChar {
    public static void main(String[] args) {
        String chars = "aaabbbhfafnadchiashfcoofiawdssad" +
                "asdqwaschhicuhashckjhehkbdcb" +
                "uegigkbkdsuygeucgrrrrmmmmmm" +
                "ttvvvzzzeoixahohndlkahfxla" +
                "hfalkjhfaksfhgiuahxlkjknkhk";
        countChars(chars);
    }

    private static void countChars(String chars) {
        char[] charsToCount = chars.toCharArray();
        int[] charsCounter = new int[26];
        int charToInt = 0;
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < charsToCount.length; j++) {
                if (charToInt + 97 == charsToCount[j]) {
                    charsCounter[i]++;
                }
            }
            charToInt++;
        }
        for (int i = 0; i < 26; i++) {
            if (charsCounter[i] != 0) {
                System.out.println((char) (i + 97) + " : " + charsCounter[i] + " Times");
            }
        }
    }
}
