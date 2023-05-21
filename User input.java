import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.printf("Hey %s , How are you? \n", name);
        String status = scanner.nextLine();
        System.out.println("What is your age?");
        int age = scanner.nextInt();
        System.out.print("Thankyou for the information");
    }
}