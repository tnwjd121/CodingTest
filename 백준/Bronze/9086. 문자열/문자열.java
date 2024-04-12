import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		scanner.nextLine();
		String[] S = new String[T];
		
		for(int i=0; i<T; i++) {
			String s = scanner.nextLine();
			S[i] = s.substring(0,1)+s.substring(s.length()-1,s.length()); 		
		}
		
		for(int i=0; i<T; i++) {
			System.out.println(S[i]);
		}
		
	}
}