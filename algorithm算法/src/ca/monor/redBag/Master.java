package ca.monor.redBag;

import java.util.Scanner;

public class Master extends User {
    private double money;
    private int count;

    public Master(String name, double balance) {
        super(name, balance);
    }

    public Master(String name, double balance, double money, int count) {
        super(name, balance);
        this.money = money;
        this.count = count;
    }

    @Override
    public void redBag() {
        redBag( money, count);   // 马甲函数
    }

    private void redBag(double money, int count) {
        if (this.getBalance() > money * count) {
            this.setBalance(this.getBalance() - money * count);
        }
    }

    public double getMoney() {
        return money;
    }

    public int getCount() {
        return count;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
