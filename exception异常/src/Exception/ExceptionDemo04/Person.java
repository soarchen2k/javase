package Exception.ExceptionDemo04;

public class Person {
    private String name;
    private int age;

    public Person(String name) {
        this.name = name;
    }

    public void scanAge(int age) {
        try {
            if (age < 0 || age > 200) {
                throw new AgeIllegalException("Age is illegal");
            }
        } catch (AgeIllegalException e) {
            e.printStackTrace();
        }
    }

    public Person(String name, int age) throws AgeIllegalException {
        scanAge(age);
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) throws AgeIllegalException {
        scanAge(age);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
