import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Main11021 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine());
		
		// 80√ 
//		for(int i=1; i<=t; i++) {
//			StringTokenizer st = new StringTokenizer(br.readLine()," ");  
//			int a = Integer.parseInt(st.nextToken());
//			int b = Integer.parseInt(st.nextToken());
//			bw.write("Case #"+ i +": "+(a+b)+"\n" );
//		}
		
		// 76√ 
		for(int i=1;i<=t;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			bw.write("Case #"+ i +": "+ ((Integer.parseInt(st.nextToken())) + 
					Integer.parseInt(st.nextToken())+"\n"));
		}
		bw.flush();
		bw.close();
	}
}
