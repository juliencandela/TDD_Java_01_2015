/**
 * Created by marie-helene on 11/01/15.
 */
public class Money {

    protected int amount;

    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount;
    }

}
