import java.io.*;

public class Main1065 {

	public static void main(String[] args) {  //76ms
		// 1보다 크고 입력받은 값(N)보다 작거나 같은 한수의 개수 출력
		// 한수는 각 자리 수가 등차수열을 의미함 (등차수열 두개의 수의 차이가 일정함)
		// 등차수열의 예 [1,1,1,1,1], [1,2,3,4,5], [2,4,6,8,10]
		// 1~99인 경우 각 자리수 자체가 수열이어서 케이스를 100보다 큰 경우, 작은 경우로 나누기
		// 1000은 등차수열이 아니기 때문에 1000이 오게되면 999로 변환
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
		int x = Integer.parseInt(br.readLine());
		System.out.println(d(x));
		
		}catch(IOException i) {
			i.printStackTrace();
		}
	}
	
	private static int d(int num) { // 등차수열의 개수를 구할 메서드
		int cnt = 0;  // 한수의 개수를 셀 cnt 변수 생성
		
		if(num<100) { // 100보다 작은 경우는 그냥 return 
			return num;
		} else {       // 100 보다 큰 경우 
			cnt = 99;  // 100이전까지는 등차수열이 성립되기 때문에 cnt가 99부터 시작
			if(num==1000) {  // num이 1000이라면 한수가 xx num을 999로 초기화
				num --;
			}
			for(int i = 100; i<=num; i++) {  // num이 3자리일 경우에 등차수열 구하기
				int hun = i/100;      // 백의 자리
				int ten = (i/10)%10;  // 십의 자리
				int one = i%10;       // 일의 자리
				
				int d1 = hun-ten;  // 백의 자리 - 십의자리
				int d2 = ten-one;  // 십의 자리 - 일의자리
				
				if((d1)==(d2)) { // 등차수열의 조건(공차가 같아야 함)
					cnt++;
				}
			}
		}
		return cnt;
	}
}
