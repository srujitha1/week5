let timeout=(timeoutMillis=3000,message="default")=>{
    setTimeout((msg)=>{
    console.log(`${msg} executed afetr ${timeoutMillis} seconds`);
    },timeoutMillis*1000,message)
}
timeout(5,"first asynchronous program")
console.log('hello timeout')

let timeoutInterval=(timeoutMillis=3000,message="default")=>{
   handle= setInterval((msg)=>{
    console.log(`${msg} executed afetr ${timeoutMillis} seconds`);
    },timeoutMillis*1000,message)
}
timeoutInterval(1,"first asynchronous program")

setTimeout(()=>{
    console.log('lets terminate the interval')
    clearInterval(handle)},5000);
