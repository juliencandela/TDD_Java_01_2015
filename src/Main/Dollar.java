/**
 * Created by marie-helene on 09/01/15.
 */
public class Dollar extends Money {

    public Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier){
        return new Dollar(this.amount*multiplier);
    }


}
