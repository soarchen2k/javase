package ca.monor.string;

/**
 * 统计重复字符串的个数
 * java is the best language in the world and java is my favorite language.
 * 111 1111 11 111111 1 11
 */
public class StringDemo07 {
    public static void main(String[] args) {
        String string = "111 1111 11 111111 111 11";
        String target = "11";
        StringDemo07 stringDemo07 = new StringDemo07();
        stringDemo07.compare(string, target);
    }


    public void compare(String word, String target) {
        String[] words = splitInput(word);
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= 3) {
                for (int j = 0; j < words[i].length() - 2; j++) {
                    if (words[i].substring(j, j + 2).equals(target)) count++;
                }
            }
        }
        System.out.println("Target " + target + " shows " + count + " times");
    }

    public String[] splitInput(String word) {
        String[] words = word.split(" ");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].concat("a");  // 在words数组的每个单元中追加 a
        }
        return words;
    }

}
