
public class Test {
	public static void main(String[] args) {
		HoaDonCaPhe hd = new HoaDonCaPhe("Trung Nguyen", 100000, 1.5);
		HoaDonCaPhe hd2 = new HoaDonCaPhe("Trung Nguyen", 100000, 5.5);
		System.out.println("Tong tien : " + hd.tinhTongTien());
		System.out.println("Kiem tra khoi luong > 2 kg " + hd.kiemTraKhoiLuongLonHon(2));
		System.out.println("Kiem tra khoi luong > 1 kg " + hd.kiemTraKhoiLuongLonHon(1));
		System.out.println("Kiem Tra tong tien hd > 500k " + hd.kiemTraTongTienLonHon500K());
		System.out.println("Kiem Tra tong tien hd2 > 500k " + hd2.kiemTraTongTienLonHon500K());
		
		System.out.println("Giam gia cua Hd: " + hd.giamGia(10));
		System.out.println("Giam gia cua Hd2: " + hd2.giamGia(10));
		
		System.out.println("Tong tien sau khi giam gia cua Hd: " + hd.tinhTongTienSauKhiGiamGia(10));
		System.out.println("Tong tien sau khi giam gia cua Hd: " + hd2.tinhTongTienSauKhiGiamGia(20));
	}
}
