package singleton;

public class CompanyTest {

	public static void main(String[] args) {
		Company myCompany1 = Company.getInstance();
		Company myCompany2 = Company.getInstance();
		
		//두 인스턴스가 같은 주소인지 확인 (주소는 "=="를 사용)
		//인스턴스 객체가 같은 주소이므로 1개로 간주할 수 있음
		System.out.println(myCompany1);
		System.out.println(myCompany2);
		
		
	}

}
