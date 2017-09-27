import java.util.Date;

public class Main {

    public static void main(String[] args) {

        //Laver dato objektet
        Date date = new Date();

        // Printer dato og tid med en for løkke
        for (long i = 12000; i <= 11e11; i = i * 10) {
            System.out.println("Elapsed time: " + i);
            date.setTime(i);
            System.out.println(date.toString());
            System.out.println();
        }
    }
}
