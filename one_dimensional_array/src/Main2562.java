import java.util.Scanner;

public class Main2562 {

	public static void main(String[] args) {  //116ms 
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9]; // 9���� ������ ����ִ� �迭 ����
		int max = 0;  // �ִ밪 ����, 0���� �ʱ�ȭ
		int index = 0; // �ִ��� ���° �ε������� ����ϴ� ����
		
		for(int i=0;i<arr.length;i++) { // �迭�� ũ�⸸ŭ for�� ����
			arr[i] = sc.nextInt();      // �Է¹޴� ���� �迭�� ����.
			if(arr[i]>max) {            // ���� �Է¹��� ���� max���� ũ�ٸ�
				max = arr[i];           // �Է¹��� ���� max�� �־��ش�. 
				index = i+1;	        // �ε����� 0���� �����ϱ� ������ +1�� �����ֱ�
			}
		}
		System.out.println(max);
		System.out.println(index);
		sc.close();
	}
}
