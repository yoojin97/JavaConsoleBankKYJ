package banking2;

public class HighCreditAccount extends Account{
   int interest;
   String grade;
   
      public HighCreditAccount(String accountNo, String name, int balance, int interest, String grade) {   
    	  super(accountNo, name, balance);
         
         this.interest = interest;
         this.grade = grade;

}
      @Override
      public void showAccInfo() {
      
         super.showAccInfo();
         System.out.println("기본이자: " +interest   + "%");      
         System.out.println("신용등급: " +grade);
      }
      
      @Override
      public void cal() {
   	       if("A".equals(this.grade)) {
   	          balance += balance * (interest*0.01) + balance  * ( ICustomDefine.Ical.A *0.01);                    
   	        }else if("B".equals(this.grade)) {
   	          balance += balance * (interest*0.01) + balance  * ( ICustomDefine.Ical.B *0.01);                    
   	        }else if("C".equals(this.grade)) {
   	          balance += balance * (interest*0.01) + balance  * ( ICustomDefine.Ical.C *0.01);                    
   	  }    
  }
}  