public class PolicyHolder
{
    // Fields
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double height;
    private double weight;

    // Copy constructor for security
    public PolicyHolder(PolicyHolder holder)
    {
        this.firstName = holder.firstName;
        this.lastName  = holder.lastName;
        this.age       = holder.age;
        this.smokingStatus = holder.smokingStatus;
        this.height    = holder.height;
        this.weight    = holder.weight;
    }

    // Main constructor
    public PolicyHolder(String firstName, String lastName, int age,
                        String smokingStatus, double height, double weight)
    {
        this.firstName = firstName;
        this.lastName  = lastName;
        this.age       = age;
        this.smokingStatus = smokingStatus;
        this.height    = height;
        this.weight    = weight;
    }

    // Example setter inside the class
    public void setPolicyHolder(PolicyHolder holder)
    {
        // This should only exist inside Policy class, but leaving it here for demonstration:
        // If in Policy class, ensure it copies the object!
    }

    // Example BMI method
    public double getBMI()
    {
        return (weight * 703) / (height * height);
    }

    // toString() method
    public String toString()
    {
        return "Policyholder's First Name: " + firstName +
               "\nPolicyholder's Last Name: " + lastName +
               "\nPolicyholder's Age: " + age +
               "\nPolicyholder's Smoking Status (Y/N): " + smokingStatus +
               "\nPolicyholder's Height: " + height + " inches" +
               "\nPolicyholder's Weight: " + weight + " pounds" +
               "\nPolicyholder's BMI: " + String.format("%.2f", getBMI());
    }
}
