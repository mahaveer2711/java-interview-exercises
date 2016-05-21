package com.mahaaveer.datastructures;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an array of integers where all but one integer occurs twice,
 * find the odd man out.
 *
 * @author mahaaveer.
 */
public class OddManOut {

    public int findOddMan(int[] integersWithAllButOneDupes){
        Set<Integer> setOfIntegers = new HashSet<>();
        long sumOfDupes = 0;
        for(int i : integersWithAllButOneDupes){
            if(setOfIntegers.contains(i)){
                sumOfDupes += i;
            }else{
                setOfIntegers.add(i);
            }
        }
        long sumOfDistincts = 0;
        for(int i : setOfIntegers){
            sumOfDistincts += i;
        }
        return (int) (sumOfDistincts - sumOfDupes);
    }


    public int findOddManUsingXOR(int[] integersWithAllButOneDupes){

        int result = integersWithAllButOneDupes[0];
        for(int i = 1; i < integersWithAllButOneDupes.length; i++){
            result ^= integersWithAllButOneDupes[i];
        }
        return result;
    }


}
