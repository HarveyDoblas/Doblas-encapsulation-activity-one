import java.util.Scanner;

public class DoblasEncapsulationActivityOne {
    private String firstName, middleName, lastName;
    private int age, day, year;
    private String month, address;

    public DoblasEncapsulationActivityOne(String firstName, String lastName, String middleName, int age, int day, String month, int year, String address) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.day = day;
        this.month = month;
        this.year = year;
        this.address = address;
    }

    public void info() throws InterruptedException {
        try {
            Thread.sleep(1000);
            System.out.println("\nFirst Name: " + firstName);
            Thread.sleep(1000);
            System.out.println("Middle Name: " + middleName);
            Thread.sleep(1000);
            System.out.println("Last Name: " + lastName);
            Thread.sleep(1000);
            System.out.println("Age: " + age);
            Thread.sleep(1000);
            System.out.println("Date of Birth: " + month + " " + day + "," + year);
            Thread.sleep(1000);
            System.out.println("Address: " + address);
        } catch (InterruptedException e) {
            System.out.println("Error occurred during thread sleep.");
        }
    }

    public static void main(String[] args) throws InterruptedException{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Middle Name: ");
        String middleName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Date of Birth (month): ");
        String month = scanner.nextLine();

        System.out.print("Enter Date of Birth (day): ");
        int day = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Date of Birth (year): ");
        int year = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Address: ");
        String address = scanner.nextLine();

        DoblasEncapsulationActivityOne testFive = new DoblasEncapsulationActivityOne(firstName, lastName, middleName, age, day, month, year, address);
        testFive.info();

        scanner.close();    
    }
}
