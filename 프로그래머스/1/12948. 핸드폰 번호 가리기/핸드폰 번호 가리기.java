class Solution {
    public String solution(String phone_number) {
        String answer = "";
        char[] arrChar = phone_number.toCharArray();
        for(int i=0; i<phone_number.length()-4; i++){
            arrChar[i]='*';
        }
        answer = new String(arrChar);
        return answer;
    }
}