let vegDishes=['dosa','idli','voda']
let nonVeg=['chicken','mutton','fish']
const dishes=['strawberry',...vegDishes]
const dishes1=['strawberry',nonVeg]
dishes.forEach(dish=>console.log(dish))
dishes1.forEach(dish=>console.log(dish))