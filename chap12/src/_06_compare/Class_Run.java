package _06_compare;

import java.util.Arrays;
import java.util.TreeSet;

class Class_Api implements Comparable<Class_Api>{
	String name;
	int cost;
	
	Class_Api(String name, int cost){
		this.name = name;
		this.cost = cost;
	}

	@Override
	public int compareTo(Class_Api c) {
		if(cost < c.cost) return -1;
		else if (cost == c.cost) return 0;
		else return 1;
	}
}

public class Class_Run {

	public static void main(String[] args) {
		TreeSet<Class_Api> ts = new TreeSet<>();
		ts.add(new Class_Api("남궁용진",20000));
		ts.add(new Class_Api("김용진",25000));
		ts.add(new Class_Api("이용진",600000));
		
		
	}

}
