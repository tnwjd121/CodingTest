import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[] strArr = new String [5];
		String result = "";
		
		for(int i=0; i<strArr.length; i++) {
			strArr[i] = scanner.nextLine();
		}
		for(int i=0; i<15; i++) {
			for(int j=0; j<5; j++) {
				if(i<strArr[j].length()) {
					result += strArr[j].charAt(i);					
				}
			}
		}
		
	System.out.println(result);


	}
}