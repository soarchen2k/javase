package singlton;

public class Main {
    public static void main(String[] args) {
//        Person1 person1 = Person1.getPerson1();
//        System.out.println(person1);

        Person2 person2 = Person2.getPerson2();
        System.out.println(person2);
        Person2 person21 = Person2.getPerson2();
        System.out.println(person21);
    }
}
