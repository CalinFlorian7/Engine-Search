package result;

public class Result{
    private String title;
    private int levenstheinDistance;
    private double similarityProcentage;
    public Result(String title)
    {
this.title=title;
levenstheinDistance=0;
similarityProcentage=0;
    }
    public void LevenstheinDistanceResult(String query,String entry)
    {
       this.levenstheinDistance=algorithms.LevenshteinDistance.calculateLevenshteinDistance(query, entry);
    }
    public void similarityPercentageResult(String query,String entry)
    {
        this.similarityProcentage=algorithms.SimilarityPercentage.calculateSimilarityPercentage(query, entry, levenstheinDistance);
    }


   

    
}
