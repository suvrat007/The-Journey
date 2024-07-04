const contents = document.querySelectorAll('.content')
const listItems = document.querySelectorAll('nav ul li')

listItems.forEach((items,idx) => {
    console.log(items);

    items.addEventListener('click',()=>{
        hideAllContents()
        hideAllItems()
        
        
        items.classList.add('active')
        contents[idx].classList.add('show')
    })
})

function hideAllContents(){
    contents.forEach(content => content.classList.remove('show'))
}

function hideAllItems(){
    listItems.forEach(item => item.classList.remove('active'))
}