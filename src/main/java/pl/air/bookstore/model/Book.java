package pl.air.bookstore.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Book extends BaseEntity {

    private List<Author> authors;
    private String title;
    private Publisher publisher;

    // ********** Constructors **********
    public Book() {
        this.authors = new ArrayList<>();
    }
    public Book(String title) {
        this();
        this.title = title;
    }
    public Book(String title, Publisher publisher) {
        this(title);
        this.publisher = publisher;
    }
    public Book(String title, Publisher publisher, Author... authors) {
        this(title, publisher);
        addAuthors(authors);
    }


    // ********** Business methods **********

	// pierwsza wersja metody - umożliwia dodane jednego autora
	// public void addAuthor(Author author) {
	//     this.authors.add(author);
	// }

    // druga wersja metody - umożliwia dodanie dowolnej liczby autorów (także jednego)
    public void addAuthors(Author... authors) {
        for (Author a : authors) {
            this.authors.add(a);
        }
    }

    public void printInfo() {
        // wydrukuj tytuł
        System.out.println(title);

        // wydrukuj nazwiska autorów
        String printout = null;
        // ustaw prefiks w zależności od liczby autorów
        if (authors.size() == 1) {
            printout = " - autor: ";
        }
        else {
            printout = " - autorzy: ";
        }
        // dodaj nazwiska autorów
        for (Author one : authors) {
            printout += one.getFullName() + ", ";
        }
        // usuń ", " po ostatnim nazwisku
        printout = printout.substring(0, printout.lastIndexOf(", "));
        //
        System.out.println(printout);

        // wydrukuj wydawnictwo
        if (publisher != null) {
            System.out.println(" - wydawnictwo: " + publisher.getFullName());
        }
    }

}
