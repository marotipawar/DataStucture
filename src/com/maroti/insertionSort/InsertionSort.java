package com.maroti.insertionSort;

public class InsertionSort {

    public static void main(String[] args) {

        Integer[] intArray ={35,45,20,4,36,8,-15,98,41};

        for(int unSortIndex=1; unSortIndex<intArray.length; unSortIndex++)
        {
            int newElement = intArray[unSortIndex];

            int i;

            for(i=unSortIndex; i>0 && intArray[i-1]>newElement; i--)
            {
                intArray[i]=intArray[i-1];
            }

            intArray[i]=newElement;
        }
        System.out.println("After Sorting");

        for(Integer i : intArray)
        {
            System.out.println(i);
        }
    }
}
