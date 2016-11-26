package Rosalind;

import org.junit.Test;

import java.util.Arrays;

/*
 * ROSALIND 1.
 */
public class DNA {

    public static void main(String[] args){
        try {byte[] input = new byte[1000];
        System.in.read(input);
           String testSequence = new String(input, "UTF-8");
           String rawOutput = Arrays.toString((getCount(testSequence)));
           String[] counts = rawOutput.substring(1,rawOutput.length()-1).split(",");
           for (String s: counts){
            System.out.print(s+" ");}
        } catch(Exception e){e.printStackTrace();}
    }

    @Test
    public void DNATest(){

        String testString ="TAGCT";
        char[] testArray =  testString.toCharArray();
        int[] resultArray = {1,1,1,2};

        assert Arrays.equals(doCount(testArray), resultArray);
    }

    private static int[] getCount(String inputSequence){
        char[] testArray =  inputSequence.toCharArray();
        return doCount(testArray);
    }

    private static int[] doCount(char[] sequence){

        int countArray[] = new int[4];

        for(char c: sequence){
            switch (c) {
                case 'A': countArray[0]++; break;
                case 'C': countArray[1]++; break;
                case 'G': countArray[2]++; break;
                case 'T': countArray[3]++; break;
            }
        }
        return countArray;
    }
}


