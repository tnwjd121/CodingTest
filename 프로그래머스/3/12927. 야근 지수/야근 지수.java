import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        
        PriorityQueue<Integer> overtime = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int work : works){
            overtime.add(work);
        }
        
        for(int i=0; i<n; i++){
            if (overtime.isEmpty()) break;
            
            int max = overtime.poll(); // 꺼내고 제거함
            if(max > 0) {
                overtime.add(max-1);
            }else {
                break;
            }
        }
        
        while(!overtime.isEmpty()){
            int work = overtime.poll();
            answer += (long) work*work;
        }
        
        
        return answer; 
        
    }
}