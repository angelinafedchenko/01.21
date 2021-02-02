package homework3;


public class Student {

    private String firstName;
    private int rating;

    public Student() {
        System.out.println("Constructor by default");
    }

    public Student(String firstName, int rating) {
        this.firstName = firstName;
        this.rating = rating;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }


    public int getRating() {
        return this.rating;
    }

    public void changeRating(int rating) {
        this.rating = rating;
    }

    public static boolean betterStudent(int rating1, int rating2) {
        if(rating1 > rating2) {
            System.out.println ("Anhelina is the best student!");
            return true;
        } else if(rating1 < rating2) {
            System.out.println ("Oleksiy is the best student!");
            return false;
        } else {
            System.out.println ("Good work!");
            return false;
        }
    }


    @Override
    public String toString() {
        return "Student: " + "Name - " + firstName + ", rating = " + rating;
    }
}
