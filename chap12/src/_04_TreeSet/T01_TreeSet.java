package _04_TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class T01_TreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> score = new TreeSet<>();
		score.add(89);
		score.add(98);
		score.add(75);
		score.add(100);
		score.add(95);
		
		System.out.println("가장 낮은 점수: "+score.first());
		System.out.println("가장 높은 점수: "+score.last());
		System.out.println("95미만: "+score.lower(95));
		System.out.println("95초과: "+score.higher(95));
		System.out.println("95이하: "+score.floor(95));
		System.out.println("85이상: "+score.ceiling(85));
		
		Set<Integer> lotto = new TreeSet<>();
		while(lotto.size()<6) {
			lotto.add((int)(Math.random()*45)+1);
		}
		System.out.println(lotto);
	}
}
