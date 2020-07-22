package com.maroti.bubbleSort;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        Integer[] intArray={98,15,5,24,6,59,1,-9,78,52,-64,9};
        System.out.println("Before Sorting array");
        new ArrayList<Integer>(Arrays.asList(intArray)).stream().forEach(System.out::println);

        for (int lasIndex= intArray.length; lasIndex>0; lasIndex--)
        {
            for(int i=0; i<lasIndex-1; i++)
            {
                if(intArray[i]>intArray[i+1])
                {
                    swap(intArray, i, i+1);
                }
            }
        }

        System.out.println("after Sorting array");
        new ArrayList<Integer>(Arrays.asList(intArray)).stream().forEach(System.out::println);
    }


    public static void swap(Integer[] array, int i, int j)
    {
        if(i==j)
        {
            return;
        }
        Integer temp= array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}
