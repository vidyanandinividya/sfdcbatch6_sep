//Accessing and manipulating DOM elements
//you can access a webpage element only by its ID
//using getElementById method
//1. getElementById method returns null if no webpage element is present with sepcified ID
// 2. if more than one element with the same ID is present in the web page, then only first element will be returned
let p=document.getElementById('intro');
console.log(p)
p.style.backgroundColor='yellow'
//textContent property is used to read the content of the webpage element
let pContent=p.textContent
console.log(pContent)
// 1. queryselector will return null if no webpage element is present with 
// specified ID, class or tag
//2. if more than one element with the same ID, class, or tag is present
// in the web page, then only the first element will be retuened by the query selector
let div=document.querySelector('.list')
console.log(div)
//innerHtml returns the HTML content of a webpage element
let divContent=div.innerHTML;
console.log(div)
let h1=document.querySelector('#heading')
console.log(h1)
h1.style.color='red';
p.textContent='This is a dynamic generated content'
div.innerHTML=`<table border=1>
<tr>
    <td>1</td>
    <td>John</td>
</tr>
<tr>
    <td>2</td>
    <td>Jack</td>
</tr>
</table>
`
//Remove a class from a webpage element
document.querySelector('.container').classList.remove('container')