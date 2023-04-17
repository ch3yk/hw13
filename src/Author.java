import java.util.Objects;

public class Author {
    private String authorName;

    public Author(String authorName) {
        this.authorName=authorName;
    }

    public  String toString() {
        return authorName;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(authorName, author.authorName);
    }


    public int hashCode() {
        return Objects.hash(authorName);
    }
}