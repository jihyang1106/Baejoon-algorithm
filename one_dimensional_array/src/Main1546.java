import java.util.Scanner;

public class Main1546 {
  
	public static void main(String[] args) {  //148ms
		// �迭�� �������� �ʰ� for������ �Է°��� �޾Ƽ� �ٷ� �ִ��� ���ѵڿ� 
		// �Է°��� ����� ���ϱ� ���ؼ� sum�� �� �ִ´�.
		// ����� ���� �� sum*max*100/ó���Է¹��� �� �̷��� �ϸ� ���ϴ� ����� ���� ������.
		// �ֳ��ϸ� avg�� double�̱� ������ sum�� max ��� double������ �� ��ȯ�� ����� �Ѵ�.

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 0;       // �ִ밪 ��������
		int sum = 0;       // �հ� ���� ����(����� ����)
		double avg = 0;    // ��հ� ���ϴ� ���� ����
		
		for(int i=0;i<n;i++) {
			int score = sc.nextInt();  // �Է°��� �޾Ƽ� 
			if(score>max) {            // �ٷ� �ִ밪�� ���Ѵ�.
				max = score;
			}
			sum += score;               // ���� �Է°��� �հ踦 �ִ´�.
		}
		avg = (double)sum/(double)max*100/n;
		System.out.println(avg);
		sc.close();
	}
}
