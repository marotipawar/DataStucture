package com.maroti.shellSort;

public class ShellSort {

    public static void main(String[] args) {


        Integer[] intArray={100,90,80,70,60,50,40,30,20,10};

        for(int gap=intArray.length/2; gap>0; gap/=2)
        {
            for(int i=gap; i<intArray.length; i++)
            {
                int newElement=intArray[i];

                int j=i;

                while(j>=gap && intArray[j-gap]>newElement)
                {
                    intArray[j]=intArray[j-gap];
                    j-=gap;
                }
                intArray[j]=newElement;
            }
        }
        for (Integer i : intArray)
        {
            System.out.println(i);
        }
    }





}
