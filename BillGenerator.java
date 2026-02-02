import java.util.Scanner;

class BillGenerator {

    double generateBill(int itemTotal) {
        return itemTotal;
    }

    double generateBill(int itemTotal, int discount) {
        return itemTotal - discount;
    }

    double generateBill(int itemTotal, double discountPercent) {
        return itemTotal - (itemTotal * discountPercent / 100);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BillGenerator bill = new BillGenerator();

        System.out.println("Select Customer Type:");
        System.out.println("1. Regular Customer");
        System.out.println("2. Privileged Customer (Flat Discount)");
        System.out.println("3. Festive Offer (Percentage Discount)");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter Total Item Amount: ");
        int total = sc.nextInt();

        double finalAmount = 0;

        switch (choice) {
            case 1:
                finalAmount = bill.generateBill(total);
                break;

            case 2:
                System.out.print("Enter Flat Discount Amount: ");
                int flatDiscount = sc.nextInt();
                finalAmount = bill.generateBill(total, flatDiscount);
                break;

            case 3:
                System.out.print("Enter Discount Percentage: ");
                double percent = sc.nextDouble();
                finalAmount = bill.generateBill(total, percent);
                break;

            default:
                System.out.println("Invalid Choice");
                return;
        }

        System.out.println("\nFinal Bill Amount: " + finalAmount);
    }
}
