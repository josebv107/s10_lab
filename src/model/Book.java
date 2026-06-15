package model;

public class Book {
    private String title;
    private String author;
    private int year;
    private String publisher;
    private String language;
    private String genre;
    private double price;

    public Book(String title, String author, int year, String publisher, String language, String genre, double price) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.publisher = publisher;
        this.language = language;
        this.genre = genre;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getLanguage() {
        return language;
    }

    public String getGenre() {
        return genre;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format(
                "\"%s\" - %s (%d) | Editorial: %s | Idioma: %s | Genero: %s | Precio: S/ %.2f",
                title, author, year, publisher, language, genre, price
        );
    }
}
