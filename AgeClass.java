import java.util.Scanner;

public class AgeClass {
    public static void main(String[] args) {

        int age;

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter your age (years): ");
        age = reader.nextInt();
        if (age < 0) {
            System.out.println("Incorrect age");
        }
        else if (age < 18) {
            System.out.println("You are underage");
        }
        else {
            System.out.println("You are adult");
        }

    }
}
