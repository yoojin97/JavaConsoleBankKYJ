package banking3;

import banking1.Account;

public class NormalAccount extends Account {
         int interest;
   public NormalAccount(String accountNo, String name, int balance, int interest) {   
      super(accountNo, name, balance,   interest);
      
      
   }
   @Override
   public void showAccInfo() {
      super.showAccInfo();
      System.out.println("기본이자: " +interest   + "%");   
   }
}   