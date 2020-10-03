package org.jk;

public class Book {
    private String name; // mandatory
    private String isbn; // mandatory
    private String author;
    private double price;
    private String publisher;
    private int year;

    private Book() {
    }

    public static class BookBuilder {
        private String name; // mandatory
        private String isbn; // mandatory
        private String author;
        private double price;
        private String publisher;
        private int year;

        public BookBuilder(String name, String isbn) {
            this.name = name;
            this.isbn = isbn;
        }

        public BookBuilder withAuthor(String author) {
            this.author = author;
            return this;
        }

        public BookBuilder withPrice(double price) {
            this.price = price;
            return this;
        }

        public BookBuilder withPublisher(String publisher) {
            this.publisher = publisher;
            return this;
        }

        public BookBuilder withYear(int year) {
            this.year = year;
            return this;
        }

        public Book build() {
            Book book = new Book();
            book.setAuthor(this.author);
            book.setName(this.name);
            book.setIsbn(this.isbn);
            book.setPrice(this.price);
            book.setPublisher(this.publisher);
            book.setYear(this.year);
            return book;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book Details{" +
                "name='" + name + '\'' +
                ", isbn='" + isbn + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                '}';
    }
}
