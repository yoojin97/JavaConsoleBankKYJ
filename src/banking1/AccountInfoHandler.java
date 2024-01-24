package banking1;

import java.util.Scanner;

public class AccountInfoHandler {

   private Account[] accountLists;
   private int numOfAccount;
   
   public AccountInfoHandler() {
      accountLists = new Account[50];
      numOfAccount = 0;
   }

 //계좌개설
  public void makeAccount() { 
     Scanner scan = new Scanner(System.in);
     String accountNo,name;
 
     int balance;
     int interest;
     String grade;

         System.out.println("***신규계좌개설***");
            System.out.print("계좌번호 :"); accountNo = scan.next();
            System.out.print("고객이름 :"); name = scan.next();
            System.out.print("잔고 :"); balance = scan.nextInt();
            
            Account info = new Account(accountNo, name, balance);
            accountLists[numOfAccount++] = info;
        
        System.out.println("계좌개설이 완료되었습니다.");
}
     
   
  //입금
     public void depositMoney() {
        
     Scanner scan = new Scanner(System.in);
     
     System.out.println("계좌번호와 입금할 금액을 입력하세요.");
     String accountNo;
     int deposit;
     
     System.out.print("계좌번호: "); accountNo = scan.nextLine();
     for(int i =0; i<numOfAccount; i++) {    
      if (accountLists[i].accountNo == accountNo) {    
      
    	  System.out.print("입금액: "); deposit = scan.nextInt();
    	  accountLists[i].balance += deposit; 
        }
       System.out.println("입금이 완료되었습니다.");      
     }   
   }
     
   //출금
     public void withdrawMoney() {
        Scanner scan = new Scanner(System.in);
        System.out.println("계좌번호와 출금할 금액을 입력하세요.");
        String accountNo;
        int deposit;
        
        System.out.print("계좌번호: "); accountNo = scan.nextLine();
        for(int i =0; i<numOfAccount; i++) {
          System.out.println("출금액: "); deposit = scan.nextInt();
          accountLists[i].balance -= deposit;
          
          System.out.println("출금이 완료되었습니다.");
        }         
        }
     //계좌정보출력
     public void showAccInfo() {
        
        System.out.print("***계좌정보출력***"); 
        for(int i =0; i<numOfAccount; i++) {
           accountLists[i].showAccInfo(); 
        }
        System.out.println("전체계좌정보 출력이 완료되었습니다.");
     }
  }  
   

//추가질문) 보통,신용계좌 두개를 만들지 않을 경우엔 null이 나오는데 그럼 두개의 계좌가 필수인건지, 한개의 계좌를 만들었을때 null값이 안나오려면 if문을 사용해야하는지?

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

