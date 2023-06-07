package md.Maria.bookcollectiontask;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> bookList;
    private String name;

    public Library(String name) {
        this.name = name;
        bookList = new ArrayList<>();
    }

    public void addBook(Book inputBook) {
        bookList.add(inputBook);

    }

    public void addBookWithMultipleParameters(Book inputBook, Book secondInputBook) {
        bookList.add(inputBook);
        bookList.add(secondInputBook);

    }

    public int returnNumberBooks() {
        return bookList.size();
    }

    public void removeBook(int elementPosition) {
        try {
            Book deleteBook = bookList.remove(elementPosition);
            System.out.println("The following book was deleted " + deleteBook.getTitleBook());
        } catch (IndexOutOfBoundsException exceptionObject) {
            System.out.println("Please review the index, somthing is not good at all: " + exceptionObject.getMessage());
        }
    }

    public void removeBook(Book removeBook) {
        boolean isDeleted = bookList.remove(removeBook);
        if (isDeleted) {
            System.out.println("The book was deleted: " + removeBook.getTitleBook());
        } else {
            System.out.println("The is not supch a book" + removeBook.getTitleBook());
        }
    }

    public void removeBook(String bookTitle) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getTitleBook() == bookTitle) {
                bookList.remove(i);
                break;
            }
        }
    }

    public boolean existBookOrNot(String titleBook) {
        if (titleBook == titleBook) {
            return true;
        } else {
            return false;
        }
    }

    public void printAllTheBooks() {
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println("The book number: " + i + " " + bookList.get(i).getTitleBook() + " by " + bookList.get(i).getAuthorBook());
        }
    }


    public void addAnotherListOfBooksInLibraryList(List<Book> anotherListOfBook) {
        this.bookList.addAll(anotherListOfBook);
    }

    public List<Book> getBookList() {
        return this.bookList;
    }


}
