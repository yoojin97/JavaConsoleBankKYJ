package banking3;

import banking1.ICustomDefine;

public class Account1 {
    String accountNo;
    String name;
    int balance;
    int interest;
    String grade;
    
    public Account1(String accountNo, String name, int balance, int interest,String grade) {
       this.accountNo = accountNo;
       this.name = name;
       this.balance= balance;
       this.interest= interest;
       this.grade= grade;
    }
 
    public void showAccInfo1() {
    System.out.println("------------------");
    System.out.println("계좌번호: " +accountNo);
    System.out.println("고객이름: " +name);
    System.out.println("잔고: " +balance);
    System.out.println("기본이자: " +interest);
    }
    
    public void cal1() {
       if("A".equals(this.grade)) {
          balance += balance * (interest*0.01) + balance  * ( ICustomDefine.Ical.A *0.01);                    
        }else if("B".equals(this.grade)) {
          balance += balance * (interest*0.01) + balance  * ( ICustomDefine.Ical.B *0.01);                    
        }else if("C".equals(this.grade)) {
          balance += balance * (interest*0.01) + balance  * ( ICustomDefine.Ical.C *0.01);                    
        }
       
    }
}
