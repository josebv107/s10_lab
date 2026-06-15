package app;

import iterator.Aggregate;
import iterator.BookCatalog;
import iterator.Iterator;
import model.Book;

public class Main {
    static void main() {
        Aggregate<Book> catalog = new BookCatalog();

        System.out.println("****** Recorrido del catalogo de Kindle Store (DFS Pre-order) ******\n");

        Iterator<Book> iterator = catalog.createIterator();

        int contador = 1;
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(contador + ". " + book);
            contador++;
        }
    }
}
