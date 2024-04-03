import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
	int x = 0;
	int y = 0;
	
	Scanner scanner = new Scanner(System.in);
	
	x = scanner.nextInt();
	y = scanner.nextInt();
	
	if(x > 0 & y>0) {
		System.out.println(1);
	}else if(x < 0 & y > 0) {
		System.out.println(2);
	}else if(x < 0 & y < 0) {
		System.out.println(3);
	}else if(x > 0 & y < 0) {
		System.out.println(4);
	}else {
		System.out.println("해당 안됨");
	}
	
}
}