
import java.util.Scanner;

public class Main2588 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String b = sc.next();  // 문자열로 받아서 각 문자를 추출하기 위해서 String으로 
							   // next는 문자 혹은 문자열 공백 기준으로 단어 문자씩 입력 받는다.
		                       // nextLine은 문자 혹은 엔터를 치기 전까지의 문장 전체를 입력 받는다.
		
		System.out.println(a * (b.charAt(2) - '0'));  
		/* b.charAt(2) -> 38'5'에서 5인 아스키코드 37이 들어가게된다.
		-'0'을 해주는 이유: 문자로 저장된 숫자가 아닌 우리가 보는 숫자 그대로의 값을 쓰기 위함*/
		
		System.out.println(a * (b.charAt(1) - '0'));
		/* b.charAt(1) -> 3'8'5에서 8인 아스키코드 40이 들어가게된다. 
		 -'0'을 해서 숫자 그대로의 값인 8을 쓰게 됨 -> 472 * 8 = 3776*/
		
		System.out.println(a * (b.charAt(0) - '0')); 
		/* b.charAt(0) -> '3'85에서 3인 아스키코드 35가 들어가게된다.
		 -'0'을 해서 숫자 그대로의 값인 3을 쓰게 됨 -> 472 * 3= 1416*/
		
		System.out.println(a * Integer.parseInt(b)); // Integer.parseInt()로 문자열 -> 숫자
		sc.close();
	}

}
