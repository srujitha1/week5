let express = require('express');
//let nodemon = require('nodemon');
let bodyParser=require('body-parser');
let mongoose = require('mongoose');
let apiroutes = require('./api-routes');
let app = express();

app.get('/',(req,res)=>{
    res.send(JSON.stringify({message:'Hello world from express'}))
});
app.use(bodyParser.json())
app.use('/api',apiroutes);
let port = process.env.PORT || 8000;

app.listen(port,()=>{
    console.log('Server started');
})


app.use(bodyParser.urlencoded({
    extended:true
}))

mongoose.connect('mongodb://localhost/moviesdb',{useNewUrlParser:true})

var db=mongoose.connection;
if(!db)
console.log("error connecting db")
else
console.log("db connected successfully")

// var kittySchema = new mongoose.Schema({
//     name:String
// })

// var Kitten=mongoose.model('Kitten',kittySchema)
// var silence=new Kitten({name:'Silence'})
// console.log(silence.name) 