
public class Test {
	public static void main(String[] args) {
		MyDate md1 = new MyDate(9, 8, 2020);
		MyDate md2 = new MyDate(10, 1, 2023);
		MyDate md3 = new MyDate(9, 8, 2020);
		
		System.out.println(md1);
		System.out.println(md2);
		System.out.println(md3);
		
		System.out.println("md1 so sanh voi md2 : " + md1.equals(md2));
		System.out.println("md1 so sanh voi md3 : " + md1.equals(md3));
//		System.out.println("Day = " + md.getDay());
//		md.setDay(35);
//		System.out.println("Day = " + md.getDay());
//		md.setDay(30);
//		System.out.println("Day = " + md.getDay());
	}
}
