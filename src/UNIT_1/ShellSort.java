package UNIT_1;
import java.util.*;

public class ShellSort {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int gap=n/2;gap>0;gap=gap/2){
            for(int i=gap;i<=n-1;i++){
                int temp=arr[i];
                int j=i;

                while(j>=gap && arr[j-gap]>temp){
                    arr[j]=arr[j-gap];
                    j=j-gap;
                }
                arr[j]=temp;
            }
        }

        System.out.print(arr[0]);
        for(int i=1;i<n;i++){
            System.out.print(" "+arr[i]);
        }
    }
}
