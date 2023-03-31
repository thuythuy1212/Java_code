
public class caulenhrenhanhcontinue {
	public static void main(String[] args) {		
//		int max = 100;
//		for(int i =0; i<max; i++) {		
//			if(i<50)
//				continue;
//			System.out.println(i);
//			// continue bỏ qua những câu lệnh bên dưới nó(khong thực thi)
		//}
		
		// có label 
		outer: for(int i = 2; i <= 9; i ++) {
			for(int j = 1; j <= 10; j++) {
				if(j>5)
					continue outer;
				System.out.println(i+ " x "+j + " = " +(i*j));
			}
			System.out.println("-------");
			// cau lenh re nhanh co label nó bỏ qua vong lap ben trong
		}
		}
}
