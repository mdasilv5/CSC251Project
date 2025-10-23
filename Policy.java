/**
 * The Policy class represents an insurance policy.
 * It stores policyholder information and provides methods
 * to calculate BMI and policy price based on given criteria.
 *
 * Project 2 – Chapters 2–7
 */
public class Policy {
    // Fields
    private int policyNumber;
    private String providerName;
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double height; // in inches
    private double weight; // in pounds

    /**
     * No-argument constructor that initializes fields with default values.
     */
    public Policy() {
        policyNumber = 0;
        providerName = "";
        firstName = "";
        lastName = "";
        age = 0;
        smokingStatus = "non-smoker";
        height = 0.0;
        weight = 0.0;
    }

    /**
     * Constructor with arguments to initialize all fields.
     *
     * @param policyNumber the policy number
     * @param providerName the name of the insurance provider
     * @param firstName the policyholder's first name
     * @param lastName the policyholder's last name
     * @param age the policyholder's age
     * @param smokingStatus the policyholder's smoking status ("smoker" or "non-smoker")
     * @param height the policyholder's height in inches
     * @param weight the policyholder's weight in pounds
     */
    public Policy(int policyNumber, String providerName, String firstName, String lastName,
                  int age, String smokingStatus, double height, double weight) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokingStatus = smokingStatus;
        this.height = height;
        this.weight = weight;
    }

    /** @return the policy number */
    public int getPolicyNumber() { return policyNumber; }

    /** @return the provider name */
    public String getProviderName() { return providerName; }

    /** @return the policyholder's first name */
    public String getFirstName() { return firstName; }

    /** @return the policyholder's last name */
    public String getLastName() { return lastName; }

    /** @return the policyholder's age */
    public int getAge() { return age; }

    /** @return the policyholder's smoking status */
    public String getSmokingStatus() { return smokingStatus; }

    /** @return the policyholder's height in inches */
    public double getHeight() { return height; }

    /** @return the policyholder's weight in pounds */
    public double getWeight() { return weight; }

    /** @param policyNumber the policy number to set */
    public void setPolicyNumber(int policyNumber) { this.policyNumber = policyNumber; }

    /** @param providerName the provider name to set */
    public void setProviderName(String providerName) { this.providerName = providerName; }

    /** @param firstName the policyholder's first name to set */
    public void setFirstName(String firstName) { this.firstName = firstName; }

    /** @param lastName the policyholder's last name to set */
    public void setLastName(String lastName) { this.lastName = lastName; }

    /** @param age the policyholder's age to set */
    public void setAge(int age) { this.age = age; }

    /** @param smokingStatus the policyholder's smoking status to set */
    public void setSmokingStatus(String smokingStatus) { this.smokingStatus = smokingStatus; }

    /** @param height the policyholder's height in inches to set */
    public void setHeight(double height) { this.height = height; }

    /** @param weight the policyholder's weight in pounds to set */
    public void setWeight(double weight) { this.weight = weight; }

    /**
     * Calculates and returns the policyholder's Body Mass Index (BMI).
     *
     * @return the calculated BMI, or 0 if height is invalid
     */
    public double calculateBMI() {
        if (height <= 0) return 0;
        return (weight * 703) / (height * height);
    }

    /**
     * Calculates and returns the policy price.
     * The price is based on age, smoking status, and BMI.
     *
     * @return the calculated policy price
     */
    public double calculatePolicyPrice() {
        double price = 600; // base fee

        if (age > 50) {
            price += 75;
        }
        if (smokingStatus.equalsIgnoreCase("smoker")) {
            price += 100;
        }
        double bmi = calculateBMI();
        if (bmi > 35) {
            price += (bmi - 35) * 20;
        }
        return price;
    }
}
