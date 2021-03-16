public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int price = 1_000_000;
        int month = 12;
        double payment = service.calculate(price, month);
        System.out.println(payment);
    }
}
