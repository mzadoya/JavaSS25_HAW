package kw24.required.a4x2.bankAccount;

public class BankAccount {

    String iban;
    long guthaben;

    public BankAccount(String iban) {
        this(iban, 0l);
    }

    public BankAccount(String iban, long guthaben) {

        if (iban == null) {
            assert (false) : "+++FATAL SYSTEM ERROR: IBAN darf nicht null sein +++";
        }
        
        this.iban = iban;
        this.guthaben = guthaben;
   
    }

    public void withdraw(long sumToTake) {
        
        if (sumToTake <= 0 ) {
            System.out.printf("Ungültiger Betrag: Es kann kein negativer oder null Betrag abgebucht werden.%n");
        }
        
        if (this.guthaben > sumToTake && sumToTake > 0) {
            this.guthaben -= sumToTake;
        }
        else {
            System.out.printf("Bankkonto: %s%nUnzureichender Kontostand: Die Aktion kann nicht durchgeführt werden.%n%.2f - %.2f --> %.2f%n",
            iban, (double) this.guthaben / 100, (double) sumToTake / 100, (double) (this.guthaben - sumToTake) / 100);
        }
    }

    public void deposit(long sumToDeposit) {
        if (sumToDeposit > 0) {
            this.guthaben += sumToDeposit;
        } else
            System.out.printf("Ungültiger Betrag: Es kann kein negativer oder null Betrag eingezahlt werden. %n");
    }

    // getter und setter

    public long getAccountBalance() {
        return guthaben;
    }

    public String getAccountId() {
        return iban;
    }

    public void setGuthaben(long guthaben) {
        this.guthaben = guthaben;
    }

    // toString

}
