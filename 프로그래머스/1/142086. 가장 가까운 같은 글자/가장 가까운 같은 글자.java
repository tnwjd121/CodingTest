import java.util.HashMap;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character, Integer> firstIndexMap = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(!firstIndexMap.containsKey(c)){
                answer[i] = -1;
            }else {
                int firstIndex = firstIndexMap.get(c);
                answer[i] = i- firstIndex; 
            }
            firstIndexMap.put(c, i);
        }
        
        return answer;
    }
}