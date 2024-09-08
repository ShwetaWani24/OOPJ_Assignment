import java.util.Scanner;

public class LeapYearSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
     boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

     
        switch (isLeap ? 1 : 0) {
            case 1:
                System.out.println(year + " is a leap year.");
                break;
            case 0:
                System.out.println(year + " is not a leap year.");
                break;
            default:
                System.out.println("Invalid input.");
        }

        sc.close();
    }
}
