
public class Test {
	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(12,8,2001);
		Ngay ngay2 = new Ngay(9,2,2022);
		Ngay ngay3 = new Ngay(12,8,2001);
		
		TacGia tacGia1 = new TacGia("Hoang Phu Ngoc Tuong", ngay1);
		TacGia tacGia2 = new TacGia("Nguyen Du", ngay2);
		TacGia tacGia3 = new TacGia("Thanh Hai", ngay3);
		
		Sach sach1 = new Sach("Ai da dat ten cho dong song", 5000, 2005, tacGia1);
		Sach sach2 = new Sach("Truyen Kieu", 10000, 1997, tacGia2);
		Sach sach3 = new Sach("Dat Nuoc", 50000, 2005, tacGia3);
		
		sach1.inTenSach();
		sach2.inTenSach();
		sach3.inTenSach();
		
		System.out.println("So sanh sach 1 va sach 3: " + sach1.kiemTraCungNamXuatBan(sach3));
		System.out.println("So sanh sach 1 va sach 2: " + sach1.kiemTraCungNamXuatBan(sach2));
		
		System.out.println("Sach 1 giam 10% : " + sach1.giaSauKhiGiam(10));
		System.out.println("Sach 2 giam 20% : " + sach2.giaSauKhiGiam(20));
		System.out.println("Sach 3 giam 15% : " + sach3.giaSauKhiGiam(50));
	}
}
