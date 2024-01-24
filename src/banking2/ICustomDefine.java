package banking2;

public interface ICustomDefine {

	final int MAKE = 1; // => 계좌개설
	final int DEPOSIT = 2; // => 입금
	final int WITHDRAW = 3; // => 출금
	final int INQUIRE = 4; // => 전체계좌정보출력
	final int EXIT = 5; // => 프로그램 종료

	public interface Ical {
		int A = 7;
		int B = 4;
		int C = 2;
	}
}