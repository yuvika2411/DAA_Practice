package UNIT_1;

import java.util.Scanner;

public class QuickSort {
    public static int recursive_calls=0;
    public static int comparisons=0;

    public static int l_partition(int[] a, int low, int high) {
        int i=low-1;
        int pivot=a[high];
        for(int j=low;j<high;j++) {
            comparisons++;
            if(a[j]<pivot) {
                i++;
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        int temp=a[i+1];
        a[i+1]=a[high];
        a[high]=temp;
        return i+1;
    }

    public static void quickSort(int[] a, int low, int high) {
        if(low<high) {
            recursive_calls++;
            int p=l_partition(a, low, high);
            quickSort(a, low, p-1);
            quickSort(a, p+1, high);
        }
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a= new int[n];
        for(int i=0;i<n;i++) {
            a[i]=sc.nextInt();
        }
        quickSort(a, 0, n-1);
        for(int i=0;i<n;i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println(comparisons);
        System.out.println(recursive_calls);
    }
}
