/**
 * Created by marie-helene on 09/01/15.
 */
public class Dollar {

    int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    void times(int multiplier){
        this.amount *= 2;
    }
}