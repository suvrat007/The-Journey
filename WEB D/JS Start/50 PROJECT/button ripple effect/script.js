const buttons= document.querySelectorAll('.ripple')

buttons.forEach(button => {
    button.addEventListener('click', function (e){
        const x =e.clientX    // stores position of X and Y
        const y= e.clientY

        const buttonTop = e.target.offsetTop
        const buttonleft = e.target.offsetleft

        const xInside = x- buttonleft
        const yInside = y - buttonTop

        const circle = document.createElement('span')
        circle.classList.add('circle')
        circle.style.top = yInside + 'px'
        circle.style.left = xInside + 'px'

        this.appendChild(circle)
        setTimeout(()=>circle.remove(),500)
    })
})