import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		
		String As = Integer.toString(A);
		String Bs = Integer.toString(B);
		
		StringBuilder reversedAs = new StringBuilder(As).reverse();
		StringBuilder reversedBs = new StringBuilder(Bs).reverse();
		
		int revesedA = Integer.parseInt(reversedAs.toString());
		int revesedB = Integer.parseInt(reversedBs.toString());
		
		if(revesedA > revesedB) {
			System.out.println(revesedA);
		}else if (revesedB > revesedA) {
			System.out.println(revesedB);
		}

	}
}