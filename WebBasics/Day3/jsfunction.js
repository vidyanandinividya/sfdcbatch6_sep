//Functions
/*function logger()
{
    console.log('My name is John');
}
//calling / running / invoking function
logger();
logger();
logger();

function fruitProcessor(apple,oranges)
{
    const juice=`Juice with ${apple}  apples and ${oranges} oranges `;
    return juice;
}
const juice=fruitProcessor(5,2)
console.log(juice)

//Multiplication of two numbers using function
function multiplication(num1,num2)
{
    return num1*num2;
}
const result=multiplication(2,5)
console.log(result)*/ 
//Function Declartion & Function Expression
//Function Declartion
/*function calcAge(birthYear)
{
    return 2022-birthYear
}
const age=calcAge(1991)
//Function Expression
const calcAge1= function(birthYear)
{
    return 2022-birthYear
}
const age1=calcAge1(1992)
console.log(age,age1)
//Arrow Function
const calcAge2=birthYear=>2022-birthYear;
const age2=calcAge2(1993)
console.log(age2)
//Addition of two numbers using arrow function
const division=(num1,num2)=>{
    if(num2>0)
    {
        return num1/num2;
    }
    else
     return 0;
}
console.log(division(12,-6))*/
//Function Returning Functions
const greet=function(greeting)
{
    return function(name)
    {
        console.log(`${greeting} ${name}`)
    }
}

const greetArr=greeting=>name=>console.log(`${greeting} ${name}`);

function fn1(num1,num2,num3)
{
    console.log(num1+num2+num3)
}
const add=(num1,num2,num3)=>{console.log(num1+num2+num3)}

greetArr('Hi')('Jonas')
greet('Hello')('John');
greet('Hello')('Tom');

const greetHey=greet('Hey');
greetHey('Annie')
greetHey('Tom')
