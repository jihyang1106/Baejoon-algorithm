import java.util.Scanner;

public class Main8958_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] arr = new String[scan.nextInt()];
		

		for(int i=0;i<arr.length;i++) {
			arr[i] = scan.next();
		}
		
		for(int i=0; i<arr.length; i++) {
			
			int cnt = 0;
			int result = 0;
			
			
			for(int j=0; j<arr[i].length(); j++) {
				if(arr[i].charAt(j)=='O') {
					result += ++cnt;
				} else {
					cnt = 0;
				}
			}
		System.out.println(result);
		}
		scan.close();
	}
}
