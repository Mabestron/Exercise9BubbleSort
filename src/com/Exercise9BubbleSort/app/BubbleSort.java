package com.Exercise9BubbleSort.app;
import java.util.Random;
public class BubbleSort {

	public static void main(String[] args) {
		//const declaration
		 final int ELEMENTS_ARRAY=100;
		 
		//variable declaration
		 int temp=0;
		 
		//arrays
		 int [] disorededArray = new int[ELEMENTS_ARRAY];
		 int [] orderedArray = new int[ELEMENTS_ARRAY];
		 
		 Random randomNumbers = new Random(System.nanoTime());
		 
		 //Create a array with random numbers
		 for (int i=0;i<ELEMENTS_ARRAY;i++)
		 {
			disorededArray[i]= randomNumbers.nextInt(101); 
		 }
		 
		 //Display the disorededArray 
		 for (int i=0;i<ELEMENTS_ARRAY;i++)
		 {
			System.out.print(disorededArray[i]+" "); 
		 }
		 
		 for(int i=0;i<ELEMENTS_ARRAY;i++)
		 {
			 for(int j=0; j<ELEMENTS_ARRAY-1;j++)
			 {
				 if(disorededArray[j]>disorededArray[j+1])
				 {
					 temp=disorededArray[j+1];
					 disorededArray[j+1]=disorededArray[j];
					 disorededArray[j]=temp;
				 }
				 
			 }
		 }
		 
		 System.out.println(" ");
		 
		 for (int i=0;i<ELEMENTS_ARRAY;i++)
		 {
			System.out.print(disorededArray[i]+" "); 
		 }
	}

}
