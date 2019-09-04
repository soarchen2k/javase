package ca.monor.extendsdemo.entreprise;

public class Pm extends Employee {
    public Pm(String id, String name, double salary) {
        super(id, name, salary);
    }

    public void work() {
        System.out.println("Assign tasks");
    }
}
