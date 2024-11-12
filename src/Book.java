public class Book {
    private String title;
    private Author author;
    private int publicationYear;

    public Book(String title, Author author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public String toString() {
        return title + " " + author.toString() + " " + publicationYear;
    }

    public boolean equals(Object x) {
        Book book = (Book) x;
        return (title == book.title) && (author.equals(book.getAuthor())) && (publicationYear == book.publicationYear);
    }

    public int hashCode() {
        return (title + getAuthor() + publicationYear).hashCode();
    }
}
