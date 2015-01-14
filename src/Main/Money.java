/**
 * Created by marie-helene on 11/01/15.
 */
public abstract class Money {

    protected int amount;

    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && getClass().equals(money.getClass());
    }

    static Dollar dollar(int amount){
        return new Dollar (amount);
    }

    static Franc franc(int amount){
        return new Franc (amount);
    }

    abstract Money times(int multiplier);



}
