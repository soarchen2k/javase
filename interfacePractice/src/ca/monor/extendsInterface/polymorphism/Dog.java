package ca.monor.extendsInterface.polymorphism;

public class Dog extends Animal {
    private String name;

    public void eat() {
        System.out.println("Dog eat");
    }

    public void pee() {
        System.out.println("Dog pee");
    }
}
