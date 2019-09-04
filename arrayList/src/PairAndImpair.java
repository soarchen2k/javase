import java.util.ArrayList;
import java.util.Random;

public class PairAndImpair {
    public static void main(String[] args) {
        ArrayList<Integer> allNumbers = new ArrayList<>();
        allNumbers.addAll(creatRandomList());
        System.out.println(allNumbers);
        printPair(allNumbers);
        printImpair(allNumbers);
    }

    private static void printImpair(ArrayList<Integer> allNumbers) {
        System.out.println("All impair numbers: ");
        for (Integer allNumber : allNumbers) {
            if (allNumber % 2 != 0) System.out.print(allNumber + " ");
        }
        System.out.println();
    }

    private static void printPair(ArrayList<Integer> allNumbers) {
        System.out.println("All Pair numbers: ");
        for (Integer allNumber : allNumbers) {
            if (allNumber % 2 == 0) System.out.print(allNumber + " ");
        }
        System.out.println();
    }

    private static ArrayList<Integer> creatRandomList() {
        ArrayList<Integer> allNumbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            allNumbers.add(random.nextInt(100));
        }
        return allNumbers;
    }
}
