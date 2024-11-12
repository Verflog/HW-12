public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getFullName() {
        return this.name + " " + this.surname;
    }

    public String toString() {
        return name + " " + surname;
    }

    public boolean equals(Object x) {
        Author author = (Author) x;
        return (name == author.name) && (surname == author.surname);
    }

    public int hashCode() {
        return (name + surname).hashCode();
    }
}
