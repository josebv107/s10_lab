package model;

import java.util.ArrayList;
import java.util.List;

public class CategoryNode {
    private String name;
    private Book book;
    private final List<CategoryNode> children;

    //Constructor para crear un nodo de tipo 'categoría'
    public CategoryNode(String name) {
        this.name = name;
        this.book = book;
        this.children = new ArrayList<>();
    }

    //Constructor para crear un nodo de tipo 'libro'
    public CategoryNode(Book book) {
        this.name = book.getTitle();
        this.book = book;
        this.children = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Book getBook() {
        return book;
    }

    public boolean isBook() {
        return book != null;
    }

    public List<CategoryNode> getChildren() {
        return children;
    }

    public void addChild(CategoryNode child) {
        this.children.add(child);
    }
}
