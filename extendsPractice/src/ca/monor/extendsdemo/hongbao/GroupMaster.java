package ca.monor.extendsdemo.hongbao;

public class GroupMaster extends WechatUser {
    private double moneySent;

    public GroupMaster() {
    }

    public double getMoneySent() {
        return moneySent;
    }

    public void setMoneySent(int moneySent) {
        this.moneySent = moneySent;
    }

    public double giveHongBao(GroupMember groupMember) {
        if (moneySent > getBalance()) {
            System.out.println(this.getUsername() + " don't have enough money!");
            return 0;
        } else {
            this.setBalance(this.getBalance() - moneySent);
            groupMember.setBalance(groupMember.getBalance() + moneySent);
            System.out.println(this.getUsername() + " give hong bao: " + moneySent + " yuan!");
            System.out.println(groupMember.getUsername() + " get hong bao: " + moneySent + " yuan!");
            return moneySent;
        }
    }
}
