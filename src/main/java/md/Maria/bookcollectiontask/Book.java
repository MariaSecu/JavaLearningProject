package md.Maria.bookcollectiontask;

public class Book {
    private String titleBook;
    private String authorBook;

    public Book(String title, String author) {
        this.titleBook = title;
        this.authorBook = author;
    }

    public void getTitle() {
    }

    public String getAuthorBook() {
        return this.authorBook;
    }

    public String getTitleBook() {
        return this.titleBook;
    }
}
