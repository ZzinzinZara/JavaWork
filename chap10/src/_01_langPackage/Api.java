package _01_langPackage;

import java.util.Objects;

public class Api {
	String name;
	int age;

	@Override
	public boolean equals(Object o) {
		return name == ((Api) o).name && age == ((Api) o).age;
	}

	@Override 
	public int hashCode() { 
		return Objects.hash(age,name); 
	}


	@Override
	public String toString() {
		return "이름: " + name + ", 나이: " + age;
	}
}
