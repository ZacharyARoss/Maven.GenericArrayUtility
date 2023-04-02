package com.zipcodewilmington.arrayutility;

import java.util.Arrays;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<T> {
    T[] inputArray;

    public ArrayUtility(T[] inputArray){
        this.inputArray = inputArray;
    }
    public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {
        int count = 0;
        for(T t : arrayToMerge){
            if(t.equals(valueToEvaluate)){
                count++;
            }
        }
        for(T t : inputArray){
            if(t.equals(valueToEvaluate)){
                count++;
            }
        }
    return count;
    }

    public T getMostCommonFromMerge(T[] arrayToMerge) {

        return null;
    }

    public Integer getNumberOfOccurrences(T valueToEvaluate) {
        int count = 0;
        for (T t : inputArray){
            if(t.equals(valueToEvaluate)){
                count++;
            }
        }
        return count;
    }

    public T[] removeValue(T valueToRemove) {
        T[] newArray = Arrays.copyOf(inputArray, inputArray.length-getNumberOfOccurrences(valueToRemove));
        int i = 0;
        for (T t : inputArray){
            if (t != valueToRemove){
                newArray[i] = t;
                i++;
            }
        }
        return newArray;
    }
}
