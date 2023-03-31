import java.util.Iterator;
import java.util.Scanner;

public class mang {
	public static void main(String[] args) {
		double[] mang1;
		double mang2[];
		
		mang1 = new double[10];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<mang1.length; i++) {
			System.out.println("Nhap phan tu thu "+i+ ":");
			mang1[i] = sc.nextDouble();
		}
		double tong = 0;
		for (int i = 0; i < mang1.length; i++) {
			tong+=mang1[i];
		}
		System.out.println("Tong ="+ tong);
		//Gan gia tri cho mang
		mang2 = new double[] {1,2,3,4,5,6,7};
		for (int j = 0; j < mang2.length; j++) {
			System.out.println("Gia tri cua mang 2 là" + mang2[j]);
		}
	}
}
