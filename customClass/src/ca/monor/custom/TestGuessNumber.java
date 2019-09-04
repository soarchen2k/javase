package ca.monor.custom;

public class TestGuessNumber {
    public static void main(String[] args) {
        GuessNumber guessNumber = new GuessNumber();
        guessNumber.play(guessNumber.getNumber());
    }
}
