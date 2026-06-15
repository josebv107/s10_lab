package iterator;

import model.Book;
import model.CategoryNode;

public class BookCatalog implements Aggregate<Book> {
    private final CategoryNode root;

    public BookCatalog() {
        this.root = buildCatalog();
    }

    @Override
    public Iterator<Book> createIterator() {
        return new TreeIterator(root);
    }

    public CategoryNode getRoot() {
        return root;
    }

    private CategoryNode buildCatalog() {
        CategoryNode kindleStore = new CategoryNode("Kindle Store");

        // Categoría: Ficción
        CategoryNode ficcion = new CategoryNode("Ficcion");

        CategoryNode clasicos = new CategoryNode("Clasicos");
        clasicos.addChild(new CategoryNode(
                new Book("El Principito (edición original) (Spanish Edition)", "Antoine de Saint-Exupery", 2015,
                        "SALAMANDRA INFANTIL Y JUVENIL", "Español", "Fabula", 6.99)
        ));
        clasicos.addChild(new CategoryNode(
                new Book("Cien Años de Soledad", "Gabriel Garcia Marquez", 1967, "Sudamericana",
                        "Español", "Realismo magico", 14.50)
        ));
        clasicos.addChild(new CategoryNode(
                new Book("1984 (edición definitiva avalada por The Orwell Estate) (Spanish Edition)",
                        "George Orwell", 1949, "DEBOLS!LLO", "Español", "Distopia", 7.99)
        ));

        CategoryNode fantasia = new CategoryNode("Fantasia");
        fantasia.addChild(new CategoryNode(
                new Book("El Hobbit (edición revisada) (El Señor de Los anillos (edición rústica)) (Spanish Edition)",
                        "J.R.R. Tolkien", 1937, "Minotauro", "Español", "Fantasia", 7.99)
        ));
        fantasia.addChild(new CategoryNode(
                new Book("Harry Potter y la piedra filosofal (Spanish Edition)", "J.K. Rowling",
                        1997, "Pottermore Publishing", "Español", "Fantasia juvenil", 11.99)
        ));

        ficcion.addChild(clasicos);
        ficcion.addChild(fantasia);

        //Categoría: Tecnología
        CategoryNode tecnologia = new CategoryNode("Tecnologia");

        CategoryNode programacion = new CategoryNode("Programacion");
        programacion.addChild(new CategoryNode(
                new Book("Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin",
                        2008, "Pearson", "Inglés", "Programacion", 25.00)
        ));
        programacion.addChild(new CategoryNode(
                new Book("Design Patterns in Action: Implementing Effective Design Patterns in Java",
                        "Dinesh Varyani", 2025, "Notion Press",
                        "Inglés", "Programacion", 1.99)
        ));

        tecnologia.addChild(programacion);
        tecnologia.addChild(new CategoryNode(
                new Book("A Brief History of Time", "Stephen Hawking", 2011, "Bantam Books",
                        "Inglés", "Divulgacion cientifica", 14.99)
        ));

        //Categoría: Negocios
        CategoryNode negocios = new CategoryNode("Negocios");
        negocios.addChild(new CategoryNode(
                new Book("Padre Rico, Padre Pobre (Ed. 25 aniv): Edición actualizada para el mundo de hoy con sesiones de estudio en cada capítulo (Spanish Edition)",
                        "Robert Kiyosaki", 2023, "AGUILAR", "Español", "Finanzas personales", 10.99)
        ));
        negocios.addChild(new CategoryNode(
                new Book("El arte de la guerra (edición ilustrada) (Spanish Edition)", "Sun Tzu", 2024,
                        "ROCA EDITORIAL", "Español", "Estrategia", 9.99)
        ));

        //Como quedaría el árbol final
        kindleStore.addChild(ficcion);
        kindleStore.addChild(tecnologia);
        kindleStore.addChild(negocios);

        return kindleStore;
    }
}
