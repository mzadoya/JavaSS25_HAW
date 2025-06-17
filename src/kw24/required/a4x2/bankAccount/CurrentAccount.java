package kw24.required.a4x2.bankAccount;

public class CurrentAccount extends BankAccount {

    private int transferFee;

    public CurrentAccount(String iban, int transferFee) {

        super(iban, 0l);
        this.transferFee = transferFee;
    }

    public CurrentAccount(String iban, long guthaben, int transferFee) {

        super(iban, guthaben);
        this.transferFee = transferFee;

    }

    @Override
    public void withdraw(long sumToTake) {

        if (this.getAccountBalance() >= sumToTake + transferFee) {
            this.guthaben -= sumToTake + transferFee;
        } else {
            System.out.printf(
                    "Bankkonto: %s%nUnzureichender Kontostand: Die Aktion kann nicht durchgeführt werden.%n%.2f - %.2f --> %.2f%n",
                    iban, (double) this.guthaben / 100, (double) sumToTake / 100,
                    (double) (this.guthaben - sumToTake) / 100);
        }
    }

    // toString

    @Override
    public String toString() {
        return "CurrentAccount [transferFee=" + transferFee + ", iban=" + iban + ", guthaben=" + guthaben + "]";
    }

    public int getFee() {
        return transferFee;
    }

    public void setTransferFee(int transferFee) {
        this.transferFee = transferFee;
    }
}