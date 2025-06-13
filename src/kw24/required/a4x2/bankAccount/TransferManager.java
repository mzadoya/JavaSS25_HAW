package kw24.required.a4x2.bankAccount;

public class TransferManager {

    public void transfer(CurrentAccount from, CurrentAccount to, long sum) {
        
        if (from != to) {
            from.withdraw(sum);
            to.deposit(sum);
        }
        else System.out.printf("Ungültiger Vorgang: Sie können kein Geld auf dasselbe Konto überweisen.%n");
    }
} 