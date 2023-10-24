function addBlueClassOnHover() {
    const paragraphs = document.querySelectorAll('p');
    
    paragraphs.forEach(paragraph => {
    paragraph.addEventListener('mouseenter', () => {
        paragraph.classList.add('blue');
    });
    
    paragraph.addEventListener('mouseleave', () => {
        paragraph.classList.remove('blue');
    });
    });
}

function toggleHighlightedClassOnClick() {
    const paragraphs = document.querySelectorAll('p');
    
    paragraphs.forEach(paragraph => {
    paragraph.addEventListener('click', () => {
        paragraph.classList.toggle('highlighted');
    });
    });
}

addBlueClassOnHover();
toggleHighlightedClassOnClick();
