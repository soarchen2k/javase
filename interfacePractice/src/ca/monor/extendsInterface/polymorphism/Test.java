package ca.monor.extendsInterface.polymorphism;

public class Test {
    public static void main(String[] args) {
//        Animal animal = new Dog();
////        Dog dog = (Dog) new Animal();
//        animal.run();
//        animal.eat();
        Animal animal = new Dog();
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;  // 向下造型是还原操作，相当于 Dog dog = new Dog();
            dog.pee();
        }

    }
}
