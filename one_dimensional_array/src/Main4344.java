import java.util.Scanner;

public class Main4344 {

	public static void main(String[] args) {  //304 ms
		// �׽�Ʈ���̽��� for���� ���� �α�
		// �ι�° ���� �� ��ŭ�� �迭�� ����!(���߿� ����̳Ѵ��� ���ؾ� �ϱ� ������ �迭����)
		// ���� ���� ���� �迭�� �ְ�, �հ迡 �ִ´�.(�հ�����ؾ���)
		// ����� ���Ѵ�. 
		// ����� �Ѵ� �л� ���� for���� �����ؼ� �Ѵ��� Ȯ���Ѵ�.
		// ��������  %�� ������ش�. 
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();      // �׽�Ʈ���̽�
		
		for(int i=0; i<t; i++) {
			int n = sc.nextInt();   // �л� �� ��ŭ�� �迭 �����ϱ�
			int[] arr = new int[n];  
			
			int sum = 0;
			for(int j=0;j<arr.length;j++) {
				int score = sc.nextInt();  // �л����� ������ ������ �迭�� �ֱ�
				arr[j] = score;
				sum += score;              // ����� ���� �հ�
			}
			double avg = (double)sum/n;    // ����� double���̱� ������ sum�� ����ȯ
			int count = 0;                 // ����� �Ѵ� �л����� ���� count ����
			
			for(int j=0; j<arr.length; j++) { // ����� �Ѵ´ٸ� count ++ 
				if(arr[j]>avg) {
					count ++;
				}
			}// �Ҽ��� ��°�ڸ����� ���, %%�ϸ� %�� ���, �����̾ *100, f�̱� ������ count�� double�� ����ȯ
			System.out.printf("%.3f%%\n", (double)count/n*100);  
		}
		sc.close();
	}
}
