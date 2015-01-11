/**
 * Created by marie-helene on 11/01/15.
 */
public class Franc extends Money{

    Franc(int amount){
        this.amount=amount;
    }

    Franc times(int multiplier){
        return new Franc(amount * multiplier);
    }

}
