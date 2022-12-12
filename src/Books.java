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
}
