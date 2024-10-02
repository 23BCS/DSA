const number= [1,2,3,4,5,6]
const pair =()=>{
    let total=0;
    let curr;
    for(let i=0 ; i<number.length;i++){
        curr= number[i]
        for(let  j= i+1;j<number.length;j++){
            console.log(`(${curr} , ${number[j]})`)
            total++;
        }
        console.log()
    }
    console.log(`total pair :${total}`)
}

pair(number)