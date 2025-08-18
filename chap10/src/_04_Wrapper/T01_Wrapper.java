package _04_Wrapper;

public class T01_Wrapper {

	public static void main(String[] args) {
		Integer i1 = new Integer(3);
		Integer i2 = Integer.valueOf(3);
		Integer i3 = null;
		System.out.println(i1.toString());
		System.out.println(i2.toString());
//		System.out.println(i3.toString()); // null 들어가있는건 toString 못함
		
		System.out.println("max value: "+Integer.MAX_VALUE);
		System.out.println("min value: "+Integer.MIN_VALUE);
		System.out.println("size: "+Integer.SIZE+"bit");
		System.out.println("Bytes: "+Integer.BYTES+"byte");
		System.out.println("type: "+Integer.TYPE);
	}
}
