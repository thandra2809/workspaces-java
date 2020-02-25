public class BookReviewRunner {
    public static void main(String[] args) {
        Book book = new Book(123, "Object Oriented Programming With Java", "Ranga");
        book.addReview(new Review(10, "Great Book", (byte)4));
        book.addReview(new Review(101, "Awesome", (byte)5));
        System.out.println(book);
    }
}
