package UNIT_1;
import java.util.*;
public class RadixSort {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        radixsort(arr,n);
        System.out.print(arr[0]);
        for(int i=1;i<n;i++){
            System.out.print(" "+arr[i]);
        }
    }
    static void countsort(int arr[], int n, int place){
        int output[]= new int[n];
        int count[]= new int[10];
        for(int i=0;i<n;i++){
            int digit= (arr[i]/place)%10;
            count[digit]++;
        }

        for(int i=1;i<10;i++){
            count[i]+=count[i-1];
        }

        for(int i=n-1;i>=0;i--){
            int digit=(arr[i]/place)%10;
            output[count[digit]-1]=arr[i];
            count[digit]--;
        }

        for(int i=0;i<n;i++){
            arr[i]=output[i];
        }
    }
    static void radixsort(int arr[], int n){
        int max= arr[0];

        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        for(int place=1;max/place>0;place=place*10){
            countsort(arr,n,place);
        }
    }
}
