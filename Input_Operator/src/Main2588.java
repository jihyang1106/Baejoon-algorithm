
import java.util.Scanner;

public class Main2588 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String b = sc.next();  // ���ڿ��� �޾Ƽ� �� ���ڸ� �����ϱ� ���ؼ� String���� 
							   // next�� ���� Ȥ�� ���ڿ� ���� �������� �ܾ� ���ھ� �Է� �޴´�.
		                       // nextLine�� ���� Ȥ�� ���͸� ġ�� �������� ���� ��ü�� �Է� �޴´�.
		
		System.out.println(a * (b.charAt(2) - '0'));  
		/* b.charAt(2) -> 38'5'���� 5�� �ƽ�Ű�ڵ� 37�� ���Եȴ�.
		-'0'�� ���ִ� ����: ���ڷ� ����� ���ڰ� �ƴ� �츮�� ���� ���� �״���� ���� ���� ����*/
		
		System.out.println(a * (b.charAt(1) - '0'));
		/* b.charAt(1) -> 3'8'5���� 8�� �ƽ�Ű�ڵ� 40�� ���Եȴ�. 
		 -'0'�� �ؼ� ���� �״���� ���� 8�� ���� �� -> 472 * 8 = 3776*/
		
		System.out.println(a * (b.charAt(0) - '0')); 
		/* b.charAt(0) -> '3'85���� 3�� �ƽ�Ű�ڵ� 35�� ���Եȴ�.
		 -'0'�� �ؼ� ���� �״���� ���� 3�� ���� �� -> 472 * 3= 1416*/
		
		System.out.println(a * Integer.parseInt(b)); // Integer.parseInt()�� ���ڿ� -> ����
		sc.close();
	}

}
