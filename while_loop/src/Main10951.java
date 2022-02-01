import java.util.Scanner;

public class Main10951 {
	/* EOF End of File의 약자로 데이터 소스로부터 더 이상 읽을 수 있는 데이터가 없음을 나타냄
	   입력값을 얼마나 받을지 명시하지 않을 경우 EOF를 사용함
	   Scanner에서는 hasNext()를 사용함, 입력된 토큰이 있으면 true를 반환하고, 그렇지 않을 경우 false 반환*/
	public static void main(String[] args) {  // 136ms
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()) {  // 정수형이니까 정확하게 작성!, hasNext( )도 상관없음
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);
		}
		sc.close();
	}
}
