package ca.monor.redBag;

public abstract class User {
    private String name;
    private double balance;

    public User(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void showBalance() {
        System.out.println(getBalance());
    }

    abstract void redBag();

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
