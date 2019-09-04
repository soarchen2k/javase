package ca.monor.oop;

public class TestPerson {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Dal");
        person1.setAge(27);
        person1.setSalary(5000);

        System.out.println(person1.getName());
    }
}
