class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int bottle = n;
        // cola가 a 미만이 되면 종료
        while(bottle>=a){
            answer += bottle/a*b;
            if(bottle%a==0){
                bottle = bottle/a*b; 
            }else{
                bottle = bottle/a*b + bottle%a; 
            }
            
        }
        return answer;
    }
}