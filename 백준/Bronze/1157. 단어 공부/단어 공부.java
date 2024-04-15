import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		str = str.toUpperCase();
		int max = 0;
		int count = 0;
		int index = 0;
		
		int[] intArr = new int [26];
		
		for(int i=0; i<str.length(); i++) {
			intArr[str.charAt(i)-'A'] ++;
		}
		
		for(int i=0; i<intArr.length; i++) {
			if(max < intArr[i]) {
				max = intArr[i];
				count = 1;
				index = i;
			}else if (max == intArr[i]) {
				count += 1;
			}
		}
		if(count>1) {
			System.out.println("?");
		}else {
			System.out.println((char)('A'+index));
		}
		
	}
}