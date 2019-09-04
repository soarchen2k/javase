package ca.monor.assignment.LX_6.Test5_ManagerAndCoder;

public class Manager {
    private String name;
    private String id;
    private double salary;
    private double bonus;

    public Manager(String name, String id, double salary, double bonus) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
    }

    public void intro() {
        System.out.println("Manager name: " + name);
    }

    public void showSalary() {
        System.out.println("Manager's salary : " + salary);
    }

    public void work() {
        System.out.println("Manager working");
    }
}
