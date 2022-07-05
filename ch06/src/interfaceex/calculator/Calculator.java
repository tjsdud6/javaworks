package interfaceex.calculator;

public interface Calculator {
	//정수형 계산기 설계
	
	//필드 - 상수 final을 생략해도 컴파일 과정에서 상수로 변환
	final int ERROR = -9999;
	
	
	
	//추상 메소드
	int add(int n1, int n2);
	int subtract(int n1, int n2);
	int times(int n1, int n2);
	int divide(int n1, int n2);
}

