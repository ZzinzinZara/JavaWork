package _06_compare;

import java.util.TreeSet;

class Person implements Comparable<Person> {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Person o) {
		if(age < o.age)return -1;
		else if (age == o.age) return 0;
		else return 1;
	}
}

public class T01_CompareTo {

	public static void main(String[] args) {
		TreeSet<Person> p1 = new TreeSet<>();
		
		p1.add(new Person("홍길동",44));
		p1.add(new Person("김길동",24));
		p1.add(new Person("양길동",64));
		
		System.out.println(p1);
	}

}
