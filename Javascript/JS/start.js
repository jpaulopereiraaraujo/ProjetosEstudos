let persons =[
{
    name:'Priscila',
    age:26,
},

{
    name:'Maria Luiza',
    age:22,
},

{
    name:'Caio',
    age:28,
}

]

function getPerson(person){
    let result = person.filter( item => item.age > 27)
    console.log(result)
    

};

getPerson(persons)


//console.log(typeof personA)//typoof retorna o tipo do objeto