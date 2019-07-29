var dish={
    id:23,
    name:'pavBhaji',
    price:40,
    getPrice:function(){
        return this.price;
    },
    getName:function(){
        return this.name;
    }
}
console.log(dish.getPrice())
var fun=function(companyName='sapient'){
    console.log(this+" "+companyName)
} 
var obj={
    first:'arjun',
    last:'reddy'
}
fun.call(obj)
fun.call({first:'vijay',last:'devarakonda'})
fun.call(obj,'TCS')

//var rebind = fun.bind(obj,arr);
//rebind();

var applyFun = function(par1,par2,par3){
    console.log(par1+''+par2+''+par3);
}
applyFun.apply({},['one','teo','three'])