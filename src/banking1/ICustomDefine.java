package banking1;

public class ICustomDefine {
      public interface IManager {
            int MAKE = 1; // => 계좌개설
            int DEPOSIT = 2; // => 입금
            int WITHDRAW = 3; // => 출금
            int INQUIRE = 4; // => 전체계좌정보출력
            int EXIT = 5; // => 프로그램 종료
      }
      public interface Ical {
            int A = 7;
            int B = 4;
            int C = 2;
      }
}