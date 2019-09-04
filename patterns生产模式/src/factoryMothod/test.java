package factoryMothod;

public class test {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        FruitFactory appleFactory = new AppleFactory();
        Fruit apple = appleFactory.getFruit();

        FruitFactory orangeFactory = new OrangeFactory();
        Fruit orange = orangeFactory.getFruit();

        apple.get();
        orange.get();

        Apple apple1 = (Apple) apple;
        apple1.setColor("red");
        apple1.setWeight(0.5);

        System.out.println(apple);
    }
}
