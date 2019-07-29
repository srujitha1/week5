var dish = [{
    id:34,
    'name':'masala dosa',
    price:40
},
{
    id:35,
    'name':'popcorn',
    price:120
}]



let printDishName = function(allDishes){
    console.log('arguments')
    console.log(arguments)
    for(var index=0;index<allDishes.length;index++)
    console.log(dish[index]['name'])
}
printDishName(dish)