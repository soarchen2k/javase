package ca.monor.extendsdemo.entreprise;

public class Tester extends Employee {
    public Tester(String id, String name, double salary) {
        super(id, name, salary);
    }

    public void work() {
        System.out.println("Testing");
    }
}
