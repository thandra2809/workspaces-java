import java.util.ArrayList;

public class Book {
    private int id;
    private String title;
    private String author;

    private ArrayList<Review> reviewList = new ArrayList<Review>();

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public void addReview(Review review) {
        reviewList.add(review);
    }

    public String toString() {
        return "(Book-" + id + ",  " + title + ", " + author + ", " + reviewList+ ")";
    }
}
