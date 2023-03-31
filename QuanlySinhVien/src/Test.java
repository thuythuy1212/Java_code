
public class Test {
	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(10, 3, 2001);
		Ngay ngay2 = new Ngay(4, 9, 2000);
		Ngay ngay3 = new Ngay(10, 3, 2001);
		
		Lop lop1 = new Lop("Lop A", "Khoa IT");
		Lop lop2 = new Lop("Lop B", "Khoa CE");
		Lop lop3 = new Lop("Lop C", "Khoa BA");
		
		SinhVien sinhVien1 = new SinhVien("105IT", "Nguyen Van A", ngay1, 8.2, lop1);
		SinhVien sinhVien2 = new SinhVien("189CE", "Hoang Thi B", ngay2, 4.8, lop2);
		SinhVien sinhVien3 = new SinhVien("235BA", "Lê Van C", ngay3, 6.9, lop3);
		
		System.out.println("Khoa sinhVien 1 : " + sinhVien1.layTenKhoa());
		System.out.println("Khoa sinhVien 2 : " + sinhVien2.layTenKhoa());
		System.out.println("Khoa sinhVien 3 : " + sinhVien3.layTenKhoa());
		
		System.out.println("sinhVien 1 : " + sinhVien1.kiemTraThiDat());
		System.out.println("sinhVien 2 : " + sinhVien2.kiemTraThiDat());
		System.out.println("sinhVien 3 : " + sinhVien3.kiemTraThiDat());
		
//		System.out.println("sinhVien 3 : " + sinhVien3.getNgaySinh());
//		System.out.println("sinhVien 1 : " + sinhVien1.getNgaySinh());
		
		System.out.println("Kiem tra cung ngay sinh 1 voi 2 : " + sinhVien1.kiemTraCungNgaySinh(sinhVien2));
		System.out.println("Kiem tra cung ngay sinh 1 voi 3 : " + sinhVien1.kiemTraCungNgaySinh(sinhVien3));
		
	}
}
