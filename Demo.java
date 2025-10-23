import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * The Demo class reads policy information from a text file,
 * creates Policy objects, displays their details, and shows
 * the total number of smoker and non-smoker policies.
 *
 * Project 2 – Chapters 2–7
 */
public class Demo {

    public static void main(String[] args) {
        ArrayList<Policy> policies = new ArrayList<>();
        int smokerCount = 0;
        int nonSmokerCount = 0;

        try {
            // Step 1: Open the PolicyInformation.txt file
            File file = new File("PolicyInformation.txt");
            Scanner inputFile = new Scanner(file);

            // Step 2: Read policy information until the file ends
            while (inputFile.hasNext()) {
                int policyNumber = inputFile.nextInt();
                inputFile.nextLine(); // consume newline

                String providerName = inputFile.nextLine();
                String firstName = inputFile.nextLine();
                String lastName = inputFile.nextLine();
                int age = inputFile.nextInt();
                inputFile.nextLine();
                String smokingStatus = inputFile.nextLine();
                double height = inputFile.nextDouble();
                double weight = inputFile.nextDouble();

                // Step 3: Create a Policy object
                Policy policy = new Policy(policyNumber, providerName, firstName, lastName,
                                           age, smokingStatus, height, weight);

                // Step 4: Add Policy object to ArrayList
                policies.add(policy);

                // Step 5: Move to next policy if there is more data
                if (inputFile.hasNext()) {
                    inputFile.nextLine();
                }
            }

            inputFile.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: PolicyInformation.txt not found.");
            return;
        }

        // Step 6: Display each policy’s details
        for (Policy policy : policies) {
            System.out.println("\nPolicy Number: " + policy.getPolicyNumber());
            System.out.println("Provider Name: " + policy.getProviderName());
            System.out.println("Policyholder's First Name: " + policy.getFirstName());
            System.out.println("Policyholder's Last Name: " + policy.getLastName());
            System.out.println("Policyholder's Age: " + policy.getAge());
            System.out.println("Policyholder's Smoking Status (smoker/non-smoker): " + policy.getSmokingStatus());
            System.out.println("Policyholder's Height: " + policy.getHeight() + " inches");
            System.out.println("Policyholder's Weight: " + policy.getWeight() + " pounds");
            System.out.printf("Policyholder's BMI: %.2f%n", policy.calculateBMI());
            System.out.printf("Policy Price: $%.2f%n", policy.calculatePolicyPrice());

            // Step 7: Update smoker/non-smoker counters
            if (policy.getSmokingStatus().equalsIgnoreCase("smoker")) {
                smokerCount++;
            } else {
                nonSmokerCount++;
            }
        }

        // Step 8: Display total counts
        System.out.println("\nThe number of policies with a smoker is: " + smokerCount);
        System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);
    }
}
