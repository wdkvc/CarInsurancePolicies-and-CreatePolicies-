// Chapter 4 exercise (pages 191-192)

public class CreatePolicies 
{
    public static void main(String[] args)
    {
        // Variables and constants
        CarInsurancePolicy first = new CarInsurancePolicy(123);
        CarInsurancePolicy second = new CarInsurancePolicy(456, 4);
        CarInsurancePolicy third = new CarInsurancePolicy(789, 12, "Newcastle");

        // Output phase
        first.display();
        second.display();
        third.display();
    }
}