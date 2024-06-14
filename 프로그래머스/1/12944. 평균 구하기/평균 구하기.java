class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double sum = 0;
        double count = 0;
        for(int i=0; i<arr.length; i++){
            sum +=arr[i];
            count++;
        }
        answer = sum/count;
        
        return answer;
    }
}