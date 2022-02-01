import java.util.Scanner;

public class Main2438 {

	public static void main(String[] args) {  // 204초
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {   // i = 0,  세로 담덩
			for (int j = 0; j < i + 1; j++) {  // j는 * 1번 출력  가로 담당
				System.out.print("*");
			}
			System.out.println();  // 그 다음 라인으로 내려가기
		sc.close();
		}
	}
}
