import java.util.ArrayList;
import java.util.Random;

public class ArrayListDemo02 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            list.add(random.nextInt(33) + 1);
        }

        System.out.println(list);
    }
}
