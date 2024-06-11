class Solution {
    boolean solution(String s) {
        boolean answer = true;
        // p와 y의 개수같으면 true 다르면 false
        // 하나도 없으면 true리턴
        int p = 0;
        int y = 0;
        s = s.toLowerCase();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'p'){
                p++;
            }else if(s.charAt(i) == 'y'){
                y++;
            }
        }
        if(p==0&&y==0){
            answer = true;
        }else if(p==y){
            answer = true;
        }else{
            answer = false;
        }

        return answer;
    }
}