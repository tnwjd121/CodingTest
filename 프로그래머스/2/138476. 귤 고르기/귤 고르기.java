import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for (int num : tangerine) {
            map.put(num, map.getOrDefault(num,0) +1);
        }
        ArrayList<Integer> counts  = new ArrayList<>(map.values());
        Collections.sort(counts, Collections.reverseOrder());
        
        for (int count : counts) {
            k -= count;
            answer++;
            if (k <= 0) break;
        }
        
        
        return answer;
    }
}