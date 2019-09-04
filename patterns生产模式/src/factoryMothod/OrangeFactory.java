package factoryMothod;

public class OrangeFactory implements FruitFactory {
    @Override
    public Fruit getFruit() throws IllegalAccessException, InstantiationException {
        return Orange.class.newInstance();
    }
}
