package banking3;

public class HighCreditAccount extends Account1{
   int interest;
   String grade;
      public HighCreditAccount(String accountNo, String name, int balance, int interest, String grade) {   

         super(accountNo, name, balance,   interest,grade);


}
      @Override
      public void showAccInfo1() {
      
         super.showAccInfo1();
         System.out.println("기본이자: " +interest   + "%");      
         System.out.println("신용등급: " +grade);
      }
   }   