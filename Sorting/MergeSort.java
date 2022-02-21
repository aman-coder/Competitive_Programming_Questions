// Merge sort

import java.util.*;
public class Main{
    private static void mergesor(int[] arr){
        int arrlength = arr.length;
        if(arrlength<2){
            return;
        }
        int midindex=arrlength/2;
        int[] leftarr = new int[midindex];
        int[] rightarr = new int[arrlength-midindex];
        for(int i = 0; i<midindex; i++){
            leftarr[i]=arr[i];
        }
        for(int j = midindex; j<arrlength; j++){
            rightarr[j-midindex]=arr[j];
        }
        mergesor(leftarr);
        mergesor(rightarr);
        
        merge(arr,leftarr,rightarr);
        
    }
    private static void merge(int[] arr,int[] leftarr, int[] rightarr){
        int i=0,j=0,k=0;
        int len = arr.length;
        int leftlen=leftarr.length;
        int rightlen=rightarr.length;
        while(i<leftlen && j<rightlen){
            if(leftarr[i]<=rightarr[j]){
                arr[k]=leftarr[i];
                i++;
            }else{
                arr[k]=rightarr[j];
                j++;
            }
            k++;
        }
        while(i<leftlen){
            arr[k]=leftarr[i];
            i++;
            k++;
        }
        while(j<rightlen){
            arr[k]=rightarr[j];
            j++;
            k++;
        }
    }
    private static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        mergesor(arr);
        printArray(arr);
    }
}
