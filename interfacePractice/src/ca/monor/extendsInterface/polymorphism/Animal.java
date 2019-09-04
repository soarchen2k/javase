package ca.monor.extendsInterface.polymorphism;

public class Animal {
    private String color;
    private double weight;
    private int age;
    private String gender;

    public void sleep() {
        System.out.println("Animal sleep");
    }

    public void run() {
        System.out.println("Animal run");
    }

    public void eat() {
        System.out.println("Animal eat");
    }
}
