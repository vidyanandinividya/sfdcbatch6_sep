/*let names=['john','mike','sarah','steve','merry'];
console.log(names)*/
//slice() - extracts the part of an array without changing the original array
/*let slicedArray=names.slice(2);
console.log(slicedArray)
let slicedArray2=names.slice(1,4);
console.log(slicedArray2)
console.log(names.slice(-1))
console.log(names.slice(1,-1))
console.log(names.slice(1,-2))
console.log(names.slice(-3))*/
//splice() -- remove the array elements
/*let arr1=names.splice(2)
console.log(arr1)
console.log(names)
//delete the last element from an array
console.log(names.splice(-1))
console.log(names)*/
//reverse - Reverses the order of an element in the array
/*let alphabets=['a','b','c','d','e'];
console.log(alphabets)
console.log(alphabets.reverse())
console.log(alphabets)
console.log(names.reverse())*/
//CONCAT - joins two array into a single array
/*let arr1=[10,20,30]
let arr2=[40,50]
let arr=arr1.concat(arr2)
console.log(arr)
let arr3=[...arr1,...arr2]
console.log(arr3)*/
/*let str=['javascript','is','easy','to','learn']
let num=[10,30,45,23]
let joinString=str.join('-')
console.log(joinString)
console.log(num.join(','))*/
//using For...Of Loop to loop over array
/*for(let name of names)
{
    if(name==='sarah') continue
    console.log('Employee name is '+name)
}*/
//FOREACH is a higher order function in javascript
//for each iteration, foreacxh method will pass the value for elem, index and arr parameter
//foreach method will execute the callback function for each iteration
//return type of foreach method is void
/*names.forEach(function(elem,index,arr){
    console.log('Employee name is '+elem + ' at index '+ index);
})*/
//Employee Map
/*let employee=new Map([
    ['empId',101],
    ['name','Steve'],
    ['gender','Male'],
    ['salary','200000']
]);
console.log(employee)
//loop over a map
employee.forEach(function(value,key,map)
{
    console.log('value of '+ key + 'is '+ value)
})*/
//Roles set
/*let roles=new Set(['Admin','ReadOnly','ReadWrite']);
console.log(roles)
//Looping over a set
roles.forEach(function(entry,key,set){
    console.log(entry +' : '+ key)
})*/
//map() - can be used to loop over an array and it returns a new array from the original array
//let birthYears=[1990,1998,2007,1999,2003]
//console.log(birthYears)
/*let ages=[];
for(let year of birthYears)
{
    let age=2022-year;
    ages.push(age); //add the elements in the array
}
console.log(ages)*/
//Map is a higher order function in javascript
/*let ages=birthYears.map(function(elem,index,map){
    //write the logic for each iteratiobn
    return 2022-elem;
})
console.log(ages)*/
//filter() - it is used to loop over an array and it filters element from the original array based on a given condition and returns a new array
/*let transactions=[100,-20,-30,60,120,-100,80,20]
console.log(transactions)
//filter method
let deposits=transactions.filter(function(elem,index,arr){
    return elem>0
})
console.log(deposits)

let withdrawls=transactions.filter(function(elem,index,arr){
    return elem<0
    
})
console.log(withdrawls)*/
//reduce() - it is used to boil down all the elements of an array to one single value
/*let numbers=[20,5,30,10]
console.log(numbers)
//reduce method
let sum=numbers.reduce(function(acc,elem,index,arr){
    return acc+elem
})
console.log(sum)*/
//elem- 30
//acc -25
//return value - 55

let transactions=[2,4,-400,3,-650,-130,7,10]
//pipeline
const usdToInr=80;
const totalDeposit=
transactions
.filter(deposit=>deposit>0)
.map((deposit,i,arr)=>{return deposit*usdToInr})
.reduce((acc,deposit)=>acc+deposit,0);

console.log(totalDeposit)



