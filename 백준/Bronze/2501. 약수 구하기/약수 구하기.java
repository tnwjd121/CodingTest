import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int K = scanner.nextInt();
		ArrayList<Integer> factor = new ArrayList<Integer>();
		
		for(int i=1; i<N+1; i++) {
			if(N%i == 0) {
				factor.add(i);
			}
		}
		Collections.sort(factor);
		int third = 0;
		if(factor.size() >= K) {
			third = factor.get(K-1);
			System.out.println(third);
		}else {
			System.out.println(0);
		}
		
		
		
	}
}