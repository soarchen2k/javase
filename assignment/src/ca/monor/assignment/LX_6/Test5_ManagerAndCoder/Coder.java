package ca.monor.assignment.LX_6.Test5_ManagerAndCoder;

public class Coder {
    private String name;
    private String number;
    private double salary;

    public Coder(String name, String number, double salary) {
        this.name = name;
        this.number = number;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void intro() {
        System.out.println("Coder Name : " + name);
        System.out.println("Number : " + number);
    }

    public void showSalary() {
        System.out.println("Base Salary : " + salary + ", Bonus : None");
    }

    public void work() {
        System.out.println("Coder Working!");
    }
}
