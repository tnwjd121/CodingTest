function solution(s) {
    var answer = s.split(' ');
    var max = Math.max(...answer)
    var min = Math.min(...answer)
    
    return min + ' ' + max;
}