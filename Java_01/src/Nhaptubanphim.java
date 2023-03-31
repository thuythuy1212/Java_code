import java.util.Scanner;

public class Nhaptubanphim {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao ho va ten : ");
		String hoVaTen = sc.nextLine();
		
		System.out.println("Nhap vao MSSV: ");
		String maSoSV = sc.nextLine();
		
		System.out.println("Nhap vao diem thi: ");
		float diemThi = sc.nextFloat();
		
		System.out.println("------------");
		System.out.println("Họ và tên sinh viên : " + hoVaTen);
		System.out.println("Mã số sinh viên : " + maSoSV);
		System.out.println("Điểm thi : " + diemThi);
		
	}
}
