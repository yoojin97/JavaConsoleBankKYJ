package banking2;

import java.util.Scanner;

import banking1.ICustomDefine.IManager;

public class BankingSystemMain implements ICustomDefine {

   public static void showMenu() {
            
      System.out.println("======Menu=====");
      System.out.println("1.계좌개설");
      System.out.println("2.입   금");
      System.out.println("3.출   금");
      System.out.println("4.계좌정보출력");
      System.out.println("5.프로그램종료");
      System.out.println("===============");
         }
         
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      AccountManager handler = new AccountManager();

      while (true){
         showMenu() ;          
           
         int choice=scan.nextInt();
           
           switch(choice) {
           
           case MAKE:
              handler.makeAccount();
              break;
           case DEPOSIT:
              handler.depositMoney();
              break;
           case WITHDRAW:
              handler.withdrawMoney();
              break;
           case INQUIRE:
              handler.showAccInfo();
              break;
           case EXIT:
              System.out.println("프로그램 종료");
              return;
         }   
      }
   }
   
}
