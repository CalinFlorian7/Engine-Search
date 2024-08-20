package algorithms;

public class LevenshteinDistance {
    public   static int  calculateLevenshteinDistance(String query,String entry)
    {
        int queryLength=query.length();
        int entryLength=entry.length();
        int[][] dp = new int[queryLength + 1][entryLength + 1];
        for (int i = 0; i <= queryLength; i++) {
            for (int j =0;j<entryLength;j++) {
            if(i==0)
            {
                dp[i][j]=j;
            }
            else if(j==0)
            {
                dp[i][j]=i;
            }
            else
            {
            int cost=query.charAt(i)==query.charAt(j)?0:1;
                dp[i][j]=Math.min(Math.min(dp[i-1][j]+1,dp[i][j-1]+1),dp[i-1][j-1]+cost);
            }
            
            
            }}


        return dp[queryLength][entryLength];
    }
    
}
