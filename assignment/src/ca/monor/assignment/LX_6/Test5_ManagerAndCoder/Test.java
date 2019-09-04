package ca.monor.assignment.LX_6.Test5_ManagerAndCoder;

public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager("James", "9527", 15000, 3000);
        Coder coder = new Coder("Kobe", "0025", 10000);
        manager.intro();
        manager.showSalary();
        manager.work();
        System.out.println("================");
        coder.intro();
        coder.showSalary();
        coder.work();
    }
}
