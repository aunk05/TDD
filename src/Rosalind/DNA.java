package Rosalind;

import org.junit.Test;
/*
 * ROSALIND 1.
 */
public class DNA {

    public static void main(String[] args){
        try {byte[] input = new byte[1000];
        System.in.read(input);
           String testSequence = new String(input, "UTF-8");
           System.out.println(getCount(testSequence));
        } catch(Exception e){e.printStackTrace();}
    }

    @Test
    public void DNATest(){

        String testString ="TAGCT";
        char[] testArray =  testString.toCharArray();
        String resultString = "1 1 1 2";

        assert (doCount(testArray).equals(resultString));
    }

    private static String getCount(String inputSequence){
        char[] testArray =  inputSequence.toCharArray();
        return doCount(testArray);
    }

    private static String doCount(char[] sequence){

        int a,c,g,t;
        a=c=g=t=0;

        for(char C: sequence){
            switch (C) {
                case 'A': a++; break;
                case 'C': c++; break;
                case 'G': g++; break;
                case 'T': t++; break;
            }
        }
        return a+" "+c+" "+g+" "+t;
    }
}


