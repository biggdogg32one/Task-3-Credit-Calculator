public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        int creditTerm1 = 12;
        int creditTerm2 = 24;
        int creditTerm3 = 36;

        System.out.println();
        double monthlyPayment1 = service.calculate (creditTerm1);
        System.out.println("Ежемесячный платеж: " + monthlyPayment1);

        System.out.println();
        double monthlyPayment2 = service.calculate (creditTerm2);
        System.out.println("Ежемесячный платеж: " + monthlyPayment2);

        System.out.println();
        double monthlyPayment3 = service.calculate (creditTerm3);
        System.out.println("Ежемесячный платеж: " + monthlyPayment3);
    }
}