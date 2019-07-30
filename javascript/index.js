let express=require("express")
let app=express()
app.get('/',(req,res)=>{
    res.send(JSON.stringify({message:'Hello world from Express'}))
})

let port=process.env.port || 8080
app.listen(port,()=>{
    console.log('server started')
})