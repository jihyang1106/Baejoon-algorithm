import java.util.Scanner;

public class Main1110 {

	public static void main(String[] args) {  //108ms
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();  // �Է°� �ޱ�
		int num = n;             // �������� ���� �� �ʿ��� ����
		int count = 0;      // �� �� ���� �������� ���ƿ� �� �ִ��� ī��Ʈ ���� 
		
		while(true) {
			int q = num/10;   // ��) 26/10�ϸ� �����ڸ� 2�� q�� ����
			int r = num%10;   // ��) 26%10�ϸ� �����ڸ� 6�� r�� ����
			int sum = q+r;    // ��) �����ڸ� 2 + �����ڸ� 6 = 8
			
			num = r*10 + sum%10;  // ���ο� �� = �����ڸ�6*10 + ��%10 (���� ���� ������ �ڸ� ��) 
			count ++;             // ���ο� ���� ���鶧���� ī��Ʈ ����
			
			if(n==num) {   // ���� ���� ���� �ٲ� ���� ������ �� ����
				break;
			}
		}
		System.out.println(count);
		scan.close();
	}
}
