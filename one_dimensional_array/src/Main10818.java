import java.util.Arrays;
import java.util.Scanner;

public class Main10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
		int n = sc.nextInt();    // �Է°��� �ް�
		int[] arr = new int[n];  // �Ϻ����� ���� ũ�⸸ŭ �迭����!
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();  // �� ���� �Է°����� �迭 �ȿ� �ֱ�!
		}
		
		Arrays.sort(arr);  // �������� �����ϸ� �ּڰ��� 0��° �ε����� 
		System.out.println(arr[0] + " " + arr[n-1]);
		
	sc.close();
	}
	
}
