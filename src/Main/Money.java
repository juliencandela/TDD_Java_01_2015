/**
 * Created by marie-helene on 11/01/15.
 */
public class Money {

    protected int amount;
    protected String currency;

    Money(int amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && currency().equals(money.currency());
    }

    static Dollar dollar(int amount){
        return new Dollar (amount, "USD");
    }

    static Franc franc(int amount){
        return new Franc (amount, "CHF");
    }

    public Money times(int multiplier){
        return new Money (amount * multiplier, currency);
    }

    String currency(){
        return this.currency;
    }

    @Override
    public String toString(){
        return amount + " " + currency;
    }



}
