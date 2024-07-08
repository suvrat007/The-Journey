const open_btn = document.querySelector('.open-btn')
const close_btn = document.querySelector('.close-btn')
const navItems = document.querySelectorAll('.nav')

open_btn.addEventListener('click' , () =>{
    navItems.forEach(navEl => navEl.classList.add('visible'))
})

close_btn.addEventListener('click' , () =>{
    navItems.forEach(navEl => navEl.classList.remove('visible'))
})
