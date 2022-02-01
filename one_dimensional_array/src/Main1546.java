import java.util.Scanner;

public class Main1546 {
  
	public static void main(String[] args) {  //148ms
		// 배열을 생성하지 않고 for문으로 입력값을 받아서 바로 최댓값을 구한뒤에 
		// 입력값은 평균을 구하기 위해서 sum에 다 넣는다.
		// 평균을 구할 때 sum*max*100/처음입력받은 수 이렇게 하면 원하는 결과를 얻을 수없다.
		// 왜냐하면 avg가 double이기 때문에 sum과 max 모두 double형으로 형 변환을 해줘야 한다.

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 0;       // 최대값 변수생성
		int sum = 0;       // 합계 변수 생성(평균을 위해)
		double avg = 0;    // 평균값 구하는 변수 생성
		
		for(int i=0;i<n;i++) {
			int score = sc.nextInt();  // 입력값을 받아서 
			if(score>max) {            // 바로 최대값을 구한다.
				max = score;
			}
			sum += score;               // 받은 입력값의 합계를 넣는다.
		}
		avg = (double)sum/(double)max*100/n;
		System.out.println(avg);
		sc.close();
	}
}
