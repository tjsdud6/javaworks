package variable;

public class VariableScopeExample {

	public static void main(String[] args) {
		// 
		int v1 = 15;
		if(v1>10) {
			int v2;
			v2 = v1 - 10;
		}
		int v3 = v1 + 5; //v2는 if문을 나오면서 소멸
	}

}
