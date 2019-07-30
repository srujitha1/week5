let sum=function(a,b){
    return a+b
}
let sub=function(a,b){
    return a-b
}
let mul=function(a,b){
    return a*b
}
let calculate=function(a,b,fun){
    return fun(a,b)
}
console.log(calculate(4,5,sum))

var result = calculate(4,5)
result()