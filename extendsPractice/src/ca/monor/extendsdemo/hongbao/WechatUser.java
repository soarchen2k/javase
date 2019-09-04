package ca.monor.extendsdemo.hongbao;

public class WechatUser {
    private String username;
    private double balance;

    public WechatUser() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void show() {
        System.out.println("Username : " + getUsername() + " , Balance : " + getBalance());
    }

    @Override
    public String toString() {
        return "WechatMember{" +
                "username='" + username + '\'' +
                ", balance=" + balance +
                '}';
    }
}
