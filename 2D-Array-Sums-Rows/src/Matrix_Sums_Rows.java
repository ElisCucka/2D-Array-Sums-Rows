/*****************************************
* New York Institute of Technology                      
* Purpose: Printing the sum of each row   
* Version 0.1
*****************************************/

import java.util.*;

public class Matrix_Sums_Rows
{
	/***************************************************************
	* arraySum - returns the sum of the array
	* Inputs: arr2D - array of the elements
	* Outputs: sum - sum of the elements of the array
	***************************************************************/
	public static int[] rowSums(int[][] arr2D)
	{
		int[] sums = new int[arr2D.length];

		for(int i = 0; i < arr2D.length; i++)	
		{
			int total = 0; 
			for(int j = 0; j < arr2D[0].length; j++)
			{
				total += arr2D[i][j];
			}
			sums[i] = total;
		}
		return sums;
	}
	
	/***************************************************************
	* main - creating a 2D matrix, printing it and printing the 
	* array of sums of rows.
	* Input: args - String array
	* Output: void - none
	***************************************************************/
	public static void main(String[] args)
	{	
		int[][] setArray = new int [4][5];

		setArray[0][0] = 1;
		setArray[0][1] = 3;
		setArray[0][2] = 2;
		setArray[0][3] = 7;
		setArray[0][4] = 3;
		setArray[1][0] = 10;
		setArray[1][1] = 10;
		setArray[1][2] = 4;
		setArray[1][3] = 6;
		setArray[1][4] = 2;
		setArray[2][0] = 5;
		setArray[2][1] = 3;
		setArray[2][2] = 5;
		setArray[2][3] = 9;
		setArray[2][4] = 6;
		setArray[3][0] = 7;
		setArray[3][1] = 6;
		setArray[3][2] = 4;
		setArray[3][3] = 2;
		setArray[3][4] = 1;

		System.out.print("The 2D array: ");
		System.out.println();
		for (int row = 0; row < setArray.length; row++) 
		{
			  for (int column = 0; column < setArray[row].length; column++) 
			  {
			      System.out.print(setArray[row][column] + " ");
			  }
			  System.out.println();
		}
		
		System.out.println("Sums of rows: " + Arrays.toString(rowSums(setArray)) + " ");
	}
}