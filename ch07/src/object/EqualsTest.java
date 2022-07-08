package object;

public class EqualsTest {
   public static void main(String[] args) {
      
      String color1 = new String("빨강");
      String color2 = new String("빨강");
      
      //메모리 주소 비교
      System.out.println(color1 == color2); //false
      
      //저장된 값(문자열)비교
      System.out.println(color1.equals(color2)); //true
      
      Book book1 = new Book(12, "개미");
      Book book2 = new Book(12, "개미");
   
      //메모리 주소 비교
      System.out.println(book1 == book2); //false
      //저장된 값(문자열)비교
      System.out.println(book1.equals(book2)); //true
      
      //hashCode
      System.out.println(color1.equals(book2));
   }
}