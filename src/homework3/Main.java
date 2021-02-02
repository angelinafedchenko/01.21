package homework3;


public class Main {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setFirstName("Anhelina");
        student1.setRating(30);
        System.out.println(student1.toString());

        Student student2 = new Student();
        student2.setFirstName("Oleksiy");
        student2.setRating(50);
        System.out.println(student2.toString());

        Student student3 = new Student("Roman", 40);
        System.out.println(student3);

        int avarageRating = (student1.getRating() + student2.getRating() + student3.getRating()) / 3;
        System.out.println("Avg rating: " + avarageRating);

        student2.changeRating(90);

        avarageRating = (student1.getRating() + student2.getRating() + student3.getRating()) / 3;
        System.out.println("Avg of New rating: " + avarageRating);

        boolean betterStudent = Student.betterStudent(student1.getRating(), student2.getRating());
        System.out.println(betterStudent);

    }
}
