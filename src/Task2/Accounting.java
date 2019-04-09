package Task2;

import java.math.BigDecimal;

public class Accounting {
    public static BigDecimal pay(double hours, double perHourPayment) {
        BigDecimal calculatedPayment;

        calculatedPayment = BigDecimal.valueOf(hours * perHourPayment);

        return calculatedPayment;
    }
}
