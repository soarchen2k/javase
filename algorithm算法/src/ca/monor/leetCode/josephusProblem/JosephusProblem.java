package ca.monor.leetCode.josephusProblem;

import java.util.Scanner;

public class JosephusProblem {
    void JosephusProblem() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many peoples? ");
        int people = Integer.parseInt(scanner.nextLine());
        System.out.println("How many to kill? ");
        int kill = Integer.parseInt(scanner.nextLine());

        CircleLinkedListForJosephus peoples = addPeople(people);
        peoples.reset();

        kill(kill, peoples);
    }

    private void kill(int kill, CircleLinkedListForJosephus peoples) {
        kill -= 1;
        while (!peoples.isEmpty()) {
            for (int i = 0; i < kill; i++) {
                peoples.next();
            }
            System.out.println(peoples.remove());
        }
    }

    private CircleLinkedListForJosephus addPeople(int people) {
        CircleLinkedListForJosephus list1 = new CircleLinkedListForJosephus();
        for (int i = 1; i <= people; i++) {
            list1.add(i);
        }
        return list1;
    }

    public static void main(String[] args) {
        JosephusProblem run = new JosephusProblem();
        run.JosephusProblem();
        JosephusLinkedList<Integer> list = new JosephusLinkedList<>();

    }

}
