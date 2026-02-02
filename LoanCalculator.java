class LoanCalculator {

    double calculateEMI(int principal, int time, float rate) {
        double r = rate / (12 * 100);
        int n = time * 12;

        return (principal * r * Math.pow(1 + r, n)) /
               (Math.pow(1 + r, n) - 1);
    }

    double calculateEMI(double principal, int time, double rate) {
        double r = rate / (12 * 100);
        int n = time * 12;

        return (principal * r * Math.pow(1 + r, n)) /
               (Math.pow(1 + r, n) - 1);
    }

    double calculateEMI(int principal, int time) {
        float fixedRate = 10;
        double r = fixedRate / (12 * 100);
        int n = time * 12;

        return (principal * r * Math.pow(1 + r, n)) /
               (Math.pow(1 + r, n) - 1);
    }

    public static void main(String[] args) {

        LoanCalculator loan = new LoanCalculator();

        int homePrincipal = 2000000;
        int homeTime = 20;
        float homeRate = 8.5f;

        double homeEMI = loan.calculateEMI(homePrincipal, homeTime, homeRate);

        double vehiclePrincipal = 500000;
        int vehicleTime = 5;
        double vehicleRate = 9.0;

        double vehicleEMI = loan.calculateEMI(vehiclePrincipal, vehicleTime, vehicleRate);

        int personalPrincipal = 100000;
        int personalTime = 2;

        double personalEMI = loan.calculateEMI(personalPrincipal, personalTime);

        System.out.println("Home Loan EMI: " + homeEMI);
        System.out.println("Vehicle Loan EMI: " + vehicleEMI);
        System.out.println("Personal Loan EMI (10% fixed rate): " + personalEMI);
    }
}
