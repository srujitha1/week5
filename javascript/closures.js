let outerFunction=function(){
    var innerFunction=function(){
        console.log('innneree function')
    }
    return innerFunction
}

var fun=outerFunction()
fun()
outerFunction()()

