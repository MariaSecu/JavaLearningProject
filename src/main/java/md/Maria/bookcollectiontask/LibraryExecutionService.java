package md.Maria.bookcollectiontask;

import java.util.HashMap;
import java.util.Map;

public class LibraryExecutionService {
    public static void main(String[] args) {
        Book atomicBook = new Book("Atomic habits", "James C.");
        Book uglyBook = new Book("Ugly love", "Colleen H.");
        Book cheeseBook = new Book("Who Moved My Cheese?", "Spenser J.");
        Book prosperityBook = new Book("Prosperity", "Suh Y.");
        Book outliersBook = new Book("Outliers", "Malcoln G.");

        System.out.println(uglyBook.getTitleBook());
        System.out.println(uglyBook.getAuthorBook());

        Library fatFrumos = new Library("Fat frumos");

        fatFrumos.addBook(atomicBook);
        fatFrumos.addBook(uglyBook);
        fatFrumos.addBookWithMultipleParameters(cheeseBook, outliersBook);
        fatFrumos.printAllTheBooks();

        System.out.println("The number of books are: " + fatFrumos.returnNumberBooks());
        fatFrumos.removeBook(3);
        fatFrumos.removeBook(prosperityBook);
        System.out.println("The number of books after remove: " + fatFrumos.returnNumberBooks());

        Library lumeLibrary = new Library("Lume");
        lumeLibrary.addBook(outliersBook);
        lumeLibrary.addBookWithMultipleParameters(uglyBook, atomicBook);
        lumeLibrary.addBook(prosperityBook);
        System.out.println(lumeLibrary.returnNumberBooks());

        Map<String, Library> LibrariesNetwork = new HashMap<>();
        LibrariesNetwork.put("str. Stefan cel Mare", fatFrumos);
        LibrariesNetwork.get("str. Stefan cel Mare").addBook(outliersBook);
        LibrariesNetwork.put("str.Grigore Vieru", lumeLibrary);
        LibrariesNetwork.get("str.Grigore Vieru").printAllTheBooks();
        LibrariesNetwork.get("str. Stefan cel Mare").addAnotherListOfBooksInLibraryList(lumeLibrary.getBookList());
        LibrariesNetwork.get("str. Stefan cel Mare").printAllTheBooks();


    }
}
