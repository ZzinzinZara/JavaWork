package _01_arrayList_vector;

import java.util.ArrayList;
import java.util.List;

public class Javabin_Run {

	public static void main(String[] args) {
		List<Javabin> list = new ArrayList<>();
		
		list.add(new Javabin("skarnddydwls","dydwls12","남궁용진", "01099748286"));
		list.add(new Javabin("gohome","homehome","집갈래","01064388286"));
		list.add(new Javabin("hihi","hi12","김하이","01054389577"));
		list.add(new Javabin("sisisi","barbar","김시발","01066523584"));
		list.add(new Javabin("baba","sisibq","이시발","01099856657"));
		
		for(Javabin b:list) {
			System.out.print(b.getId()+"\t");
			System.out.print(b.getPassword()+"\t");
			System.out.print(b.getName()+"\t");
			System.out.println(b.getPhone());
		}
	}

}
