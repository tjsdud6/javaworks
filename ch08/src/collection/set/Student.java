package collection.set;

public class Student {
	String name;
	int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student)obj;
			//name 비교해도 가능 - hashCode() 이기때문에 
			if(student.name.equals(name) && (student.age == age)) {
				return true;
			}
		}
		return false;
	}
	
	
}
