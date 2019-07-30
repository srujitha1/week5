let players=['Virat','Rohit','dhoni','raina']

const [captain,vCaptain]=players
console.log(`Captain:${captain},Vice-captain:${vCaptain}`);
let batsman='sachin';
let runner='ganguly';
[batsman,runner]=[runner,batsman];

//object destructuring..

const player={
    name:'Viratkohli',
    centuries:28,
    halfCenturies:60,
    matches:350
}

let item={
    name:'Iphone',
    price:10800
}

let currencyCalculator=function({price:amount}){
    return{
        'INR':amount,
        'USD':amount/68,
        'EURO':amount/80
    }
}

const {name,centuries,matches,playersfor='india'}=player
const {USD:amountInDollars}=currencyCalculator(item)
console.log(`${amountInDollars}`)