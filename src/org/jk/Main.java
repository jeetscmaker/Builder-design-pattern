package org.jk;

public class Main {
    public static void main(String[] args) {
        Book.BookBuilder bookBuilder = new Book.BookBuilder("Mastermind", "2554672");
        Book book = bookBuilder.withAuthor("Jane Brockhorn")
                .withPublisher("Paramount")
                .withYear(2015)
                .withPrice(24.5)
                .build();
        System.out.println(book);
    }
}
