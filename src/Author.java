public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public java.lang.String toString() {
        return " " +
                "Имя: " + firstName +
                "; Фамилия: " + lastName +
                ' ';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Author author = (Author) object;
        return java.util.Objects.equals(firstName, author.firstName) && java.util.Objects.equals(lastName, author.lastName);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), firstName, lastName);
    }
}
