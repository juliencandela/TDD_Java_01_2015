/**
 * Created by marie-helene on 11/01/15.
 */
public class Franc extends Money{

    Franc(int amount, String currency){
        super(amount, currency);
    }


    String currency(){
        return currency;
    }

}
