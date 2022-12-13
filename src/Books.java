import java.util.Objects;

public class Books {
    private   String title;
    private int yearPublication;
    private Author author;
    public Books (String title,int yearPublication, Author author){
        this.title = title;
        this.yearPublication = yearPublication;
        this.author = author;
    }
    public String getTitle(){
        return title;
    }
    public int getYearPublication(){
        return yearPublication;
    }
    public Author getAuthor(){
        return author;
    }
    public void setYearPublication(int yearPublication){
        this.yearPublication = yearPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Books books = (Books) o;
        return yearPublication == books.yearPublication && Objects.equals(title, books.title) && Objects.equals(author, books.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, yearPublication, author);
    }

    @Override
    public String toString() {
        return  "Название: \"" + title + "\"," +
                " год публикации: " + yearPublication +
                " Автор: " + author.toString();
    }
}
