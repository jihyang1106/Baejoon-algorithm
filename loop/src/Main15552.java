 import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main15552 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  // ����
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
		// br.nextLine()�� �׽�Ʈ���̽��� String���� �޾Ƽ� Int������ ��ȯ 
		int N = Integer.parseInt(br.readLine()); 
 
		for(int i = 0; i < N; i++) {  // �׽�Ʈ���̽� ũ�� ��ŭ for�� ����
			/* �׽�Ʈ ���̽����� �־����� �� ������ ���ڿ� �и��� ���� �� �ݺ����� StringTokenizer�� ������ ���ÿ�
			   ���ڸ� �Է¹޴´�, " "�� �迭�� �ޱ� ���ؼ�*/
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			
			int a = Integer.parseInt(st.nextToken()); // ����� ���е� ù ��° �ϳ��� string -> int
			int b = Integer.parseInt(st.nextToken()); // ����� ���е� �� ��° �ϳ��� String -> int
			bw.write(a+b + "\n");                     // reader�� �б� ���ؼ� write�ȿ� int������ �ٲ��� ���� �ְ� ����
		
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
