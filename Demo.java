import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Collect user input
        System.out.print("Please enter the Policy Number: ");
        int policyNumber = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("\nPlease enter the Provider Name: ");
        String providerName = sc.nextLine();

        System.out.print("\nPlease enter the Policyholder’s First Name: ");
        String firstName = sc.nextLine();

        System.out.print("\nPlease enter the Policyholder’s Last Name: ");
        String lastName = sc.nextLine();

        System.out.print("\nPlease enter the Policyholder’s Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("\nPlease enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
        String smokingStatus = sc.nextLine();

        System.out.print("\nPlease enter the Policyholder’s Height (in inches): ");
        double height = sc.nextDouble();

        System.out.print("\nPlease enter the Policyholder’s Weight (in pounds): ");
        double weight = sc.nextDouble();

        // Create Policy object
        Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);

        // Display results
        System.out.println("\nPolicy Number: " + policy.getPolicyNumber());
        System.out.println("Provider Name: " + policy.getProviderName());
        System.out.println("Policyholder’s First Name: " + policy.getFirstName());
        System.out.println("Policyholder’s Last Name: " + policy.getLastName());
        System.out.println("Policyholder’s Age: " + policy.getAge());
        System.out.println("Policyholder’s Smoking Status: " + policy.getSmokingStatus());
        System.out.println("Policyholder’s Height: " + policy.getHeight() + " inches");
        System.out.println("Policyholder’s Weight: " + policy.getWeight() + " pounds");
        System.out.printf("Policyholder’s BMI: %.2f%n", policy.calculateBMI());
        System.out.printf("Policy Price: $%.2f%n", policy.calculatePolicyPrice());

        sc.close();
    }
}
