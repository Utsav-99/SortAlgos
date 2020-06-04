package insertion;

import java.util.Scanner;

public class InsertionSort {
	public static void insertionSort (int[] arr) {
		int i, j, key, temp;
		for (i = 1; i < arr.length; i++) {
			key = arr[i];
			j = i - 1;
			while (j >= 0 && key < arr[j]) {
				temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
				j--;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length of the array:");
	      int length = in.nextInt();
	      int [] arr = new int[length];
	      System.out.println("Enter the elements of the array:");

	      for(int i=0; i<length; i++ ) {
	         arr[i] = in.nextInt();
	      }
        System.out.println("Before Selection Sort");  
        for(int i:arr){  
            System.out.print(i+" ");  
        }  
        System.out.println();  
          
        insertionSort(arr);//sorting array using selection sort  
         
        System.out.println("After Selection Sort");  
        for(int i:arr){  
            System.out.print(i+" ");  
        }  
	}

}
