
import java.util.Scanner;

public class Main10950 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();   
		int arr[] = new int[t];  // �Է��� ���� �迭�� ũ�� �����(5�� ������ 5ĭ�� �迭 ����)
		
		for(int i=0;i<t;i++) {  // �迭ũ�⸸ŭ for�� ����
			int a = sc.nextInt();
			int b = sc.nextInt();
		    arr[i] = a + b;     
		    // �Է¹��� ���� ���ؼ� arr�� ���� �ֱ� a=1, b=2�̸� 1+2=arr[0]
		}
		// ���� for��
		for(int n:arr) { // ���Ƿ� ���� �� n. n�� 0���� ���� arr�� ũ�⸸ŭ for�� ���� 
			System.out.println(n);
		}

//		for(int n=0;n<t;n++) { // �⺻ for��
//			System.out.println(arr[n]);
//		}
		sc.close();
	}
}
