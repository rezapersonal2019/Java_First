package chapterEleven;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

import javafx.scene.shape.Circle;

public class Program11 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        System.out.print("Enter 5 numbers: ");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) list.add(input.nextInt());
        
        System.out.println( "The numbers are befor sorting: ");
        
        for (Integer num : list) { 		      
            System.out.print(num + " "); 		
       }
       
      

        System.out.println();
     //   Collections.sort(list);
      //  Collection<E>.class.sort(list);
        sort(list);
        System.out.println("The numbes are after sorting: ");
        System.out.println(list);

    }

   public static void sort(ArrayList<Integer> list2) {

        // simple solution
        //list.sort(null);

        // manual solution
        for (int i = 0; i < list2.size() - 1; i++) {
            int currentMin = list2.get(i);
            int currentIndex = i;

            for (int j = i + 1; j < list2.size(); j++) {
                if (currentMin > list2.get(j)) {
                    currentMin = list2.get(j);
                    currentIndex = j;
                }
            }

            if (currentIndex != i) {
                list2.set(currentIndex, list2.get(i));
                list2.set(i, currentMin);
            }
        }

    }	 

	

}
