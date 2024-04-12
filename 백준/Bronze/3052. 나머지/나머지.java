import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int count = 0;
		boolean boo;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt()%42;
		}
		for(int i=0; i<10; i++) {
			boo = false;
			for(int j=i+1; j<10; j++) {
				if(arr[i]==arr[j]) {
					boo=true;
					break;
				}
			}
			if(boo== false) {
				count++;
			}
		}
		System.out.println(count);
	}
}