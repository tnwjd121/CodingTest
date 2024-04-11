
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[9];
		int max = arr[0];
		int index = 0;
		
		
		for(int i=0;i<arr.length; i++) {
			arr[i] = scanner.nextInt();
			if(max <arr[i]) {
				max = arr[i];
				index = i+1;
				
			}
		}
		System.out.println(max);
		System.out.println(index);
		
	}
}
