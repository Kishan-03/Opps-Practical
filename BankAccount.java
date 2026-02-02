import java.util.Scanner;

class BankAccount {

    String accountId;
    String accountHolderName;
    double balance;

    void assignValues(String id, String name, double bal) {
        accountId = id;
        accountHolderName = name;
        balance = bal;
    }

    void displayValues() {
        System.out.println("Account ID: " + accountId);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    static void searchAccount(BankAccount[] accounts, String searchId) {
        boolean found = false;

        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].accountId.equals(searchId)) {
                System.out.println("\nAccount Found:");
                accounts[i].displayValues();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nAccount not found.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount[] accounts = new BankAccount[5];

        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new BankAccount();

            System.out.println("\nEnter details for Account " + (i + 1));
            System.out.print("Enter Account ID: ");
            String id = sc.nextLine();

            System.out.print("Enter Account Holder Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Balance: ");
            double bal = sc.nextDouble();
            sc.nextLine();

            accounts[i].assignValues(id, name, bal);
        }

        System.out.println("\nAll Bank Accounts:");
        for (int i = 0; i < accounts.length; i++) {
            System.out.println("\nAccount " + (i + 1));
            accounts[i].displayValues();
        }

        System.out.print("\nEnter Account ID to search: ");
        String searchId = sc.nextLine();

        searchAccount(accounts, searchId);
    }
}
