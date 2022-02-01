
public class Main15596 {

		// 정수 n개가 주어졌을 때, n개의 합을 구하는 함수를 작성
		// Java: long sum(int[] a); (클래스 이름: Test)
		// a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
		// 리턴값: a에 포함되어 있는 정수 n개의 합
	
	long sum(int[] a) {
		long hab = 0;  // 합을 구해야 하는 변수 생성
		
		for(int i=0; i<a.length;i++) {  // 배열 a의 길이만큼 for문 실행
			hab += a[i];                // 배열을 합 변수에 넣기
 		}
		return hab;
	}
}
