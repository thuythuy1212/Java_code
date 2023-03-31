import java.util.Scanner;

public class phuongtrinhbac2 {
	public static void main(String[] args) {
		
		double a,b,c,x,x1,x2,delta;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a = ");
		a = sc.nextDouble();
		
		System.out.println("Nhap b = ");
		b = sc.nextDouble();
		
		System.out.println("Nhap c = ");
		c = sc.nextDouble();
		
		delta = Math.pow(b, 2) - 4*a*c;
		
		// giai pt bac 2
		if(a==0) {
			System.out.println("Nhap du lieu sai");
		}
		else {
			if (delta < 0) {
				System.out.println("Phuong trinh bac 2 vo nghiem");
			} else if (delta == 0) {
				x = -b / (2 * a);
				System.out.println("Phuong trinh bac 2 có mot nghiem " + x);
			} else {
				x1 = (-b - Math.sqrt(delta)) / (2 * a);
				x2 = (-b + Math.sqrt(delta)) / (2 * a);
				System.out.println("Phuong trinh bac 2 có 2 nghiem phan biet là " + x1 + "va" + x2);
			}
		}
	}
}
