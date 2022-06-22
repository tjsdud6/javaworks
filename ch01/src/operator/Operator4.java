package operator;

public class Operator4 {

	public static void main(String[] args) {
			// @AND(&&) 두 값이 모두 참일 경우에만 true
			System.out.println(true && true);
			System.out.println(true && false);
			System.out.println(true && (5 < 3));
			System.out.println((5 <= 5) && (7 > 2));
			System.out.println();
			
			// @OR(||) 두 값중 하나만 참일 경우 true
			System.out.println(true || true);
			System.out.println(true || false);
			System.out.println(true || (5 < 3));
			System.out.println((5 <= 5) || (7 > 2));
			System.out.println();
			
			//@XOR(^) 두 값이 다른 경우에만 true
			System.out.println(true ^ true);
			System.out.println(true ^ false);
			System.out.println(true ^ (5 < 3));
			System.out.println((5 <= 5) ^ (7 > 2));
			System.out.println();
			
			//@NOT(!) 참인 경우 거짓으로, 거짓인 경우 참으로
			System.out.println(!true);
			System.out.println(!false);
			System.out.println(false || !(5 < 3));
			System.out.println((5 <= 5) || !(7 > 2));
			
			
			System.out.println(true & true);
			System.out.println(true & false);
			System.out.println(true | (5 < 3));
			System.out.println((5 <= 5) | (7 > 2));
			System.out.println();
			

			int value1 = 3;
			System.out.println(false && ++value1 > 6);
			System.out.println(value1);
			
			int value2 = 3;
			System.out.println(false & ++value2 > 6);
			System.out.println(value2);
			
			int value3 = 3;
			System.out.println(true || ++value3 > 6);
			System.out.println(value3);
			
			int value4 = 3;
			System.out.println(true && ++value4 > 6);
			System.out.println(value4);
		}

	}

