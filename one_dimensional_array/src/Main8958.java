import java.util.Scanner;

public class Main8958 {  // 136ms

	public static void main(String[] args) {  //304 ms
		Scanner scan = new Scanner(System.in);
		String arr[] = new String[scan.nextInt()]; 
		// �׽�Ʈ ���̽� ũ�⸸ŭ�� �迭 ���� ���� ���� �������� �ʰ� �ٷ� �迭�ȿ� �־��־���. 

		for(int i=0;i<arr.length;i++) {	// �迭 �ȿ� OOXXOXXOOO ���� �ֱ�
			arr[i] = scan.next();
		}
			
		for(int i=0; i<arr.length; i++) { 
			   
			int count = 0; // ����Ƚ�� count �� for�� �ȿ��� �����ؾ�  ��
			int total = 0;   // �����ջ�
			
			for(int j=0; j<arr[i].length(); j++) {  // arr[i].length�� �ؾ� arr[0]���� ���̸�ŭ for�� ����				
				if(arr[i].charAt(j)=='O') {  // array�� ���ڰ� O�� ������ count++ ���ְ� total �� �ֱ�
                 // arr[0]�� OOXXOXXOOO, �ű⼭ charAt(0)�� O�̴�.O�� O�� ���ؼ� ������ count++					
//					count++;     
//					total += count;
					total += ++count; // ���� ������ �� �ٷ� 
				} else {  // �ƴϸ� count 0���� �ʱ�ȭ
					count = 0;
				}
			}
		System.out.println(total);
		}
		scan.close();
	}
}
