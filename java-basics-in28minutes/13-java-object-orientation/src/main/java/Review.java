public class Review {
    private int id;
    private String description;
    private byte rating;

    public Review(int id, String description, byte rating) {
        this.id = id;
        this.description = description;
        this.rating = rating;
    }

    public String toString() {
        return "(Review-" + id + ", " + description + ", " + rating + ")";
    }
}
