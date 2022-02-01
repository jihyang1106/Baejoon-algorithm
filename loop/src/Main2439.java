import java.util.Scanner;

public class Main2439 {

	public static void main(String[] args) {  // 260ms
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {   // 세로
			for (int j = 0; j < (n - 1) - i; j++) {  // 가로 공백
				System.out.print(" ");               // 공백을 담당하는 for문
			}
			for (int j = 0; j < i + 1; j++) {  // 가로 별
				System.out.print("*");         // 별을 담당하는 for문
			}
			System.out.println();
		}
		sc.close();
	}
}