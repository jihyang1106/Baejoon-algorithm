import java.util.Arrays;
import java.util.Scanner;

public class Main10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
		int n = sc.nextInt();    // 입력값을 받고
		int[] arr = new int[n];  // 일벽값을 받은 크기만큼 배열생성!
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();  // 그 다음 입력값들을 배열 안에 넣기!
		}
		
		Arrays.sort(arr);  // 오름차순 정렬하면 최솟값이 0번째 인덱스로 
		System.out.println(arr[0] + " " + arr[n-1]);
		
	sc.close();
	}
	
}
