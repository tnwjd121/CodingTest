
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		List<Human> humanList = new ArrayList<Human>();
		
		for(int i=0; i<N; i++) {
		Human human = new Human(
					scanner.nextInt(),
					scanner.nextInt());
			humanList.add(human);
		}
		for(Human currentHuman : humanList) {
			currentHuman.rank = 1;
			for (Human otherHuman : humanList) {
				if(otherHuman != currentHuman) {
					if(currentHuman.x<otherHuman.x&&currentHuman.y<otherHuman.y) {
						currentHuman.rank++;
					}
				}
			}
		}
		for(Human printHuman : humanList) {
			System.out.print(printHuman.rank + " ");
		}
  
    }
}

class Human{
	int x, y, rank;

	

	public Human(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		this.rank = 0;
	}



	@Override
	public String toString() {
		return "Human [x=" + x + ", y=" + y + ", rank=" + rank + "]";
	}
	
}