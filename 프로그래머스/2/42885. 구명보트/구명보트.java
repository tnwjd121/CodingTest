import java.util.Arrays;
class Solution {
    
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people); //오름차순
        
        int light = 0; // 가벼운 사람
        int heavy = people.length - 1;
        
        while (light <=heavy) {
            if(people[light] + people[heavy] <= limit) {
                light ++;
            }
            heavy --;
            answer++;
        }
        
        return answer;
    }
}