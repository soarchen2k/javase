package Exception.ExceptionDemo04;

public class Main {
    public static void main(String[] args) throws AgeIllegalException {
        try {
            Person person = new Person("Tom", 250);
        } catch (AgeIllegalException e) {
            e.printStackTrace();
        }


        Person person2 = new Person("Joan");
        person2.setAge(207);
        System.out.println(person2);
    }
}
