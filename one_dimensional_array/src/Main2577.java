import java.util.Scanner;

public class Main2577 {

	public static void main(String[] args) {  // 112ms 
		Scanner sc = new Scanner(System.in);

		int count = 0;  // ���ڰ� �� �� �������� count ������ �����ؼ� ����ϱ�
		int multiple = sc.nextInt()*sc.nextInt()*sc.nextInt();  // �Է��ϴ� ���ڵ��� �ް� ���ؼ� multiple������ �ֱ�
		String result = Integer.toString(multiple);         // ���� ����� �ϳ��� ���ϱ� ���ؼ� ���ڿ��� �ٲ� "17037300"
		
		// i�� 0�϶� result.length��ŭ for�� ����, i�� 1�ϋ� result.length��ŭ for�� ���� ....
		for(int i=0;i<10;i++) { // ������ ���� 10�� ���
			for(int j=0;j<result.length();j++) { // ���ڿ��� ����ִ� ������ ���� ���ؾ� �ϴϱ� ���ڿ��� ���̸�ŭ for�� ����
				if((result.charAt(j)-'0')==i) {  // charAt(j)-'0'�� �ؾ� �ƽ�Ű�ڵ尡 �ƴ� int������ �Էµ�
					count ++;   /// ���ڿ��� ���ڰ� i�� ���ڿ� ���� �� count�� �����ش�.
				}
			}
		System.out.println(count);  // count�� ����Ѵ�.
		count = 0; // ī��Ʈ�� 0���� �ʱ�ȭ �Ѵ�. 	
		}
	sc.close();
	}
}
