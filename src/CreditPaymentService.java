public class CreditPaymentService {
    public double calculate(int price, int month) {
        double interest_rate = 9.99 / 100 / 12;
        double percent = Math.pow((1 + interest_rate), month);
        double payment = (int) (price * (interest_rate * percent / (percent - 1)));
        return payment;
    }
}