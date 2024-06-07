const labels = document.querySelectorAll('.form-control label')
labels.forEach(label =>{
    lebel.innerHTML=label.innerText
        .split('') // makes to array
        .map((letter, idx)=> `<span style="transition-delay:${idx*50}ms">$(letter)<\span>`)
        .join('')
})