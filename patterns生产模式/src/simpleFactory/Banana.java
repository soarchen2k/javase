package simpleFactory;

public class Banana implements Fruit {
    @Override
    public void get() {
        System.out.println("New Banana");
    }
}
