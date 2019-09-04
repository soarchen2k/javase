package singlton;

/**
 * Hunger 饿汉式
 */
public class Person1 {
    private String name;
    public static final Person1 person1 = new Person1();

    private Person1() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Person1 getPerson1() {
        return person1;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                '}';
    }
}
