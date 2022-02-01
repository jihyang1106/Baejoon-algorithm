import java.io.*;

public class Main1065 {

	public static void main(String[] args) {  //76ms
		// 1���� ũ�� �Է¹��� ��(N)���� �۰ų� ���� �Ѽ��� ���� ���
		// �Ѽ��� �� �ڸ� ���� ���������� �ǹ��� (�������� �ΰ��� ���� ���̰� ������)
		// ���������� �� [1,1,1,1,1], [1,2,3,4,5], [2,4,6,8,10]
		// 1~99�� ��� �� �ڸ��� ��ü�� �����̾ ���̽��� 100���� ū ���, ���� ���� ������
		// 1000�� ���������� �ƴϱ� ������ 1000�� ���ԵǸ� 999�� ��ȯ
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
		int x = Integer.parseInt(br.readLine());
		System.out.println(d(x));
		
		}catch(IOException i) {
			i.printStackTrace();
		}
	}
	
	private static int d(int num) { // ���������� ������ ���� �޼���
		int cnt = 0;  // �Ѽ��� ������ �� cnt ���� ����
		
		if(num<100) { // 100���� ���� ���� �׳� return 
			return num;
		} else {       // 100 ���� ū ��� 
			cnt = 99;  // 100���������� ���������� �����Ǳ� ������ cnt�� 99���� ����
			if(num==1000) {  // num�� 1000�̶�� �Ѽ��� xx num�� 999�� �ʱ�ȭ
				num --;
			}
			for(int i = 100; i<=num; i++) {  // num�� 3�ڸ��� ��쿡 �������� ���ϱ�
				int hun = i/100;      // ���� �ڸ�
				int ten = (i/10)%10;  // ���� �ڸ�
				int one = i%10;       // ���� �ڸ�
				
				int d1 = hun-ten;  // ���� �ڸ� - �����ڸ�
				int d2 = ten-one;  // ���� �ڸ� - �����ڸ�
				
				if((d1)==(d2)) { // ���������� ����(������ ���ƾ� ��)
					cnt++;
				}
			}
		}
		return cnt;
	}
}
