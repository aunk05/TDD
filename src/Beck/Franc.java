package Beck;

/**
 * Created by aunk05 on 26/11/16.
 */
public class Franc extends Money {

        Franc(int amount) {
        this.amount=amount;
    }

       Money times(int multiplier){

        return new Franc(amount * multiplier);
    }

    }




