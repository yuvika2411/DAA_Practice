package UNIT_1;
import java.util.*;

public class BucketSort {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        float arr[]= new float[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextFloat();
        }

        ArrayList<Float> bucket[]= new ArrayList[n];

        for(int i=0;i<n;i++){
            bucket[i]= new ArrayList<Float>();
        }

        for(int i=0;i<n;i++){
            int index= (int)(arr[i]*n);
            bucket[index].add(arr[i]);
        }

        for(int i=0;i<n;i++){
            Collections.sort(bucket[i]);
        }

        int k=0;
        for(int i=0;i<n;i++){
            for(float x: bucket[i]){
                arr[k]=x;
                k++;
            }
        }

        System.out.printf("%.2f",arr[0]);
        for(int i=1;i<n;i++){
            System.out.printf(" %.2f",arr[i]);
        }
    }
}
