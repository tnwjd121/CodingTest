class Solution {
    public int solution(int n) {
        int answer = 0;
        // 자연수 n보다 큰데 2진수 변환시 1의 갯수가 같아야함
        String bs = Integer.toBinaryString(n);
        int bsCount = 0;
        for(int i=0; i<bs.length(); i++){
            if(bs.charAt(i)=='1'){
                bsCount++;
            }
        }
        answer = n+1;
        int yCount = 0;
        while(true){
            String ys = Integer.toBinaryString(answer);
            yCount = 0;
            for(int i=0; i<ys.length(); i++){
                if(ys.charAt(i)=='1'){
                    yCount++;
                }
            }
            
            if(bsCount == yCount){
                break;
            }
            
            answer++;
        }
         
        return answer;
    }
}