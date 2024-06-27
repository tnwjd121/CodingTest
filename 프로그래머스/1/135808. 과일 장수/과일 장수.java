import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<score.length; i++){
            list.add(score[i]);
        }
        Collections.sort(list, Collections.reverseOrder());
        int count = score.length/m;
        for(int i=1; i<=count; i++){
            answer += list.get((m*i)-1)*m;
        }
        return answer;
    }
}