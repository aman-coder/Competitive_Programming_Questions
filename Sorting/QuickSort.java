import java.util.Scanner;
import java.util.Random;

public class Main
{
    public static void quicksort(int[] arr,int lowindex,int highindex){
        // base case for the recursion as single element of the array is already sorted
        if(lowindex >= highindex){
            return;
        }
        // BY This we are getting random index of the array to be our pivot element
        int pivotindex = new Random().nextInt(highindex - lowindex) + lowindex;
        int pivot = arr[pivotindex];
        // now we swap the random index to be our last index of array
        swapEl(arr,pivotindex,highindex);
        
        // now we are doing the next step of the algorithm to make the elements which are low than pivot to left
        // and high elements to the right of the pivot
        int leftpointer = lowindex;
        int rightpointer = highindex;
        while(leftpointer<rightpointer){
            // HERE we are checking the elements which are less then pivot to make them in left side
            while(arr[leftpointer]<=pivot && leftpointer<rightpointer ){
                leftpointer++;
            }
            // HERE we are checking the elements which are greater then pivot to make them in right side
            while(arr[rightpointer]>=pivot && leftpointer<rightpointer ){
                rightpointer--;
            }
        
         // here we are swapping number that are actually found i.e; leftpointer points to big number and 
            // rightpointer pointing to lower number than pivot
            swapEl(arr,leftpointer,rightpointer);
        }
        // and here we swapping the pivot to the lastindex of array leftpointer pointer to make it in right place
        // as at point of time both rightpointer and leftpointer will be pointing at the same element
        swapEl(arr,leftpointer,highindex);
        // Calling recursion for the left array
        quicksort(arr,lowindex,leftpointer -1);
        // Calling recursion for the right array
        quicksort(arr,leftpointer +1,highindex);
        
    }
    public static void swapEl(int[] arr ,int lowindex,int highindex){
        int temp = arr[lowindex];
        arr[lowindex] = arr[highindex];
        arr[highindex] = temp;
    }
    
    public static void printarr(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements of Array");
		for(int i=0; i<n; i++){
		    arr[i]=sc.nextInt();
		}
        // printing the value of array before Sorting
        System.out.println("array before Sorting");
        printarr(arr);
        // Calling the quicksort method
        quicksort(arr,0,n-1);
        // Printing the values of array after Sorting
        System.out.println("array after Sorting");
        printarr(arr);
	}
}
