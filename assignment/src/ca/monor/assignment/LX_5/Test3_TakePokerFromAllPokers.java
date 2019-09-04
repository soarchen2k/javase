package ca.monor.assignment.LX_5;

public class Test3_TakePokerFromAllPokers {
    public static void main(String[] args) {
        getPoker(1);
        getPoker(5);
        getPoker(50);
    }

    private static void getPoker(int i) {
        String[] poker = {"黑桃", "红桃", "梅花", "方块"};
        String[] number = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] allPoker = new String[52];
        int indexAllPoker = 0;
        for (int j = 0; j < 4; j++) {
            for (int k = 0; k < 13; k++) {
                allPoker[indexAllPoker] = poker[j] + number[k];
                indexAllPoker++;
            }
        }
        System.out.println(allPoker[i - 1]);
    }

}