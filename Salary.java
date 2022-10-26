import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {

        double salary;
        double adjustedSalary = 0;
        int experienceYears;

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter employee's salary: ");
        salary = reader.nextDouble();

        System.out.print("Enter years of an employee's work experience: ");
        experienceYears = reader.nextInt();


            if (experienceYears < 0 || salary <0) {
                System.out.println("You entered incorrect employee's work experience or salary");
                return;
            }else if (experienceYears < 1) {
                adjustedSalary = salary;
            } else if (experienceYears < 3) {
                adjustedSalary = salary * 1.1;
            } else {
                adjustedSalary = salary * 1.2;
            }
        if (adjustedSalary < 4000){
            adjustedSalary += 1000.0;
        }
        else {
            adjustedSalary += 500.0;
        }
        System.out.println("Employee's salary is: " + adjustedSalary);
    }

    }

