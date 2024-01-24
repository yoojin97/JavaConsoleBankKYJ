package banking1;

public class Account {
    String accountNo;
    String name;
    int balance;
    
    public Account(String accountNo, String name, int balance) {
       this.accountNo = accountNo;
       this.name = name;
       this.balance= balance;
    }
    public void showAccInfo() {
    System.out.println("------------------");
    System.out.println("계좌번호: " +accountNo);
    System.out.println("고객이름: " +name);
    System.out.println("잔고: " +balance);
    }

}
      