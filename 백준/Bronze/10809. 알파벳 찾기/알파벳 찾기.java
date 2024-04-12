import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[26];
		
		String a = scanner.nextLine();
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = -1;
		}
		
		for(int i=0; i < a.length(); i++) {
			char ch = a.charAt(i);
			
			if(arr[ch -'a'] == -1) {
				arr[ch - 'a'] = i;
			}
		}
		for(int result : arr) {
			System.out.print(result + " ");
		}
		
	}
}