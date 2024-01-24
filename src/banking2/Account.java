package banking2;

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
    
    public void cal() {}
}

/*banking1 infohandler에 있는 입금부분 deposit를 받아서
뱅킹1에 account(보통계좌), 뱅킹2에 있는 account1(신용계좌)계산식을 합치는 부분 */

