window.addEventListener('scroll', function() {
    const heading-introduce = document.getElementById('myElement');
    const heading-introduce = myElement.getBoundingClientRect().top;
    const heading-introduce = myElement.getBoundingClientRect().bottom;
    const heading-introduce = window.innerHeight;

    if (myElementTop < windowHeight && myElementBottom > 0) {
        heading-introduce.classList.add('animate');
    } else {
        heading-introduce.classList.remove('animate');
    }
});