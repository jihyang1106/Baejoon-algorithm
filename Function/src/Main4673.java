
public class Main4673 {

	public static void main(String[] args) {  // 128ms
		// �� �ٿ� �ϳ���
		// 0���� ũ�� 10000���� �۰ų� ���� �� �߿� ���� �ѹ� ���
		// �����ڷ� �ϴ� ���� ������ �� ���� �Ÿ���

		// �����ѹ����� Ȯ���ϴ� boolean �迭 ����
		boolean[] isNotSelfNum = new boolean[10001]; // �ε����� 1���� �̴ϱ�

		for (int i = 1; i <= 10000; ++i) { // for(int i=1; i<10001; i++)�� ����
			int n = d(i); // �Լ��� �̿��ؼ� �����ڸ� n���� �ֱ�
			if (n < isNotSelfNum.length) {
				isNotSelfNum[n] = true; // ���� �ʱⰪ�� false, �����ڰ� �ִ� �ε����� true��
			}
			if (isNotSelfNum[i] == false) { // �迭�� �����ѹ��� ���� false�� ��ȯ
				System.out.println(i); // �����ѹ��� ���� �ε����� false�� ��
			}
		}
	}

	private static int d(int num) {

		int tmp = num; // �����ڸ� ���ϱ� ���� ����
		while (num > 0) { // ����ؼ� 10�� ������ ���� 0���� �Ǽ� �ݺ��� Ż��
			tmp += num % 10; // num�� ���� �ڸ����� ��� tmp�� ���ϰ� �Ǹ� �����ڰ� ������ �ȴ�.
			num /= 10; // num�� ���� ���̱� ���ؼ� 10���� ���� ���� num����
		}
		return tmp;
	}
}
