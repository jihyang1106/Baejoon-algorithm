import java.util.Scanner;

public class Main2577 {

	public static void main(String[] args) {  // 112ms 
		Scanner sc = new Scanner(System.in);

		int count = 0;  // 숫자가 몇 번 쓰였는지 count 변수에 저장해서 출력하기
		int multiple = sc.nextInt()*sc.nextInt()*sc.nextInt();  // 입력하는 숫자들을 받고 곱해서 multiple변수에 넣기
		String result = Integer.toString(multiple);         // 곱한 결과를 하나씩 비교하기 위해서 문자열로 바꿈 "17037300"
		
		// i가 0일때 result.length만큼 for문 실행, i가 1일떄 result.length만큼 for문 실행 ....
		for(int i=0;i<10;i++) { // 세로의 길이 10번 출력
			for(int j=0;j<result.length();j++) { // 문자열에 들어있는 숫자의 값을 비교해야 하니까 문자열의 길이만큼 for문 실행
				if((result.charAt(j)-'0')==i) {  // charAt(j)-'0'을 해야 아스키코드가 아닌 int값으로 입력됨
					count ++;   /// 문자열의 숫자가 i의 숫자와 같을 떄 count에 더해준다.
				}
			}
		System.out.println(count);  // count를 출력한다.
		count = 0; // 카운트를 0으로 초기화 한다. 	
		}
	sc.close();
	}
}
