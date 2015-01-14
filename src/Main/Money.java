/**
 * Created by marie-helene on 11/01/15.
 */
public abstract class Money {

    protected int amount;
    protected String currency;

    Money(int amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && getClass().equals(money.getClass());
    }

    static Dollar dollar(int amount){
        return new Dollar (amount, "USD");
    }

    static Franc franc(int amount){
        return new Franc (amount, "CHF");
    }

    abstract Money times(int multiplier);

    String currency(){
        return this.currency;
    }



}
