import java.util.Scanner;

public class Main10951 {
	/* EOF End of File�� ���ڷ� ������ �ҽ��κ��� �� �̻� ���� �� �ִ� �����Ͱ� ������ ��Ÿ��
	   �Է°��� �󸶳� ������ ������� ���� ��� EOF�� �����
	   Scanner������ hasNext()�� �����, �Էµ� ��ū�� ������ true�� ��ȯ�ϰ�, �׷��� ���� ��� false ��ȯ*/
	public static void main(String[] args) {  // 136ms
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()) {  // �������̴ϱ� ��Ȯ�ϰ� �ۼ�!, hasNext( )�� �������
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);
		}
		sc.close();
	}
}
