import java.util.Scanner;

public class Main2438 {

	public static void main(String[] args) {  // 204��
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {   // i = 0,  ���� �㵢
			for (int j = 0; j < i + 1; j++) {  // j�� * 1�� ���  ���� ���
				System.out.print("*");
			}
			System.out.println();  // �� ���� �������� ��������
		sc.close();
		}
	}
}
