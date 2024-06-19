import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> arrInt = new ArrayList<>();
            
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor==0){
                arrInt.add(arr[i]);
            }
        }
        Collections.sort(arrInt);
        
        if(arrInt.size()<1){
            arrInt.add(-1);
        }
        
        int[] answer = new int[arrInt.size()];
        
        for(int i=0; i<arrInt.size(); i++){
            answer[i] = arrInt.get(i);
        }
        
        return answer;
    }
}