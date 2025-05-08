function solution(n, computers) {
    var answer = 0;
    // 컴퓨터 갯수 배열 만들기
    const visited = Array(n).fill(false); 
    
    function dfs(i){
        visited[i] = true;
        
        for (let j=0; j<n; j++){
            if(computers[i][j] === 1 && !visited[j]){
                dfs(j)
            }
        }
    }
    
    for(let i=0; i <n; i++){
        if(!visited[i]){
            dfs(i)
            answer++
        }
    }

    
    return answer;
}