package banking2;

import java.util.Scanner;

import banking2.Account;

public class AccountManager {

	private Account[] accountLists;
	private int numOfAccount;

	public AccountManager() {
		accountLists = new Account[50];
	}

	// 계좌개설
	/*Account클래스 내에는 계좌번호/이름/잔액의 멤버변수,
	입금과 출금시 잔액이 변경되어야 하기에 이에 관련된 함수가 존재함*/
	
	public void makeAccount() {
		Scanner scan = new Scanner(System.in);
		String accountNo, name;
		
		//string형과 int형을 통해 잔고, 이자, 등급 생성
		int balance; 
		int interest; 
		String grade;

		System.out.println("***계좌선택***");
		System.out.println("1.보통계좌");
		System.out.println("2.신용신뢰계좌");
		int choice = scan.nextInt();
		
		// choice로 1번 선택시 보통예금계좌로 이동하여 스캔을 전부 읽으면 accountlists에 담는다
		if (choice == 1) {
			System.out.println("***신규계좌개설***");
			System.out.print("계좌번호 :");
			accountNo = scan.next();
			System.out.print("고객이름 :");
			name = scan.next();
			System.out.print("잔고 :");
			balance = scan.nextInt();
			System.out.print("기본이자%(정수형태로입력):");
			interest = scan.nextInt();
			
			accountLists[numOfAccount++]= new NormalAccount(accountNo, name, balance, interest);
		
		//신용신뢰계좌
		} else {
			System.out.println("***신규계좌개설***");
			System.out.print("계좌번호 :");
			accountNo = scan.next();
			System.out.print("고객이름 :");
			name = scan.next();
			System.out.print("잔고 :");
			balance = scan.nextInt();
			System.out.print("기본이자%(정수형태로입력):");
			interest = scan.nextInt();
			System.out.print("신용등급(A,B,C등급):");
			grade = scan.next();
			accountLists[numOfAccount++] = new HighCreditAccount(accountNo, name, balance, interest, grade);

		}

		System.out.println("계좌개설이 완료되었습니다.");
	}

	// 입금
	public void depositMoney() {

		Scanner scan = new Scanner(System.in);

		System.out.println("계좌번호와 입금할 금액을 입력하세요.");
		String accountNo;
		int deposit;

		System.out.print("계좌번호: "); accountNo = scan.nextLine();
		
		/*문자나 객체를 비교할 때는 ==가 아닌 equals를 사용해야함
			 문자열은 주소를 저장하기 때문에 내용이 같더라도 서로 다른 객체를 참조하고 있으면
			 == 비교연산자를 사용할 경우 결과가 달라지기 때문이다. */
		
		/* numOfAccount안에 계좌정보가 담겨있어 각 정보를 읽을 수 있으며
		  그 계좌의 잔고를 확인해 deposit으로 더해준다. */
		for (int i = 0; i < numOfAccount; i++) {
			if (accountNo.equals(accountLists[i].accountNo)) {
				
				System.out.print("입금액: "); deposit = scan.nextInt();
				accountLists[i].balance += deposit;
			}
		}
		System.out.println("입금이 완료되었습니다.");
	}

	// 출금
	public void withdrawMoney() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("계좌번호와 출금할 금액을 입력하세요.");
		String accountNo;
		int deposit;

		System.out.print("계좌번호: "); accountNo = scan.nextLine();
		
		for (int i = 0; i < numOfAccount; i++) {
			System.out.println("출금액: "); deposit = scan.nextInt();
			accountLists[i].balance -= deposit;

			System.out.println("출금이 완료되었습니다.");
		}
	}

	// 계좌정보출력
	public void showAccInfo() {

		System.out.println("***계좌정보출력***");
		
		for (int i = 0; i < numOfAccount; i++) {
			accountLists[i].showAccInfo();
		}
		
		System.out.println("전체계좌정보 출력이 완료되었습니다.");
	}
}

