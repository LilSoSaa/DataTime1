import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        LocalDate today= LocalDate.now();
        System.out.println(" There are still " + (31-today.getDayOfMonth() + " days to the end of the month."));
        System.out.println(" There are still " + (365-today.getDayOfMonth() + " days to the end of the year." ));


    }
}