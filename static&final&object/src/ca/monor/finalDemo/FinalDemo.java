package ca.monor.finalDemo;

public class FinalDemo {
    public static void main(String[] args) {
        final Person person1 = new Person("dal", 27);
        Person person2 = new Person("David", 28);
        System.out.println(person1);
        person1.setName("Fanny");
        System.out.println(person1);
    }
}
