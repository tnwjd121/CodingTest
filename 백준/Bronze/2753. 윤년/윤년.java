import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
	int num = 0;
	
	Scanner scanner = new Scanner(System.in);
	
	num = scanner.nextInt();
	
	if(num%4 == 0 & num%100 != 0) {
		System.out.println(1);
	}else if(num%400 ==0) {
		System.out.println(1);
	} else {
		System.out.println(0);
	}
		
}
}