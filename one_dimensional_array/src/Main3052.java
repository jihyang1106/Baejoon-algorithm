import java.util.Scanner;

public class Main3052 {

	public static void main(String[] args) {  //108ms
		Scanner sc = new Scanner(System.in);

		int count = 0;   
		int[] arr = new int[10];  // �Է¹��� ���� 42�� ������ ���� �������� ���� �迭 ����

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt() % 42;     // �Է¹��� ���� 42�� ���� �������� �迭�� �ֱ�
		}

		for (int i = 0; i < arr.length; i++) { // ���� ũ�� ��ŭ�� for�� ����(i=0, j�� 0~9������ ��)
			int tmp = 0;   // �迭 i�� i+1�� ���ؼ� ���� �ӽ� ���� ����
			for (int j = i + 1; j < arr.length; j++) {  
					if (arr[i] == arr[j]) {  // i�� i+1�� ���ؼ� ������  tmp���ٰ� ����
						tmp++;
					}
				}
			if (tmp == 0) {  //i�� i+1�� ���ؼ� ���� ������ 0�� ������ 0�̸� count�� �����ش�.
				count++;
			}
		}System.out.println(count);
		sc.close();
	}
}
