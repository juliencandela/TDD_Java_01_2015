/**
 * Created by marie-helene on 09/01/15.
 */
public class Dollar extends Money {

    public Dollar(int amount, String currency) {
        super(amount, currency);
    }

    Money times(int multiplier){
        return Money.dollar(this.amount*multiplier);
    }

    String currency(){
        return this.currency;
    }

}
