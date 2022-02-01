import java.util.Scanner;

public class Main4344 {

	public static void main(String[] args) {  //304 ms
		// 테스트케이스로 for문의 제한 두기
		// 두번째 들어온 값 만큼의 배열을 생성!(나중에 평균이넘는지 구해야 하기 때문에 배열성생)
		// 성적 점수 값을 배열에 넣고, 합계에 넣는다.(합계생성해야함)
		// 평균을 구한다. 
		// 평균이 넘는 학생 수는 for문을 실행해서 넘는지 확인한다.
		// 마지막에  %를 출력해준다. 
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();      // 테스트케이스
		
		for(int i=0; i<t; i++) {
			int n = sc.nextInt();   // 학생 수 만큼의 배열 생성하기
			int[] arr = new int[n];  
			
			int sum = 0;
			for(int j=0;j<arr.length;j++) {
				int score = sc.nextInt();  // 학생들의 점수를 생성된 배열에 넣기
				arr[j] = score;
				sum += score;              // 평균을 위한 합계
			}
			double avg = (double)sum/n;    // 평균이 double형이기 때문에 sum도 형변환
			int count = 0;                 // 평균이 넘는 학생수를 담을 count 변수
			
			for(int j=0; j<arr.length; j++) { // 평균이 넘는다면 count ++ 
				if(arr[j]>avg) {
					count ++;
				}
			}// 소수점 셋째자리까지 출력, %%하면 %로 출력, 비율이어서 *100, f이기 떄문에 count를 double로 형변환
			System.out.printf("%.3f%%\n", (double)count/n*100);  
		}
		sc.close();
	}
}
