
import java.util.Scanner;

public class Main2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();

		/*
		 * 1) m�� 45���� ���� �� 2) m�� 45���� Ŭ �� 
		  	(1) ������ h-1 (2) ���� 45-�Է¹��� ��(m)=m1, 60-m1 = �������� �� ���� 
		  	(1)-1 ���� h�� 0���� �۾����� �Ǹ� 23���� ��� 
		 * 2) m�� 45���� Ŭ �� �׳� 45-m ���
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