import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main2741 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//		try {  // 예외처리를 try-catch 구문으로!(parseInt)
			int N = Integer.parseInt(br.readLine());
			for (int i = 1; i < N + 1; i++) {
				bw.write(i + "\n");
			}
//		} catch (Exception e) {}
		bw.flush();
		br.close();
	}
}
