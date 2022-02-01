 import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main15552 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
		// br.nextLine()로 테스트케이스를 String형을 받아서 Int형으로 변환 
		int N = Integer.parseInt(br.readLine()); 
 
		for(int i = 0; i < N; i++) {  // 테스트케이스 크기 만큼 for문 실행
			/* 테스트 케이스에서 주어지는 두 정수를 문자열 분리를 위해 매 반복마다 StringTokenizer을 생성과 동시에
			   문자를 입력받는다, " "는 배열로 받기 위해서*/
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			
			int a = Integer.parseInt(st.nextToken()); // 띄어쓰기로 구분된 첫 번째 하나를 string -> int
			int b = Integer.parseInt(st.nextToken()); // 띄어쓰기로 구분된 두 번째 하나를 String -> int
			bw.write(a+b + "\n");                     // reader로 읽기 위해서 write안에 int형으로 바꿔준 값을 넣고 개행
		
		}
		
//		for(int i = 0; i < N; i++) {  
//			StringTokenizer st = new StringTokenizer(br.readLine()," "); 
//			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+ "\n");
//		}

		br.close();  
        
		bw.flush();  
		bw.close();


	}

}
