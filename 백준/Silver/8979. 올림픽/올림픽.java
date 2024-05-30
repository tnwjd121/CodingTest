import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int K = scanner.nextInt();
		
		List<Country> countryList = new ArrayList<Country>();
		
		for(int i=0; i<N; i++) {
			Country country = new Country(
					scanner.nextInt(),
					scanner.nextInt(),
					scanner.nextInt(),
					scanner.nextInt());
			countryList.add(country);
		}
        // 등수 계산
        for (Country currentCountry : countryList) {
            currentCountry.rank = 1;
            for (Country otherCountry : countryList) {
                if (otherCountry != currentCountry) {
                    if (otherCountry.gold > currentCountry.gold ||
                            (otherCountry.gold == currentCountry.gold && otherCountry.silver > currentCountry.silver) ||
                            (otherCountry.gold == currentCountry.gold && otherCountry.silver == currentCountry.silver && otherCountry.bronze > currentCountry.bronze)) {
                        currentCountry.rank++;
                    }
                }
            }
        }

        // 결과 출력
        for (Country country : countryList) {
            if (country.num == K) {
                System.out.println(country.rank);
                break;
            }
        }
    }
}

class Country{
	int num, gold, silver, bronze, rank;

	public Country(int num, int gold, int silver, int bronze) {
		super();
		this.num = num;
		this.gold = gold;
		this.silver = silver;
		this.rank = 0;
	}

	@Override
	public String toString() {
		return "Country [num=" + num + ", gold=" + gold + ", silver=" + silver + ", bronze=" + bronze + "]";
	}
	
	
	
	
}