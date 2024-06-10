class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        for(int i=0; i<code.length(); i++){
            switch(mode){
                case 0 :
                    if(code.charAt(i)== '1'){
                        mode = 1;
                        break;
                    }else if(i%2==0){
                        answer+=code.charAt(i);
                    }
                    break;
                case 1 :
                    if(code.charAt(i)== '1'){
                        mode = 0;
                        break;
                    }else if(i%2!=0){
                        answer+=code.charAt(i);
                    }
                    break;
            }

        }
        if(answer.equals("")){
            answer = "EMPTY";
        }
        return answer;
    }
}