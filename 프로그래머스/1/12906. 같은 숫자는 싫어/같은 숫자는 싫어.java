import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> array = new ArrayList<>();
        array.add(arr[0]);
        
        for(int i=1; i<arr.length; i++){
            if(arr[i]!=arr[i-1]){
                array.add(arr[i]);
            }
        }
        int[] answer = new int[array.size()];
        for(int i=0; i<array.size(); i++){
            answer[i] = array.get(i);
        }

        return answer;
    }
}