package ca.monor.extendsdemo.entreprise;

public class Employee {
    private String Id;
    private String name;
    private double salary = 1500;

    @Override
    public String toString() {
        return "Id= " + Id +
                ", name= " + name +
                ", salary= " + salary;
    }

    public Employee(String id, String name, double salary) {
        Id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
