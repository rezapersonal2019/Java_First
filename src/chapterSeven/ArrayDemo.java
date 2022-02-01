package chapterSeven;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		
		
		int size;

	      // Create a Scanner object for keyboard input.
	      Scanner console = new Scanner(System.in);

	      System.out.print("Enter the size of the array: ");
	      size = console.nextInt();

	      // Create an array to hold integers.
	      int[] list = new int[size];

	      System.out.println("Enter " + list.length + " integers.");

	      // Get integers.
	      for (int i = 0; i < list.length; i++)
	      {
	         list[i] = console.nextInt();
	      }
	      
	      // prints the elements of array
           printArray(list); 
           
           System.out.println();
          
           selectionSort(list);
           
           System.out.println(" After the sorting an array");
           // After Sort
           printArray(list);
           System.out.println();
           // Return array from a method
           int[] list3 = reverse(list);
           for(int ele: list3)
           {
           System.out.print(ele + " ");
           }
           System.out.println();
           
           int searchValue;
           System.out.print("Enter the search value of the array: ");
 	      searchValue = console.nextInt();
 	      System.out.println(searchValue + " is found at index: " + linearSearch(list, searchValue));
 	      
 	     System.out.println(searchValue + " is found at index: " + binarySearch(list, searchValue));
	      
 	   /*  int[] a1= {10,20,30,50,70,90};    
         int key = 50;    
         System.out.println(key+" is found at index: "+linearSearch(a1, key));   */ 
       
 	      
	      int sum = 0;    // To hold total

	      // Calculate the sum of elements.
	   /*   for (int i = 0; i < list.length; i++)
	      {
	         sum += list[i];
	      } */
	      
	      // For each Loop
	     for (int elements : list)
	      { sum += elements;
	      
	      }

	      // Display the sum of array elements.
	      System.out.println("The sum of array :" + sum);
	      
	      double average = sum / list.length;
	      
	   // Display the average of array elements.
	      System.out.println("The average of array :" + average);
	      
	      int max = 0;    // hold index number of largest number

	      // Finding largest value.
	      for (int i = 0; i < list.length; i++)
	      {
	         if (list[i] > list[max])
	         {
	            max = i;
	         }
	      }

	      // Show largest value of array
	      System.out.println("Largest value is " + list[max]);

	      
	      int min = 0;    // hold index number of minimum number

	      // Finding smallest value.
	      for (int i = 0; i < list.length; i++)
	      {
	         if (list[i] < list[min])
	         {
	            min = i;
	         }
	      }

	      // Show minimum value of array
	      System.out.println("minimum value is " + list[min]); 
	      
	      
	      
	      
	   
	      
	      // Copy of the array
	      
	      double[] list1 = {3.9, 6.7, 13.3};          
	      double[] list2 = new double [list1.length];
	      
	    
	      for (int i = 0; i < list1.length; i++)
	      { 
	         list2[i] = list1[i];
	      }
	      
	      System.out.println(" Before copy of array of the elements");
          for(double orginal: list1)
          {
        	 
         System.out.println( orginal + " ");
          }

         
          System.out.println(" After copy of array of the elements");
          
         
          for(double copy: list2)
          {
        	 
         System.out.println( copy + " ");
         
         
          }
          
          
       
	}
	
	 //  Passing Arrays to Methods
    public static void printArray(int[] array) 
    { 
    	for (int i = 0; i < array.length; i++)
     {
    		System.out.print(array[i] + " "); 
    		} 
    	}

   // Returning an Array from a Method
    public static int[] reverse(int[] list4) 
    {
     int[] result = new int[list4.length];
    for (int i = 0, j = result.length - 1; i < list4.length; i++, j--) 
    { 
    result[j] = list4[i]; }
    return result;
    }

    /** The method for finding a key in the list with linear search */ 
    public static int linearSearch(int[] linear, int key) 
    { 
    for (int i = 0; i < linear.length; i++) 
    {  if (key == linear[i]) 
    return i; }
    return -1; 
    }

    // Sort an array 
    public static void selectionSort(int arr[])
    {
        int len = arr.length;
 
        for (int i = 0; i < len-1; i++)
        {
            // Finding the minimum element in the unsorted part of array
            int min = i;
            for (int j = i+1; j < len; j++)
                if (arr[j] < arr[min])
                    min = j;
 
            /* Swapping the found minimum element with the first
             * element of the sorted subarray using temp variable
             */
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
   
   
    /** Use binary search to find the key in the list */ 
    public static int binarySearch(int[] list, int key) 
    { 
    int low = 0; 
    int high = list.length - 1;
    while (high >= low)
     { 
    int mid = (low + high) / 2;
     if (key < list[mid]) 
    high = mid - 1; 
    else if (key == list[mid])
     return mid; 
    else low = mid + 1; }
    return -1 - low;
    }


    
    
}
