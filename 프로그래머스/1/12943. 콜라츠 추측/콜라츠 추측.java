class Solution {
    public int solution(int num) {
        int answer = 0;
        while(num!=1){
            if(num%2==0){
                num = num/2;
                answer++;
            }else if(num%2!=0){
                num = num*3+1;
                answer++;
            }
            if(answer>=400){
                answer = -1;
                break;
            }
        }
        return answer;
    }
}