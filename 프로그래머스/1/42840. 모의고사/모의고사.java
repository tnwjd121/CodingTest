import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        int[] people1 = {1, 2, 3, 4, 5};
        int[] people2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] people3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = new int [3];
        
        for(int i=0; i<answers.length; i++){
            if(answers[i] == people1[i%5]) score[0]++;
            if(answers[i] == people2[i%8]) score[1]++;
            if(answers[i] == people3[i%10]) score[2]++;
        }
        
        int max = Math.max(score[0], Math.max(score[1], score[2]));
        
        List<Integer> arr = new ArrayList<Integer>();
        for(int i=0; i<score.length; i++){
            if(score[i]==max) arr.add(i+1);
        }
    
        int[] answer = new int[arr.size()];
        
        for(int i=0; i<arr.size(); i++){
            answer[i] = arr.get(i);
        }
        return answer;
    }
}