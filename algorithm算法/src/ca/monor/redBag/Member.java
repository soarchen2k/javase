package ca.monor.redBag;

public class Member extends User {
    private double money;

    public Member(String name, double balance) {
        super(name, balance);
    }

    public Member(String name, double balance, double money) {
        super(name, balance);
        this.money = money;
    }

    @Override
    void redBag() {
        redBag(money);
    }

    private void redBag(double money) {
        this.setBalance(this.getBalance() + money);
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
