package singlton;

/**
 * Lazer 懒汉式
 */
public class Person2 {
    private String name;
    private static Person2 person2;

    public Person2() {
    }

    public Person2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Person2 getPerson2() {
        if (person2 == null) {
            return new Person2();
        }
        return person2;
    }
}
