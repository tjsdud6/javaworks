package string;

public class StringCharAt {
   public static void main(String[] args) {
      
      //charAt(index) - 매개값으로 주어진 인덱스의 문자를 리턴함
      //0번부터 시작
      String subject = "자바 프로그래밍";
      char charValue = subject.charAt(3);
      System.out.println(charValue);
      
      //주민등록번호로 남자와 여자 구분
      String ssn = "200815-1234567";
      char gender = ssn.charAt(7);
      switch(gender) {
      case '1':
      case '3':
         System.out.println("남자입니다.");
         break;
      case '2':
      case '4':
         System.out.println("여자입니다.");
         break;
      }
   }
}