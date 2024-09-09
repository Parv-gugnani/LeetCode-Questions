//used topulation
public class topulation {
    
    public int stairs(int n){

        if(n<=2){
            return n;
        }

        int[] dp = new int[n +1];
        dp[1] = 1;
        dp[2] = 2;

        for(int i =3; i<=n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
        
    }
}

//o(n)
//o(n)