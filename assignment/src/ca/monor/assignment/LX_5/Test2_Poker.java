package ca.monor.assignment.LX_5;

public class Test2_Poker {
    public static void main(String[] args) {
        String[] poker = {"黑桃", "红桃", "梅花", "方块"};
        String[] number = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        for (int i = 0; i < poker.length; i++) {
            for (int j = 0; j < number.length; j++) {
                System.out.print(poker[i] + number[j] + " ");
            }
            System.out.println();
        }
    }
}