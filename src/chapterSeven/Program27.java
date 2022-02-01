package chapterSeven;

import java.util.Scanner;

public class Program27 {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		 System.out.print("Enter the list1: ");
		  int[] list1 = new int[input.nextInt()];

		 
		  for (int i = 0; i < list1.length; i++) {
		   list1[i] = input.nextInt();
		  }
		  System.out.print("Enter the list2: "); 
		  int[] list2 = new int[input.nextInt()];
		  
		
		  for (int i = 0; i < list2.length; i++) {
		   list2[i] = input.nextInt();
		  }
		   
		  if(equals(list1, list2)) {
		   System.out.println("Two lists are identical");
		  }else {
		   System.out.println("Two lists are not identical");
		  }
		 
		 }
		  
		 public static boolean equals(int[] list1, int[] list2) {
		  
		  
		  if(list1.length != list2.length)
			  return false;
		  selectionSort(list1);
		  selectionSort(list2);
		   
		 
		  for (int i = 0; i < list2.length; i++) {
		   if (list1[i] != list2[i])
		    return false;
		  }
		 
		  return true;
		   
		   
		 }
		 
		  
		 public static void selectionSort(int[] list) {
		  for (int i = 0; i < list.length - 1; i++) {
		   // Find the minimum in the list[i..list.length-1]
		   int currentMin = list[i];
		   int currentMinIndex = i;
		 
		   for (int j = i + 1; j < list.length; j++) {
		    if (currentMin > list[j]) {
		     currentMin = list[j];
		     currentMinIndex = j;
		    }
		   }
		 
		   // Swap list[i] with list[currentMinIndex] if necessary
		   if (currentMinIndex != i) {
		    list[currentMinIndex] = list[i];
		    list[i] = currentMin;
		   }
		  }
		 }

}
