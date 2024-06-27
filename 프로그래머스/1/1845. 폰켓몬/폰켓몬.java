import java.util.Arrays;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        // 배열 갯수/2
        int choice = nums.length/2;
        int[] disc = Arrays.stream(nums).distinct().toArray();
        if(choice>disc.length){
            answer = disc.length;
        }else{
            answer = choice;
        }
        
        return answer;
    }
}