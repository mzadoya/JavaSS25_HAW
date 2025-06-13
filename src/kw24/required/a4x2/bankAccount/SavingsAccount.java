package kw24.required.a4x2.bankAccount;

public class SavingsAccount extends BankAccount {

    int zinsatz;

    public SavingsAccount(String iban, long guthaben, int zinsatz) {

        super(iban, guthaben);
        this.zinsatz = zinsatz;

    }

    public int getInterestRate() {
        return zinsatz;
    }

    public void giveInterest() {
        if (this.guthaben > 0) {
            this.guthaben += this.guthaben * zinsatz / 1000;
        } else {
            System.out.printf("Ungültiger Kontostand: Es können keine Zinsen gutgeschrieben werden.%n");
        }
    }

    // toString
    @Override
    public String toString() {
        return "SavingsAccount [zinsatz=" + zinsatz + ", iban=" + iban + ", guthaben=" + guthaben + "]";
    }
}
