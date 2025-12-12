public class PolicyHolder {

    private String policyHolderId;
    private String policyHolderName;
    private double investmentAmount;
    private int yearsInForce;

    // Constructor
    public PolicyHolder(String policyHolderId, String policyHolderName, double investmentAmount, int yearsInForce) {
        this.policyHolderId = policyHolderId;
        this.policyHolderName = policyHolderName;
        this.investmentAmount = investmentAmount;
        this.yearsInForce = yearsInForce;
    }

    // Getters & Setters
    public String getPolicyHolderId() {
        return policyHolderId;
    }

    public void setPolicyHolderId(String policyHolderId) {
        this.policyHolderId = policyHolderId;
    }

    public String getPolicyHolderName() {
        return policyHolderName;
    }

    public void setPolicyHolderName(String policyHolderName) {
        this.policyHolderName = policyHolderName;
    }

    public double getInvestmentAmount() {
        return investmentAmount;
    }

    public void setInvestmentAmount(double investmentAmount) {
        this.investmentAmount = investmentAmount;
    }

    public int getYearsInForce() {
        return yearsInForce;
    }

    public void setYearsInForce(int yearsInForce) {
        this.yearsInForce = yearsInForce;
    }

    @Override
    public String toString() {
        return "PolicyHolder { " +
                "ID = '" + policyHolderId + '\'' +
                ", Name = '" + policyHolderName + '\'' +
                ", Investment = " + investmentAmount +
                ", Years In Force = " + yearsInForce +
                " }";
    }
}
