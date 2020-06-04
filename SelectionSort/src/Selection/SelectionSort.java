package Selection;
import java.util.Scanner;
public class SelectionSort {
	public static int[] selectionSort(int []arr) {
		int i , j , minValue , minIndex,temp=0;
		for(i=0;i<arr.length;i++) {
			minValue=arr[i];
			minIndex=i;
			for(j=i;j<arr.length;j++) {
				if(arr[j]<minValue) {
					minValue=arr[j];
					minIndex=j;
				}
			}
			if(minValue<arr[i]) {
				temp=arr[i];
				arr[i]=arr[minIndex];
				arr[minIndex]=temp;
			}
		}
		return arr;
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
          
        selectionSort(arr);//sorting array using selection sort  
         
        System.out.println("After Selection Sort");  
        for(int i:arr){  
            System.out.print(i+" ");  
        }  
    }  


	}


