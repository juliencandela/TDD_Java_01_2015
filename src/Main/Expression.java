/**
 * Created by marie-helene on 17/01/15.
 */
public interface Expression {

    Money reduce(Bank bank, String to);

    Expression plus(Expression addend);
}
