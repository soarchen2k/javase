package ca.monor.assignment.LX_5;

public class Test5_FindAverageScores {
    public static void main(String[] args) {
        int[] scoreGroup = {95, 92, 75, 56, 98, 71, 80, 58, 91, 91};
        int totalCount = 0;
        for (int i = 0; i < scoreGroup.length; i++) {
            if (scoreGroup[i] > getAvg(scoreGroup)) {
                totalCount++;
            }
        }
        System.out.println("We have " + totalCount + " Scores are more than avg Score : " + getAvg(scoreGroup));
    }

    public static int getAvg(int[] arr) {
        int[] score = arr;
        int totalScore = score[0];
        int avgScore;
        for (int i = 1; i < score.length; i++) {
            totalScore += arr[i];
        }
        avgScore = totalScore / score.length;
        return avgScore;
    }
}
