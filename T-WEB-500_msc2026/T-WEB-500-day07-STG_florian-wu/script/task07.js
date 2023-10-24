// When the link in the white box is clicked:
// ✓ a cookie acceptsCookies is created ;
// ✓ it expires in 1 day ;
// ✓ its value is true.
// The message in the white box must not be displayed if:
// ✓ the cookie is already defined ;
// ✓ its value is true.
// However, you will need to make a second white box appear with a button “Delete the cookie”.
// When this button is clicked:
// ✓ the second white box is deleted ;
// ✓ the cookie is deleted ;
// ✓ the first message reappears


function getCookie(cookieName) {
    const cookies = document.cookie.split('; ');
    for (const cookie of cookies) {
      const [name, value] = cookie.split('=');
      if (name === cookieName) {
        return decodeURIComponent(value);
      }
    }
    return null; // Return null if the cookie is not found
  }
  


document.querySelector("footer>div").addEventListener("click",setCookie);

function setCookie() {
    cname = "acceptsCookies";
    cvalue = true;
    const d = new Date();
    d.setDate(d.getDate() + 1);;
    const expires = d.toUTCString();
    document.cookie = `acceptsCookies=true; expires=${expires}; path=/`;
    const acceptsCookiesValue = getCookie('acceptsCookies');
    console.log(acceptsCookiesValue);

}

  // Get the value of the 'acceptsCookies' cookie
  
  
  // Log the value to the console
  