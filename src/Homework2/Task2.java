package Homework2;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class Task2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("What's month now?");

        String currentMonth = br.readLine();

        switch (currentMonth) {
            case "December":
            case "January":
            case "February":
                System.out.println("It is: " + Seasons.WINTER);
                break;
            case "March":
            case "April":
            case "May":
                System.out.println("It is: " + Seasons.SPRING);
                break;
            case "June":
            case "Jule":
            case "August":
                System.out.println("It is: " + Seasons.SUMMER);
                break;
            case "September":
            case "October":
            case "November":
                System.out.println("It is: " + Seasons.AUTUMN);
                break;
            default:
                System.out.println("Try again!");
        }

System.out.println("Enjoy the time!");

    }
}