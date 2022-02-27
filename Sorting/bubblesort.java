import java.util.Scanner;

class Main{
    public static void bubblesort(int[] arr){
        boolean mim = true;
        while(mim){
            mim=false;
            for(int j = 0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    mim=true;
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void printarr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Before Sorting");
        printarr(arr);
        bubblesort(arr);
         System.out.println("After Sorting");
        printarr(arr);
    }
}
