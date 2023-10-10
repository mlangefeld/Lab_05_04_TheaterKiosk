import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int age = 0;

        System.out.print("Please enter your age: ");

        if (in.hasNextInt()) {
            age = in.nextInt();
            in.nextLine();
            if (age >= 21)
            {
                System.out.println("Over 21 confirmed, here is your wristband");
            }

        }
    }
}