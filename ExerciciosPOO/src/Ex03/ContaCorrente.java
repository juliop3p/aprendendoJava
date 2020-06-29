package Ex03;

public class ContaCorrente {
    private String agencyNumber;
    private String accountNumber;
    private double currentBalance = 0;
    private String operation;
    private double value = 0;

    public ContaCorrente() {
    }

    public ContaCorrente(String agencyNumber, String accountNumber, double currentBalance, String operation, double value) {
        this.agencyNumber = agencyNumber;
        this.accountNumber = accountNumber;
        this.currentBalance = currentBalance;
        this.operation = operation;
        this.value = value;
    }

    public String getAgencyNumber() {
        return agencyNumber;
    }

    public void setAgencyNumber(String agencyNumber) {
        this.agencyNumber = agencyNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void storeValue(double value) {
        if(this.operation == "deposito") {
            this.currentBalance += value;
        }
    }

    public void withdraw(double value) {
        if(this.operation == "saque") {
            this.currentBalance -= value;
        }
    }

    public void printCurrentValue() {
        System.out.println("Saldo atual: R$" + this.currentBalance);
    }
}
