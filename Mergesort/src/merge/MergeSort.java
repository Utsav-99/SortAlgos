package merge;

import java.util.Scanner;

public class MergeSort {
	void merge(int arr[], int beg, int mid, int end)  
	{  
	  
	int l = mid - beg + 1;  
	int r = end - mid;  
	  
	int LeftArray[] = new int [l];  
	int RightArray[] = new int [r];  
	  
	for (int i=0; i<l; ++i)  
	LeftArray[i] = arr[beg + i];  
	  
	for (int j=0; j<r; ++j)  
	RightArray[j] = arr[mid + 1+ j];  
	  
	  
	int i = 0, j = 0;  
	int k = beg;  
	while (i<l&&j<r)  
	{  
	if (LeftArray[i] <= RightArray[j])  
	{  
	arr[k] = LeftArray[i];  
	i++;  
	}  
	else  
	{  
	arr[k] = RightArray[j];  
	j++;  
	}  
	k++;  
	}  
	while (i<l)  
	{  
	arr[k] = LeftArray[i];  
	i++;  
	k++;  
	}  
	  
	while (j<r)  
	{  
	arr[k] = RightArray[j];  
	j++;  
	k++;  
	}  
	}  
	  
	void sort(int arr[], int beg, int end)  
	{  
	if (beg<end)  
	{  
	int mid = (beg+end)/2;  
	sort(arr, beg, mid);  
	sort(arr , mid+1, end);  
	merge(arr, beg, mid, end);  
	}  
	}  
	public static void main(String args[])  
	{  
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length of the array:");
	      int length = in.nextInt();
	      int [] arr = new int[length];
	      System.out.println("Enter the elements of the array:");

	      for(int i=0; i<length; i++ ) {
	         arr[i] = in.nextInt();
	      }  
	MergeSort ob = new MergeSort();  
	ob.sort(arr, 0, arr.length-1);  
	  
	System.out.println("\nSorted array");  
	for(int i =0; i<arr.length;i++)  
	{  
	    System.out.println(arr[i]+"");  
	}  
	}  

}
