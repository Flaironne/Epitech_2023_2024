function hideParagraphsOnClick() {
    const button = document.querySelector('button');
    
    const paragraphs = document.querySelectorAll('p');
    
    button.addEventListener('click', () => {
      paragraphs.forEach(paragraph => {
        paragraph.style.display = 'none';
      });
    });
  }
hideParagraphsOnClick();