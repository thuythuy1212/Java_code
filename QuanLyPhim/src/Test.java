
public class Test {
	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(20, 7, 2009);
		Ngay ngay2 = new Ngay(4, 11, 2022);
		Ngay ngay3 = new Ngay(12, 2, 2018);
		HangSanXuat hang1 = new HangSanXuat("TIVI-VietNam", "Viet Nam");
		HangSanXuat hang2 = new HangSanXuat("DaiTruyenHinhVietNam", "Viet Nam");
		HangSanXuat hang3 = new HangSanXuat("SHS", "Han Quoc");
		
		Phim phim1 = new Phim("Hoa Hong Den", 2008, hang1, 80000, ngay1);
		Phim phim2 = new Phim("Toi Thay Hoa Vang Tren Co Xanh", 2010 , hang2, 90000, ngay2);
		Phim phim3 = new Phim("Ha Canh Noi Anh", 2018, hang3, 70000, ngay3);
		
		System.out.println("SS gia 1 re hon 2 : " + phim1.kiemTraGiaVePhimReHonPhimKhac(phim2));
		System.out.println("SS gia 1 re hon 3 : " + phim1.kiemTraGiaVePhimReHonPhimKhac(phim3));
		
		System.out.println("Ten cua Hang San Xuat phim 3 : " + phim3.layTenHangSanXuat());
		
		System.out.println("Gia ve sau khi giam cua phim 1 : " + phim1.giaSauKhuyenMai(10));
		System.out.println("Gia ve sau khi giam cua phim 2 : " + phim1.giaSauKhuyenMai(20));
		System.out.println("Gia ve sau khi giam cua phim 3 : " + phim1.giaSauKhuyenMai(30));
	}
}
