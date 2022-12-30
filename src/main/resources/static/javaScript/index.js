let bookTitle = document.getElementById("book-title")
let bookAuthor = document.getElementById("book-author")
let bookCoverLink = document.getElementById("book-cover-link")
let bookSummary = document.getElementById("book-summary")

let id = 0;


function helloWorld(){

    const data = {
        bookTitle:bookTitle.value,
        id:id,
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

    id +=1;
}