package Beck;

/**
* Created by aunk05 on 26/11/16.
*/
class Dollar extends Money{


    Dollar(int amount) {
        this.amount=amount;
    }

    Money times(int multiplier){

        return new Dollar(amount * multiplier);
    }

}
