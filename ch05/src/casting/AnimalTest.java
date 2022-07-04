package casting;

import java.util.ArrayList;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}


	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

public class AnimalTest {

	public static ArrayList<Animal> animalList = new ArrayList<>();

	public static void main(String[] args) {
		//AnimalTest aTest = new AnimalTest();

		//객체 생성
		//Animal animal = new Human();
		animalList.add(new Human());
		animalList.add(new Eagle());
		animalList.add(new Tiger());
		
		for(Animal animal : animalList)
			animal.move();
		
		System.out.println("*******원래 형으로 다운 캐스팅*********");
		testCasting();
		//aTest.testCasting();
		
	}//main 닫기
	
	public static void testCasting() {
		for(int i=0; i<animalList.size(); i++) {
			Animal animal = animalList.get(i);
			if(animal instanceof Human) {
				Human human = (Human)animal;
				human.readBook();
			}else if(animal instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.flying();
			}else if(animal instanceof Tiger) {
			Tiger tiger = (Tiger)animal;
			tiger.hunting();
		}else {
			System.out.println();
			}
		}
	}
}	

