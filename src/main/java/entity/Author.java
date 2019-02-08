package entity;

public class Author {

    private int AuthorID;
    private String FirstNAme;
    private String LastNAme;

    public Author(int authorID, String firstNAme, String lastNAme) {
        AuthorID = authorID;
        FirstNAme = firstNAme;
        LastNAme = lastNAme;
    }

    public int getAuthorID() {
        return AuthorID;
    }

    public void setAuthorID(int authorID) {
        AuthorID = authorID;
    }

    public String getFirstNAme() {
        return FirstNAme;
    }

    public void setFirstNAme(String firstNAme) {
        FirstNAme = firstNAme;
    }

    public String getLastNAme() {
        return LastNAme;
    }

    public void setLastNAme(String lastNAme) {
        LastNAme = lastNAme;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Author author = (Author) o;

        if (AuthorID != author.AuthorID) return false;
        if (FirstNAme != null ? !FirstNAme.equals(author.FirstNAme) : author.FirstNAme != null) return false;
        return LastNAme != null ? LastNAme.equals(author.LastNAme) : author.LastNAme == null;
    }

    @Override
    public int hashCode() {
        int result = AuthorID;
        result = 31 * result + (FirstNAme != null ? FirstNAme.hashCode() : 0);
        result = 31 * result + (LastNAme != null ? LastNAme.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Author{" +
                "AuthorID=" + AuthorID +
                ", FirstNAme='" + FirstNAme + '\'' +
                ", LastNAme='" + LastNAme + '\'' +
                '}';
    }
}
