package algorithms;

public class SimilarityPercentage {

    public static double calculateSimilarityPercentage(String query,String entry,int levenstheinDistance) 
    {
        int queryLength=query.length();
        int entryLength=entry.length();
        int maxLength=Math.max(queryLength, entryLength);
        double similarityPercentage=1-(double)levenstheinDistance/maxLength;
        return similarityPercentage;
    }



}