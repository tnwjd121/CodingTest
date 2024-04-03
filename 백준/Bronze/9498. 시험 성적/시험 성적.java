import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
	int num = 0;
	
	Scanner scanner = new Scanner(System.in);
	
	num = scanner.nextInt();
	
	if(num>=90) {
		System.out.println("A");
	}else if(num >=80) {
		System.out.println("B");
	}else if(num >= 70) {
		System.out.println("C");
	}else if(num >= 60) {
		System.out.println("D");
	}else {
		System.out.println("F");
	}
		
}
}