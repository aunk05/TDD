package Beck;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/*
 * Needed for Part I of Kent Beck's 'Test Driven Development'
 */
abstract class Money {

    int amount;

    abstract Money times(int multiplier);

    @Override
    public boolean equals(Object object){
        Money money = (Money) object;
        return (amount==money.amount && getClass().equals(money.getClass()));
    }

    static Money dollar(int amount){
        return new Dollar(amount);
    }

    static Money franc(int amount){
        return new Franc(amount);
    }

}


