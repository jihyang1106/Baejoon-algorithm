
import java.util.Scanner;

public class Main2753 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		// 4�ǹ���̸鼭 100�� ����� �ƴϰų� 400�� ����̸� 1, �ƴϸ� 0
		if(year%4==0 && !(year%100==0) || (year%400==0)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	
		sc.close();
	}
}
