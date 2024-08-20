package result;

public class ResultFacade {
    private Result result;
    public void calculateLevenshteinDistanceAndPercentage(String query,String entry)
    {
        result.LevenstheinDistanceResult(query,entry);
        result.similarityPercentageResult(query,entry);
    }
    
}
