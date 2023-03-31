import java.util.Scanner;

public class Pheptoanjava {
	public static void main(String[] args) {
		//khai báo bien
		int a, b;
		
		//Nhap du lieu tu ban phim
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap gia tri a = ");
		a = sc.nextInt();
		System.out.println("Nhap gia tri b = ");
		b = sc.nextInt();
		
		int tong = a + b;
		System.out.println(a + " + " + b + " = " + tong);
		
		int hieu = a - b;
		System.out.println(a + " - " + b + " = " + hieu);
		
		int nhan = a * b;
		System.out.println(a + " * " + b + " = " + nhan);
		
		float thuong = (float)a / b;
		System.out.println(a + " / " + b + " = " + thuong);
		
		int soDu = a % b;
		System.out.println(a + " % " + b + " = " + soDu);
	}
}
