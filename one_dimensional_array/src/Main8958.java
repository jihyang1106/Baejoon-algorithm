import java.util.Scanner;

public class Main8958 {  // 136ms

	public static void main(String[] args) {  //304 ms
		Scanner scan = new Scanner(System.in);
		String arr[] = new String[scan.nextInt()]; 
		// 테스트 케이스 크기만큼의 배열 생성 따로 변수 선언하지 않고 바로 배열안에 넣어주었다. 

		for(int i=0;i<arr.length;i++) {	// 배열 안에 OOXXOXXOOO 값을 넣기
			arr[i] = scan.next();
		}
			
		for(int i=0; i<arr.length; i++) { 
			   
			int count = 0; // 연속횟수 count 꼭 for문 안에서 생성해야  함
			int total = 0;   // 누적합산
			
			for(int j=0; j<arr[i].length(); j++) {  // arr[i].length를 해야 arr[0]번의 길이만큼 for문 실행				
				if(arr[i].charAt(j)=='O') {  // array의 문자가 O과 같으면 count++ 해주고 total 에 넣기
                 // arr[0]는 OOXXOXXOOO, 거기서 charAt(0)은 O이다.O와 O를 비교해서 같으면 count++					
//					count++;     
//					total += count;
					total += ++count; // 위의 두줄을 한 줄로 
				} else {  // 아니면 count 0으로 초기화
					count = 0;
				}
			}
		System.out.println(total);
		}
		scan.close();
	}
}
