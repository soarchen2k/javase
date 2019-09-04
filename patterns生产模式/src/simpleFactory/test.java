package SimpleFactory;

public class test {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Fruit apple = FruitFactory.getFruit("Apple");
        Fruit orange = FruitFactory.getFruit("orange");
        Fruit banana = FruitFactory.getFruit("Banana");
        apple.get();
        orange.get();
        banana.get();

        Apple apple1 = (Apple) apple;
        apple1.setColor("red");

    }
}
