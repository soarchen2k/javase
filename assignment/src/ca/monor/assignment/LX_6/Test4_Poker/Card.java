package ca.monor.assignment.LX_6.Test4_Poker;

public class Card {
    private String image;
    private String point;

    public Card(String image, String point) {
        this.image = image;
        this.point = point;
    }

    public void showCard() {
        System.out.println(image + point);
    }
}
