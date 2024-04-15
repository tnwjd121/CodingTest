import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int[] whiteArr = {1,1,2,2,2,8};  
		String str = scanner.nextLine();
		
		String[] strArr = str.split(" ");
		
		int[] intArr = new int[strArr.length];
		for (int i=0; i<strArr.length; i++) {
			intArr[i] = Integer.parseInt(strArr[i]);
		}
		
		int [] resultArr = new int[6];
		for(int i=0; i<resultArr.length; i++) {
			resultArr[i] = whiteArr[i]-intArr[i];
		}
		for(int num : resultArr) {
			System.out.print(num + " ");
		}
		

	}
}