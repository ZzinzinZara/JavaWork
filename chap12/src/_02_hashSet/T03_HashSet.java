package _02_hashSet;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Member{
	String name;
	int age;
	Member(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Member) {
			return this.name == ((Member)o).name && this.age == ((Member)o).age;
			}
		return false;
		}
	
	@Override
	public int hashCode() { 
		return Objects.hash(name, age);
	}
	
	@Override
	public String toString() {
		return name +", "+age;
	}
}

// Object equals ==> 주소가 같은가? 해시코드로 판단
// ==> 값이 같은면 같은 해시코드가 나오게 오버라이딩 해줘야 함 

public class T03_HashSet {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();
		// Set은 순서가 없어서 오름차순, 내림차순 불가능
		
		set.add(new Member("홍길동",20));
		set.add(new Member("남궁용진",20));
		set.add(new Member("홍길동",20));
		set.add(new Member("홍길동",24));
		set.add(new Member("이용진",27));
		
		System.out.println("객체 수: "+set.size()); // 오버라이딩 한것만으로도 객체 수가 줄어드네?
		System.out.println(set);

	}

}
