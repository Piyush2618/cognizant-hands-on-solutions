function BookDetails() {

    const books = [
        {
            id: 1,
            title: "React in Action",
            author: "Mark Tielens Thomas"
        },
        {
            id: 2,
            title: "Learning React",
            author: "Alex Banks"
        }
    ];

    return (
        <div>
            <h2>Book Details</h2>

            {books.map((book) => (
                <div key={book.id}>
                    <h3>{book.title}</h3>
                    <p>{book.author}</p>
                    <hr />
                </div>
            ))}

        </div>
    );
}

export default BookDetails;