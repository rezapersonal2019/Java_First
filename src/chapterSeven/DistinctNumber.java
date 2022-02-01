package chapterSeven;

import java.util.Scanner;

public class DistinctNumber {

	
	public static void main(String[] args) {
        //declarations 
        Scanner keyboard = new Scanner (System.in);  
        int [] inputList = new int [10]; 
      //  int [] distinctArray = new int [10]; 
       // int num; 
       // int counter = 0; 

        //input 
        System.out.print("Please enter in 10 integers: ");

        for (int i = 0; i < inputList.length; i++)
        {
          //  num = keyboard.nextInt(); 
           // inputList[i] = num; 
        	
        	inputList[i] = keyboard.nextInt();
        }
        
       
        
      findUnique(inputList);
       
      
   /*  selectionSort(inputList) ;
       for ( int x :inputList) {
        	
        	System.out.print(x);
        } */

        //processing
   /*     for (int i = 0; i < inputList.length; i++)
        {
            boolean found = false;
            for (int j = 0; j < i; j++)
            {
               // if (inputList[i] == distinctArray[j])
            	if (inputList[i] == inputList[j])
                {
                    found = true;
                    break;
                }
            }
            if (!found)
            {
               // distinctArray[counter++] = inputList[i];
            	System.out.print(inputList[i] + " ");
            	
            }
            
            selectionSort(inputList);
        }

        //output
       System.out.println("The number of distinct numbers is " + counter);
        System.out.print("The distict numbers are: ");
        for (int x=0; x<counter; x++)
        {
            System.out.print(distinctArray[x] + " ");
        } */
    }
	
	public static void findUnique(int [] a) {
		
		
		  for (int i = 0; i < a.length; i++)
	        {
	            boolean found = false;
	            for (int j = 0; j < i; j++)
	            {
	               // if (inputList[i] == distinctArray[j])
	            	if (a[i] == a[j])
	                {
	                    found = true;
	                    break;
	                }
	            }
	            if (!found)
	            {
	               // distinctArray[counter++] = inputList[i];
	            	
	            	System.out.print(a[i] + " ");
	            	 
	            	
	            }
	        }
		  
		//  System.out.println();
		  
	/*	  selectionSort(a) ;
	       for ( int x :a) {
	        	
	        	System.out.print(x + " ");
	        }  */
	        }


public static void selectionSort(int [] list) {
	
	
	int size = list.length;
    for (int i = 0 ;i< size-1; i++){
        int min = i;

        for (int j = i+1; j<size; j++){
           if (list[j] < list[min]){
           min = j;
           }
        }
        int temp = list[min];
        list[min] = list[i];
        list[i] = temp;
     }

  /*   for (int i = 0 ;i< size; i++){
        System.out.print(" "+list[i]);
     }  */

	
	
} 
}
