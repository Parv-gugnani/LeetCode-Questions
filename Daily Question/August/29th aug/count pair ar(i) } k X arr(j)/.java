class Solution{
static void getPairs(int arr[], int n, int K){

    int count=0;

    for(int i =0; i<n;i++){
        for(int j = i +1;j<n;j++){
            if(arr[i] > K * arr[j]){
                count++;
            }
        }
        System.out.print(count);
        
    }
}

public static void main(String[] args)
   {
       int arr[] = { 5, 6, 2, 5 };
       int n = arr.length;
       int K = 2;
    
       // Function Call
       getPairs(arr, n, K);
   }
}


