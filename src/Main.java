import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите стоимость билета: ");
        int ticketPrice = scanner.nextInt();

        int milesPerRubles = 20;

        int bonusMiles = ticketPrice / milesPerRubles;

        System.out.println("За купленный билет начислено " + bonusMiles + " бонусных миль.");
    }
}