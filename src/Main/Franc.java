/**
 * Created by marie-helene on 11/01/15.
 */
public class Franc extends Money{

    Franc(int amount){
        this.amount=amount;
    }

    Money times(int multiplier){
        return new Franc(amount * multiplier);
    }

}
