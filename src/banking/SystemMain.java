package banking;

import java.util.Scanner;

public class SystemMain {

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
		AccountInfoHandler handler = new AccountInfoHandler(50);

		while (true){
			showMenu() ;          
		  	
			int choice=scan.nextInt();
		  	
		  	switch(choice) {
		  	
		  	case IManager.MAKE:
		  		handler.makeAccount();
		  		break;
		  	case IManager.DEPOSIT:
		  		handler.depositMoney();
		  		break;
		  	case IManager.WITHDRAW:
		  		handler.withdrawMoney();
		  		break;
		  	case IManager.INQUIRE:
		  		handler.showAccInfo();
		  		break;
		  	case IManager.EXIT:
		  		System.out.println("프로그램 종료");
		  		return;
			}   
		}
	}
	
}

