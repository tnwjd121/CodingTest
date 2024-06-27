import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        List<Integer> arr = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                    arr.add(nums[i]+nums[j]+nums[k]);
                }
            }
        }
        
        for(int i=0; i<arr.size();i++){
            boolean boo = true;
            for(int j=2; j <= arr.get(i)/2; j++){
                
                if(arr.get(i)%j == 0) {
                    boo = false;
                }
            }
            if(boo){
                answer++;
            }
        }

        return answer;
    }
}