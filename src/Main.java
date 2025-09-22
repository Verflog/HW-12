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

        Author author3 = new Author("Fedor", "Dostoevskiy");
        Book book3 = new Book("Igrok", author3, 1866);

        System.out.println(author1.equals(author3));
        System.out.println(author1.equals(author2));

        System.out.println(author1.hashCode());
        System.out.println(author2.hashCode());
        System.out.println(author3.hashCode());

        System.out.println(book1.equals(book3));
        System.out.println(book1.equals(book2));

        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book3.hashCode());
    }
}