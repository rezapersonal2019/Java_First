package chapterEight;

import java.util.Scanner;

public class TwoDarray {

	public static void main(String[] args) {
		
		
		int[][] list ={{1,2,3},{2,4,5},{4,4,5}};  
		
	/*	int [][] list = new int [3][4];
		
		Scanner input = new Scanner(System.in);
		
		System.out.println( " Enter the elements of 2D array");
		
		for(int i = 0; i<list.length; i++)
		{ 
			for(int j = 0; j<list[i].length; j++)
			{
				list [i][j]= input.nextInt();
			}
		} */
		
		for(int i = 0; i <list.length; i++)
		{
			for(int j = 0; j <list[i].length; j++)
			{
				System.out.print(list[i][j] + " ");
			}
		
        System.out.println();
		}
		
		
		
		//creating two matrices  
		int a[][]={{1,3,4},{3,4,5}};  
		int b[][]={{1,3,4},{3,4,5}};  
		  
		//creating another matrix to store the sum of two matrices  
		int c[][]=new int[2][3];  
		  
		//adding and printing addition of 2 matrices  
		for(int i=0;i<2;i++){  
		for(int j=0;j<3;j++){  
		c[i][j]=a[i][j]+b[i][j];  
		System.out.print(c[i][j]+" ");  
		}  
		System.out.println();//new line  
		}  
		  
		
	}

}
