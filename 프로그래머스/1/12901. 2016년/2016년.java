class Solution {
    public String solution(int a, int b) {
        String answer = "";
        // 31 = 1,3,5,7,8,10,12
        // 30 = 4,6,9,11
        // 29 = 2
        // 1금 2토 3일 4월 5화 6수 0목
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        int day = 0;
        int week = 0;
        for(int i=0; i<a-1; i++){
            day += month[i];
        }
        day += b;
        week = day%7;
        switch(week) {
            case 0 :
                answer = "THU";
            break;
            case 1 :
                answer = "FRI";
            break;
            case 2 :
                answer = "SAT";
            break;
            case 3 :
                answer = "SUN";
            break;
            case 4 :
                answer = "MON";
            break;
            case 5 :
                answer = "TUE";
            break;
            case 6 :
                answer = "WED";
            break;
            default:
            break;
        }
        
        
        return answer;
    }
}