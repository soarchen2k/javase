package ca.monor.extendsdemo.hongbao;

public class Test {
    public static void main(String[] args) {
        GroupMaster groupMaster = new GroupMaster();
        groupMaster.setUsername("Qunzhu");
        groupMaster.setBalance(1000);
        groupMaster.setMoneySent(255);

        GroupMember groupMember = new GroupMember();
        groupMember.setUsername("Member1");
        groupMember.setBalance(15);
        System.out.println(groupMaster);
        System.out.println(groupMember);
        System.out.println("------------------------------------------------------");
        groupMaster.giveHongBao(groupMember);
        System.out.println("------------------------------------------------------");
        System.out.println(groupMaster);
        System.out.println(groupMember);
    }
}
