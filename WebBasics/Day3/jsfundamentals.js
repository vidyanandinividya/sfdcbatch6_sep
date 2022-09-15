//values and variables
/*var name="Jonas"
console.log(name)
name=12
console.log(name)
name=true
console.log(name)

let firstName="Matilda";
console.log(firstName)
console.log(firstName)
console.log(firstName)
//variable naming conventions
let jonas_matilda="JM"
let $function=27
let person="jonas"
let PI=3.1415
let myFirstJob="Coder"
let myCurrentJob="Teacher"
let job1="programmer"
let job2="teacher"
console.log(job1)*/
//Data Types
/*let javaScriptIsEasy=true
console.log(javaScriptIsEasy)
console.log(typeof javaScriptIsEasy)
console.log(typeof 23)
javaScriptIsEasy='Yes'
console.log(typeof javaScriptIsEasy)
let year
console.log(typeof year)
year=1991
console.log(typeof year)
let firstName=null
console.log(typeof firstName)*/
//let, const and var
/*let age=30;
age=31;
const birthYear=1991
console.log(birthYear)
var firstName='john'
console.log(firstName)
firstName='jack'
console.log(firstName)
var firstName='annie'
console.log(firstName)
let lastName='smith'
lastName='potter'*/
//Basic Operators
//Math operators
/*const now=2037
const ageJonas=now-1991
const ageSarah=now-2018
console.log(ageJonas,ageSarah)
console.log(ageJonas*2, ageSarah/10,2**3)
const firstName='Jonas'
const lastName='Smith'
console.log(firstName+ ' '+ lastName)
//Assignment Operator
let x=10+5 //15
x+=10 //x=x+10 =25
x*=4 //x=x*4 =100
x++ //x=x+1 =101
x-- // x=x-1 =100
console.log(x)
//comparison operator
// > < >= <= != == ===
console.log(ageJonas>ageSarah)
console.log(ageSarah>=18)
const isFullAge=ageSarah>=18
console.log(isFullAge)
console.log(now-1992 > now-2018)
//operator precedence
let y,z;
y=z=25-10-5
console.log(y,z)
const aveargeAge=(ageJonas+ageSarah)/2
console.log(ageJonas,ageSarah,aveargeAge)*/
//String and Template Literals
/*const firstName='Jonas'
const job='teacher'
const birthYear=1991
const year=2022
//String Literal
const jonas="I'm "+ firstName + ', a '+ (year-birthYear) + ' years old '+ job + '!';
console.log(jonas)
//Template Literal
const jonasNew=`I'm ${firstName}, a ${year-birthYear} years old ${job} !`
console.log(jonasNew)
console.log(`Just a regualr string.....`)
//string literal
console.log('string with \n\
multiple \n\
lines');
//template literal
console.log(`string
multiple
lines`)*/
//Taking Decessions: if /else statement
/*const age=19
if(age>=18)
{
    console.log('sarah can start driving licence')
}
else
{
    const yearsLeft=18-age;
    console.log(`sarah is too young. wait another ${yearsLeft} years :)`)
}
const birthYear=1999
let century
if(birthYear<=2000)
{
    century=20
}
else
{
    century=21
}
console.log(century)*/
//Equality Operators: == vs. ===
/*const age='18'
if(age===18)
console.log('you just became an adult (strict)')
if(age==18)
console.log('you just became an adult (loose)')*/
//Logical Operator
/*const hasDriversLicense=true; //A
const hasGoodVision=false; //B
console.log(hasDriversLicense && hasGoodVision)
console.log(hasDriversLicense||hasGoodVision)
console.log(!hasDriversLicense)
if(hasDriversLicense&&hasGoodVision)
{
    console.log('sarah is able to drive')
}
else
{
    console.log('someone else should drive')
}
const isRetired=false; //C
console.log(hasDriversLicense&&hasGoodVision&&isRetired)*/
//Switch Statement
const day='Thursday'
/*switch(day)
{
    case 'monday':
        console.log('Plan course structure');
        console.log('Go to coding meetup')
        break;
    case 'tuesday':
        console.log('prepare theory videos');
        break;
    case 'wednesday':
        console.log('write code examples');
        break;
    case 'thursday':
    case 'Thursday':
    case 'friday':
        console.log('Record videos')
        break;
    case 'saturday':
    case 'sunday':
        console.log('Enjoy the weekend')
        break;
    default:
        console.log('Not a valid day')
}*/
/*if(day=='monday')
{
    console.log('Monday');
}
else if(day=='tuesday')
{
    console.log('tuesday');
}
else if(day=='wednesday')
{
    console.log('wednesday')
}
else if(day=='Thursday' || day=='friday')
{
    console.log('Thursday | Friday')
}
else if(day=='saturday' || day=='sunday')
{
    console.log('Enjoy the weekend')
}
else
{
    console.log('Not a valid day')
}*/
//The conditional (Ternary) operator
const age=23
/*if(age>=18)
console.log('I like to drink coffee')
else
console.log('I like to drink milk')*/
age>=18 ? console.log('I like to drink coffee'): console.log('I like to drink milk')
console.log(`I like to drink ${age>=18 ? 'cofee': 'milk'}`);



