import java.util.Scanner;

public class gandljava {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	float a;
	System.out.println("Nhap vao so a =");
	//Cac phep gan
	a = sc.nextFloat();
	System.out.println("a = " + a);
	a+=3;
	System.out.println("a+=3 " + a);
	a-=2;
	System.out.println("a-=2 " + a);
	a*=5;
	System.out.println("a*=5 " + a);
	a/=6;
	System.out.println("a/=6 " + a);
	a%=8;
	System.out.println("a%=8 " + a);
			
}
}
