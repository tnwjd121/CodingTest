class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        //[전환 회수, 0제거횟수]
        int count = 0;
        int zeroCount = 0;
        while(!s.equals("1")){
            int calc = 0;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)=='0'){
                    zeroCount++;
                }else{
                   calc++;
                }
            }
            count++;
            s = Integer.toBinaryString(calc);
            System.out.println(s);
        }
        answer[0] = count;
        answer[1] = zeroCount;
        
        return answer;
    }
}