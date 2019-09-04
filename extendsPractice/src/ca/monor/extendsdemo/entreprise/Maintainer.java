package ca.monor.extendsdemo.entreprise;

public class Maintainer extends Employee {
    public Maintainer(String id, String name, double salary) {
        super(id, name, salary);
    }

    public void work() {
        System.out.println("Maintenance");
    }
}
