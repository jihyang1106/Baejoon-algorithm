import java.util.Scanner;

public class Main10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();

		// 1¹ø  // 520ms
		for(int i = 0; i<n; i++) {
			int value = sc.nextInt();
				if(x>value) {
					System.out.print(value + " ");
				}

		// 2¹ø // 464ms
//		int[] arr = new int[n];
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = sc.nextInt();
//		}
//		sc.close();
//		
//		for(int i=0;i<n;i++) {
//			if(x>arr[i]) {
//				System.out.print(arr[i] + " ");
//			}
		}
		sc.close();
	}
}
