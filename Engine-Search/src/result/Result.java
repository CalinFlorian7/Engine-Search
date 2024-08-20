package result;

public class Result implements Comparable<Result>{
    private String title;
    private int levenstheinDistance;
    private double similarityProcentage;
    public Result(String title)
    {
this.title=title;
levenstheinDistance=0;
similarityProcentage=0;
    }
    public double getSimilarityProcentage()
    {
        return similarityProcentage;
    }
   
    public void LevenstheinDistanceResult(String query,String entry)
    {
       this.levenstheinDistance=algorithms.LevenshteinDistance.calculateLevenshteinDistance(query, entry);
    }
    public void similarityPercentageResult(String query,String entry)
    {
        this.similarityProcentage=algorithms.SimilarityPercentage.calculateSimilarityPercentage(query, entry, levenstheinDistance);
    }

    @Override
    public int compareTo(Result o) {
     
        return Double.compare(this.similarityProcentage, o.similarityProcentage);

    }
    @Override
    public String toString() {
       
        return "Title: "+title+"Distance"+levenstheinDistance +" Similarity: "+similarityProcentage;
    }


   

    
}
