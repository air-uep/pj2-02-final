package pl.air.bookstore;

import pl.air.bookstore.model.*;

public class Application {

    public static void main(String[] args) {

        // ******************** utwórz dane ********************

        // utwórz autorów
        Author fredro = new Author("Aleksander", "Fredro");
        fredro.setProfile(
            "Aleksander Fredro hrabia herbu Bończa – polski komediopisarz, pamiętnikarz, poeta, wolnomularz, tworzył w epoce romantyzmu. Uważany jest za najwybitniejszego komediopisarza w historii literatury polskiej."
        );

        Author mickiewicz = new Author("Adam", "Mickiewicz");
        mickiewicz.setProfile(
            "Adam Bernard Mickiewicz (1798-1855) – polski poeta, działacz polityczny, publicysta, tłumacz. Uważany za jednego z trzech największych poetów polskiego romantyzmu oraz literatury polskiej. " +
            "Znany przede wszystkim jako autor ballad, powieści poetyckich, dramatu 'Dziady' oraz epopei narodowej 'Pan Tadeusz' uznawanej za ostatni wielki epos kultury szlacheckiej w Rzeczypospolitej Obojga Narodów."
        );

        Author slowacki = new Author("Juliusz", "Słowacki");
        slowacki.setProfile(
            "Juliusz Słowacki herbu Leliwa (1809-1849) – polski poeta, przedstawiciel romantyzmu, dramaturg i epistolograf. " +
            "Określany jako jeden z Wieszczów Narodowych. Pozostawił po sobie 13 dramatów, blisko 20 poematów, setki wierszy, listów oraz jedną powieść. Stworzył spójny system filozoficzny, który nazwał filozofią genezyjską."
        );

        Author wrycza = new Author("Stanisław", "Wrycza");
        Author marcinkowski = new Author("Bolesław", "Marcinkowski");
        Author wyrzykowski = new Author("Karol", "Wyrzykowski");
        Author maslankowski = new Author("Jacek", "Maślankowski");


        // uwtórz wydawnictwa
        Publisher nk = new Publisher("Nasza Księgarnia");
        nk.setLocation("Warszawa");
        Publisher wsip = new Publisher("Wydawnictwa Szkolne i Pedagogiczne");
        Publisher helion = new Publisher("Helion");
        helion.setLocation("Gliwice");
        Publisher pwe = new Publisher("Polskie Wydawnictwo Ekonomiczne");
        Publisher pwn = new Publisher("Wydawnictwo Naukowe PWN");


        // utwórz książki
        Book zemsta = new Book("Zemsta");
        zemsta.setPublisher(nk);
        zemsta.addAuthors(fredro);

        Book sluby = new Book("Śluby panieńskie", wsip, fredro);

        Book panT = new Book("Pan Tadeusz", nk, mickiewicz);

        Book uml = new Book(
            "Język UML 2.0 w modelowaniu systemów informatycznych", helion, wrycza, marcinkowski, wyrzykowski
        );

        Book infEkonom = new Book(
            "Informatyka ekonomiczna. Teoria i zastosowania", pwn, wrycza, maslankowski
        );


        // utwórz użytkowników
        User u1 = new User("Ula", "Nowak", "ulcia", "ulcia123");
        User u2 = new User("Adam", "Piasecki", "adam1990", "koninmojemiasto");
        User u3 = new User("Kama", "Plama", "kama", "trudnehaslo");
        User u4 = new User("Piotr", "Bez nazwiska", "piotras60", "pjkfyrets123#$%");



        // ******************** wydrukuj dane ********************
        // --------------- Książki ---------------
        printBook(panT);
        printBook(zemsta);

        // --------------- Osoby ---------------
        printPerson(mickiewicz);    // autor
        printPerson(u1);            // użytkownik
        printPerson(u2);            // użytkownik
        printPerson(fredro);        // autor
        printPerson(wrycza);        // autor
    }


    public static void printBook(Book book) {
        System.out.println("--> Informacja o książce:");
        book.printInfo();
        System.out.println();
    }
    public static void printPerson(Person person) {
        System.out.println("--> Informacja o osobie:");
        person.printInfo();
        System.out.println();
    }

}
