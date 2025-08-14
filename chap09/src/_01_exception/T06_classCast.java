package _01_exception;

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

public class T06_classCast {

	public static void main(String[] args) {
		try {
			Animal ani = new Animal();
			Dog dog = new Dog();
			Cat cat = new Cat();
			
			// Animal aniDog = dog;
			Animal aniDog = new Dog();
			//Animal aniCat = cat;
			Animal aniCat = new Cat();
			
			System.out.printf("aniDog를 dog로 형변환\n");
			dog = (Dog)aniDog; // 가능
			System.out.printf("ani를 dog로 형변환\n");
			dog = (Dog)ani; // 예외발생
		} catch (Exception e) {
			System.out.printf("부모타입으로 만든 객체는 자식 타입으로 형변환 불가 %s\n",e);
		}
	}

}
