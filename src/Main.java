public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Fedor", "Dostoevskiy");
        Book book1 = new Book("Igrok", author1, 1866);
        Author author2 = new Author("Lev", "Tolstoy");
        Book book2 = new Book("Zelenaya palochka", author2, 1905);
        System.out.println(book1.getTitle() + " " + book1.getAuthor() + " " + book1.getPublicationYear());
        System.out.println(book2.getTitle() + " " + book2.getAuthor() + " " + book2.getPublicationYear());
        book2.setPublicationYear(1911);
        System.out.println(book2.getTitle() + " " + book2.getAuthor() + " " + book2.getPublicationYear());
    }
}