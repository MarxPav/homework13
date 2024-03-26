public class Book {
    private String name;
    private int publicationYear;
    private Author author;

    public Book(String name, int publicationYear, Author author) {
        this.name = name;
        this.publicationYear = publicationYear;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public Author getAuthor() {
        return author;
    }
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return " " +
                "Название: " + name +
                "; Год публикации: " + publicationYear +
                "; Автор: " + author +
                ' ';
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Book book = (Book) object;
        return publicationYear == book.publicationYear && java.util.Objects.equals(name, book.name) && java.util.Objects.equals(author, book.author);
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), name, publicationYear, author);
    }
}
