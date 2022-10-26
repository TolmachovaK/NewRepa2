import java.util.Scanner;

public class VarDivision {
    public static void main(String[] args) {

         double a;
         double b;

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter 'a' variable: ");
        a = reader.nextDouble();

        System.out.print("Enter 'b' variable: ");
        b = reader.nextDouble();

         if (b == 0) {
            System.out.println("You can not divide on zero");
        }

        else if (a % b == 0) {
            System.out.println("Divided. The result is: " + (a/b));
        }

        else {
            System.out.println("Remainder of division is: " + (a%b));
        }

    }
}
