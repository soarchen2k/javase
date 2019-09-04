package SimpleFactory;

public class FruitFactory {

    public static Fruit getFruit(String type) throws IllegalAccessException, InstantiationException {
        if (type.equalsIgnoreCase("banana")) {
            return new Banana();
        } else if (type.equalsIgnoreCase("apple")) {
            return new Apple();
        } else if (type.equalsIgnoreCase("orange")) {
            return (Fruit) Orange.class.newInstance(); // new object
        } else {
            return null;
        }
    }
}
