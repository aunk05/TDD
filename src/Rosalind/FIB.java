package Rosalind;

import org.junit.Test;

import java.util.ArrayList;

/*
 * ROSALIND 4.
 */
public class FIB {

    public static void main(String[] args) {

        int n = 30;
        int k = 2;

        System.out.println(new Predictor(k, n).getPopulation());

    }

    @Test
    public void Fibo() {
        ArrayList<Integer> f = new ArrayList<>();
        int n = 5, k = 3;
        f.add(0);
        f.add(1);
        for (int i = 2; i < 40; i++) {
            f.add(f.get(i - 2) * (k) + f.get(i - 1)); //Recurrence relation
        }
        assert (f.get(n) == 19);
    }
}

   class Predictor {

       private int litterSize, monthNumber;

        Predictor(int litterSize, int monthNumber){

            this.litterSize = litterSize;
            this.monthNumber = monthNumber;

        }

       long getPopulation() {
            ArrayList<Long> f = new ArrayList<>();
            f.add(0L);
            f.add(1L);
            for (int i = 2; i < 40; i++) {
                f.add(f.get(i - 2) * (litterSize) + f.get(i - 1)); //Recurrence relation
            }

            return f.get(monthNumber);
        }
}
