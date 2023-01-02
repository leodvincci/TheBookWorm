let bookTitle = document.getElementById("book-title")
let bookAuthor = document.getElementById("book-author")
let bookCoverLink = document.getElementById("book-img")
let bookSummary = document.getElementById("book-summary")
let bookLocation = document.getElementById("book-location")
// let id = 0;
let myForm = document.getElementById("my-form")
let bookShelf = document.getElementById("my-book-shelf")
let myBookSummary = document.getElementById("my-book-summary")


let url = "http://localhost:8080/api/v1/book/getAllBooks"
console.log("Hello")
fetch(url)
    .then((res)=>{
        return res.json();
    })
    .then((data)=>{
        data.forEach(x=>{
           let cardTitle = document.createElement("h4");
           let cardAuthor = document.createElement("h5");
           let cardLocation = document.createElement("h6");
           let cardImg = document.createElement("img");
           let newDiv = document.createElement("div");

           cardImg.src=x.bookCoverLink;
           cardTitle.innerText = x.bookTitle
           cardAuthor.innerText = x.bookAuthor;
           cardLocation.innerText = x.bookLocation;
           newDiv.classList.add("book-item");
           cardImg.classList.add("book-item-cover")

           newDiv.appendChild(cardImg);
           newDiv.appendChild(cardTitle);
           newDiv.appendChild(cardAuthor);
           newDiv.appendChild(cardLocation);

           newDiv.addEventListener("click", ()=>{
               bookTitle.innerText = x.bookTitle;
               bookAuthor.innerText = x.bookAuthor;
               bookCoverLink.src = x.bookCoverLink;
               myBookSummary.innerText = x.bookSummary
           })

           bookShelf.appendChild(newDiv)


        })
    })




function helloWorld(){
    myForm.addEventListener("submit", function(event){
        event.preventDefault()
    });
    const data = {
        bookTitle:bookTitle.value,
        // id:id,
        bookLocation:bookLocation.value,
        bookAuthor:bookAuthor.value,
        bookCoverLink:bookCoverLink.value,
        bookSummary:bookSummary.value
    };

    fetch('http://localhost:8080/api/v1/book/addNewBook', {
        method: 'POST', // or 'PUT'
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(data),
    })
        .then((response) => response)
        .then((data) => {
            console.log('Success:', data);
        })
        .catch((error) => {
            console.error('Error:', error);
        });

    // id +=1;
}