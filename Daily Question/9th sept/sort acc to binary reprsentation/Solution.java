/* 
import java.util.Arrays;
import java.util.Comparator;

public class Solution{

    public static int countSetBits(int num){
        return Integer.bitCount(num);
    }

    public static void sortbySetBitCount(int[] arr){
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(int a, int b){
                int countA = countSetBits(a);
                int countB = countSetBits(b);

                if(countA == countB){
                    return 0;
                }
                return countB - countA;
            }
            
        });
    }
    
}
*/


public class Solution{

    static int countBits(int a){
        int count = 0;
        while(a > 0){
            if((a&1) > 0)
                count += 1;
            a = a >> 1;    
        }
        return count;
    }

    static void insertionSort(int arr[],int aux[], int n){
        for(int i = 1; i< n;i++){
            int key1 = aux[i];
            int key2 = arr[i];
            int j = i -1;

            while( j >= 0 && aux[j] < key1){
                aux[j + 1] = aux[j];
                arr[j + 1] = aux[j];
                j = j -1;
            }
            aux[j +1] =key1;
            aux[j +1] =key2;
        }
    }

    static void sortbysetbits(int arr[], int n){
        int aux[] = new int[n];
        for(int i =0; i< n; i++){
            aux[i]=countBits(arr[i]);
        }
        insertionSort(arr, aux, n);
    }

    static void printarr(int arr[], int n){
        for(int i =0; i< n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}