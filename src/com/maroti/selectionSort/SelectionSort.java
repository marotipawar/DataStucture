package com.maroti.selectionSort;

import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        Integer[] intArray={41,24,52,68,52,62,1,48,62,3,78,2,-98,4};
        System.out.println("Before Sorting...........");
        new ArrayList<Integer>(Arrays.asList(intArray)).stream().forEach(System.out::println);

        for(int lastIndex=intArray.length-1; lastIndex>0; lastIndex--)
        {
            int largeIndex=0;
            for(int i=1; i<=lastIndex; i++)
            {
                if(intArray[i]>intArray[largeIndex])
                {
                    largeIndex=i;
                }

            }

            swap(intArray, largeIndex, lastIndex);
        }


        System.out.println("After Sorting...........");
        new ArrayList<Integer>(Arrays.asList(intArray)).stream().forEach(System.out::println);
    }

    public static void swap(Integer[] intArray, int i, int j)
    {
        if(i==j)
        {
            return;
        }

        int temp= intArray[i];
        intArray[i]=intArray[j];
        intArray[j]=temp;
    }
}
