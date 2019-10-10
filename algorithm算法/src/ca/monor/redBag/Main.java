package ca.monor.redBag;

public class Main {
    public static void main(String[] args) {
        User master = new Master("Jack", 1000, 10, 2);
        User member1 = new Member("Mark", 100,((Master) master).getMoney());
        User member2 = new Member("Kate", 100,((Master) master).getMoney());
        master.setBalance(1000);
        master.redBag();
        member1.redBag();
        member2.redBag();
        master.showBalance();
        member1.showBalance();
        member2.showBalance();
    }

}
