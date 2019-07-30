const User=function(fname,lname){
    console.log(this)
    this.fname=fname
    this.lname=lname

}
     

User.prototype.getfName=function(){
    return this.fname;
}

User.prototype.getlName=function(){
    return this.lname;
}
User.prototype.getfullName=function(){
    return `${this.fname}${this.lname}`
}
let u=new User('jaya','sagar')
console.log(u);
console.log(u.getfullName())
