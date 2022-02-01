import java.util.Scanner;

public class Main1110 {

	public static void main(String[] args) {  //108ms
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();  // 입력값 받기
		int num = n;             // 원래수와 비교할 때 필요한 변수
		int count = 0;      // 몇 번 만에 원래수로 돌아올 수 있는지 카운트 세기 
		
		while(true) {
			int q = num/10;   // 예) 26/10하면 십의자리 2를 q에 저장
			int r = num%10;   // 예) 26%10하면 일의자리 6을 r에 저장
			int sum = q+r;    // 예) 십의자리 2 + 일의자리 6 = 8
			
			num = r*10 + sum%10;  // 새로운 수 = 일의자리6*10 + 합%10 (합의 가장 오른쪽 자리 수) 
			count ++;             // 새로운 수를 만들때마다 카운트 세기
			
			if(n==num) {   // 원래 기존 값과 바뀐 값이 동일할 때 멈춤
				break;
			}
		}
		System.out.println(count);
		scan.close();
	}
}
