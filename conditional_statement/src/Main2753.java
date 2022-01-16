
import java.util.Scanner;

public class Main2753 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		// 4의배수이면서 100의 배수가 아니거나 400의 배수이면 1, 아니면 0
		if(year%4==0 && !(year%100==0) || (year%400==0)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	
		sc.close();
	}
}
