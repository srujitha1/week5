var Dish=(function(){
    var id=0;
    var name=' '
    var price=0;
    var obj={
        setId:function(argId){
            id=argId
        },
        getId:function(){
            return id;
        }
       
    }
    return obj;
}())
Dish.setId(20)
console.log(Dish)