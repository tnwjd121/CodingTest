function solution(operations) {
    const answer = [];
    
    let q = [];
    for(i=0; i<operations.length; i++){
        if(operations[i].includes('I')){
            const number = Number(operations[i].split(" ")[1]);
            q.push(number)
        }else if(operations[i] === "D 1"){
            const max = Math.max(...q);
            const index = q.indexOf(max);
            // 배열 제거 splice
            q.splice(index, 1)
        }else if(operations[i] === "D -1"){
            const min = Math.min(...q)
            const index = q.indexOf(min);
            q.splice(index,1);
        }
    }
    
    if(q.length === 0){
        answer.push(0,0)
    }else{
        answer.push(Math.max(...q))
        answer.push(Math.min(...q))
    }
    
    return answer;
}