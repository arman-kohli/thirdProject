import java.util.*;

public class PolicyHolderManagement {

    // ------------------ STATIC METHODS ---------------------

    // 1. Maturity calculation using investment amount
    // Formula: FV = investment * (1 + 0.08)^years
    public static double calculateMaturityByInvestment(double investmentAmount, int years) {
        return investmentAmount * Math.pow(1.08, years);
    }

    // 2. Maturity calculation using only years in force
    // Uses a fixed base investment of 50,000
    public static double calculateMaturityByYears(int years) {
        double baseAmount = 50000;
        return baseAmount * Math.pow(1.08, years);
    }

    // 3. Find high value policy holders (investment > 100000)
    public static void findHighValuePolicy(List<PolicyHolder> list) {
        System.out.println("\n--- High Value Policy Holders (Investment > 100000) ---");
        for (PolicyHolder p : list) {
            if (p.getInvestmentAmount() > 100000) {
                System.out.println(p);
            }
        }
    }

    // ------------------ MAIN METHOD -------------------------

    public static void main(String[] args) {

        ArrayList<PolicyHolder> policyList = new ArrayList<>();
        HashMap<String, PolicyHolder> policyMap = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Policy Holder Management =====");
            System.out.println("1. Add Policy Holder");
            System.out.println("2. View All Policy Holders");
            System.out.println("3. Calculate Maturity (Investment + Years)");
            System.out.println("4. Calculate Maturity (By Years Only)");
            System.out.println("5. Find High Value Policies (>100000)");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    sc.nextLine(); // clear buffer
                    System.out.print("Enter PolicyHolder ID: ");
                    String id = sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Investment Amount: ");
                    double investment = sc.nextDouble();

                    System.out.print("Enter Years In Force: ");
                    int years = sc.nextInt();

                    PolicyHolder holder = new PolicyHolder(id, name, investment, years);

                    policyList.add(holder);
                    policyMap.put(id, holder);

                    System.out.println("Policy Holder Added Successfully!");
                    break;

                case 2:
                    System.out.println("\n--- All Policy Holders ---");
                    for (PolicyHolder p : policyList) {
                        System.out.println(p);
                    }
                    break;

                case 3:
                    System.out.print("Enter Investment Amount: ");
                    double inv = sc.nextDouble();

                    System.out.print("Enter Years In Force: ");
                    int y = sc.nextInt();

                    double maturity1 = calculateMaturityByInvestment(inv, y);
                    System.out.println("Maturity Value = " + maturity1);
                    break;

                case 4:
                    System.out.print("Enter Years In Force: ");
                    int y2 = sc.nextInt();

                    double maturity2 = calculateMaturityByYears(y2);
                    System.out.println("Maturity Value = " + maturity2);
                    break;

                case 5:
                    findHighValuePolicy(policyList);
                    break;

                case 6:
                    System.out.println("Exiting Program...");
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
