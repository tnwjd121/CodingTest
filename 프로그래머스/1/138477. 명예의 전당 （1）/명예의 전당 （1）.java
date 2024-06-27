import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> scoreK = new ArrayList<>();
        
        for(int i=0; i<score.length; i++){ 
            scoreK.add(score[i]);
            if(scoreK.size()>k){
                scoreK.remove(Collections.min(scoreK));
            }
            answer[i] = Collections.min(scoreK);
        }
        
        return answer;
    }
}