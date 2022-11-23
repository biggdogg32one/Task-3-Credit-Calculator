public class CreditPaymentService {


    public double calculate(double finalSettlement) {

        int creditAmount = 1_000_000;
        double interestRate = 1.05;
        double cAiR = creditAmount * interestRate / finalSettlement;

        return cAiR;
    }


}
