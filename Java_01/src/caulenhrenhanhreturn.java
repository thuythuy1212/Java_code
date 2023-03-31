
public class caulenhrenhanhreturn {
	public static void main(String[] args) {
	 for(int i = 2; i <= 9; i ++) {
			for(int j = 1; j <= 10; j++) {
				if(j>5)
					return;
				System.out.println(i+ " x "+j + " = " +(i*j));
			}
			System.out.println("-------");
			// cau lenh re nhanh return ngung luon vong lap for ngoai và trong
		}
	}
}
