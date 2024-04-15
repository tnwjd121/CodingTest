import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int count = 0;
		
		for(int i=0; i<N; i++) {
			String str = scanner.next();
			if(isGroupWord(str)) {
				count++;
			}
			
		}
		System.out.println(count);
	}
		public static boolean isGroupWord(String str) {
			boolean[] abc = new boolean[26];
			for(int i=0; i<str.length(); i++) {
				char ch = str.charAt(i);
				if(abc[ch-'a'] && str.charAt(i-1)!= ch) {
					return false;
				}
				abc[ch-'a'] = true;
			}
			return true;
		}

}