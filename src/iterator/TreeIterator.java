package iterator;

import model.Book;
import model.CategoryNode;

import java.util.Stack;

public class TreeIterator implements Iterator<Book> {
    private final Stack<CategoryNode> pending;

    public TreeIterator(CategoryNode root) {
        this.pending = new Stack<>();
        if(root != null) {
            pending.push(root);
        }
    }

    @Override
    public boolean hasNext() {
        avanzarHastaSiguienteLibro();
        return !pending.isEmpty();
    }

    @Override
    public Book next() {
        avanzarHastaSiguienteLibro();

        if(pending.isEmpty()) {
            throw new IllegalStateException("No hay mas libros para recorrer.");
        }

        CategoryNode current = pending.pop();

        for (int i = current.getChildren().size() - 1; i >= 0; i--) {
            pending.push(current.getChildren().get(i));
        }

        return current.getBook();
    }

    private void avanzarHastaSiguienteLibro() {
        while (!pending.isEmpty() && !pending.peek().isBook()) {
            CategoryNode current = pending.pop();

            for (int i = current.getChildren().size() - 1; i >= 0; i--) {
                pending.push(current.getChildren().get(i));
            }
        }
    }
}
