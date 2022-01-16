
import java.util.Scanner;

public class Main2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();

		/*
		 * 1) m이 45보다 작을 때 2) m이 45보다 클 때 
		  	(1) 기존의 h-1 (2) 먼저 45-입력받은 수(m)=m1, 60-m1 = 분을구할 수 있음 
		  	(1)-1 만약 h가 0보다 작아지게 되면 23으로 출력 
		 * 2) m이 45보다 클 때 그냥 45-m 출력
		 */

		if (m < 45) {              
			h--;                  
			m = 60 - (45 - m);     
			if (h < 0) {           
				h = 23;
			}
			System.out.println(h + " " + m);
		} else {  // 2)
			System.out.println(h + " " + (m - 45));
		}
		sc.close();
	}
}