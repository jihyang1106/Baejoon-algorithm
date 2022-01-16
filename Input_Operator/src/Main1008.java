
import java.util.Scanner;

public class Main1008 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();  // float으로 하면 공간부족!
		double b = sc.nextDouble();
		System.out.println(a/b);
		sc.close();
	}
}
