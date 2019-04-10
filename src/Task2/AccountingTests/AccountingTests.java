package Task2.AccountingTests;

import Task2.Accounting;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class AccountingTests {

    @Test
    public void pay_negativeArgs_resultIsZero(){
        ;
        Assert.assertTrue(Accounting.pay(1,0) == BigDecimal.valueOf(0));
    }

}
