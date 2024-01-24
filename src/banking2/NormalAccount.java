package banking2;

import banking1.ICustomDefine;

public class NormalAccount extends Account {
   int interest;
   public NormalAccount(String accountNo, String name, int balance, int interest) {   
      super(accountNo, name, balance);
      
      this.interest = interest;
   }
   @Override
   public void showAccInfo() {
      super.showAccInfo();
      System.out.println("기본이자: " +interest   + "%");   
   }
   
   @Override
   public void cal() {
	   balance += balance * (interest*0.01);          
   }
}   