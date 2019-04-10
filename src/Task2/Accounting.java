package Task2;

import com.sun.javaws.exceptions.InvalidArgumentException;

import java.math.BigDecimal;

public class Accounting {
    public static BigDecimal pay(double hours, double perHourPayment) {

        BigDecimal calculatedPayment = BigDecimal.valueOf(0);

        try{
        if(!(hours > 0) || !(perHourPayment>0)){
            throw new IllegalArgumentException();

        }}catch (IllegalArgumentException e){
            System.out.println("Hours and PerHourPay must be >0");
            return calculatedPayment;
        }

        calculatedPayment = BigDecimal.valueOf(hours * perHourPayment);

        return calculatedPayment;
    }
}
