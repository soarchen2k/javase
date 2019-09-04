package ca.monor.custom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class ArrayListDemo02 {
    public int[] generateRanNum() {
        int[] randNumArray = new int[6];
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            randNumArray[i] = random.nextInt(34);
        }
        return randNumArray;
    }

    public ArrayList<Integer> addToArrayList(int[] randNumArray) {
        ArrayList<Integer> randNumList = new ArrayList<>();
        for (int i = 0; i < randNumArray.length; i++) {
            randNumList.add(randNumArray[i]);
        }
        System.out.println(randNumList);
        return randNumList;
    }

    public void printRandNum(ArrayList<Integer> randNumList) {
        Iterator<Integer> integerIterator = randNumList.iterator();
        while (integerIterator.hasNext()) {
            System.out.println(integerIterator.next());
        }
//        System.out.println(randNumList);
    }
}
