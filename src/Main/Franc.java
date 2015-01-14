/**
 * Created by marie-helene on 11/01/15.
 */
public class Franc extends Money{

    Franc(int amount, String currency){
        super(amount, currency);
    }

    Money times(int multiplier){
        return Money.franc(amount * multiplier);
    }

    String currency(){
        return currency;
    }
}
