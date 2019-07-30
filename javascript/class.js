class Employee{
    constructor(fname,lname,age,salary){
        this._fname=fname
        this._lname=lname
        this._age=age
        this._salary=salary
    }
set Fname(fname){
      this._fname=fname
  }  
set Lname(lname){
      this._lname=lname
  }  
set Salary(salary){
      this._salary=salary
  }  
set Age(age){
      this._age=age
  }  
get Fname(){
   return this._fname
}  
get Lname(){
    return this._lname
}  
get Salary(){
    return this._salary
}  
get Age(){
    return this._age
}  
}
class RegularEmployee extends Employee{
    constructor(fname,lname,age,salary,vacation){
        super(fname,lname,age,salary)
        this.vacation=vacation;
    }
}

let vikram=new Employee("vikram",'gupta',33,5000)
console.log(vikram)
vikram.Salary=500000
vikram.salary=2000
console.log(vikram)
