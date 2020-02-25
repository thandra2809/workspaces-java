package inheritance;

public class Student extends Person {
    private String collegeName;
    private int year;

    public void setCollegeName(String college) {
        this.collegeName = collegeName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }
}