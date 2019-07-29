let sum=(a,b)=>a+b
let sub=(a,b)=>a-b
let product=(a,b)=>a*b
let calculate=(a,b,fun)=>fun(a,b)

console.log(calculate(2,3,sum))