class BankAccount {
String accountHolderName; double balance;
static double interestRate; static {
interestRate = 5.0;
System.out.println("Static block executed: Interest rate initialized.");
}
{
System.out.println("Instance block executed: New account is being created.");
}
BankAccount(String name, double balance) { this.accountHolderName = name; this.balance = balance;
System.out.println("Constructor executed: Account created for " + accountHolderName);
}
double calculateInterest() {
return (balance * interestRate) / 100;
}
void displayInterest() {
System.out.println("Interest earned by " + accountHolderName + ": " + calculateInterest());
}
static void updateInterestRate(double newRate) { interestRate = newRate;
System.out.println("Interest rate updated to: " + interestRate + "%");
}
}
public class Mainp18 {
public static void main(String[] args) { System.out.println("240390107014");
BankAccount acc1 = new BankAccount("rahil", 1000); BankAccount acc2 = new BankAccount("ronak", 2000); acc1.displayInterest();
acc2.displayInterest(); BankAccount.updateInterestRate(6.5); acc1.displayInterest(); acc2.displayInterest();
}
}
