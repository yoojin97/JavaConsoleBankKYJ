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
	public void makeAccount() {
		Scanner scan = new Scanner(System.in);
		String accountNo, name;

		int balance;
		int interest;
		String grade;

		System.out.println("***계좌선택***");
		System.out.println("1.보통계좌");
		System.out.println("2.신용신뢰계좌");
		int choice = scan.nextInt();

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

		System.out.print("계좌번호: ");
		accountNo = scan.nextLine();
		for (int i = 0; i < numOfAccount; i++) {
			/* accountNo String으로 했기에 숫자로 받을 수 없으므로 == 은 사용불가
				 compare to 또는 equals 를 사용해야함 */
			if (accountNo.equals(accountLists[i].accountNo)) {
				System.out.print("입금액: "); deposit = scan.nextInt();
				
				accountLists[i].balance += deposit;
			}

			System.out.println("입금이 완료되었습니다.");
		}
	}

	// 출금
	public void withdrawMoney() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("계좌번호와 출금할 금액을 입력하세요.");
		String accountNo;
		int deposit;

		System.out.print("계좌번호: ");
		accountNo = scan.nextLine();
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

//추가질문) 보통,신용계좌 두개를 만들지 않을 경우엔 null이 나오는데 그럼 두개의 계좌가 필수인건지, 한개의 계좌를 만들었을때 null값이 안나오려면 if문을 사용해야하는지?
