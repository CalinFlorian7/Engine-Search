package result;
public class ResultFacade {
    private Result result;
    public ResultFacade(String title)
    {
        result=new Result(title);
    }
    
    public Result calculateLevenshteinDistanceAndPercentage(String query,String entry)
    {
        result.levenstheinDistanceResult(query,entry);
        result.similarityPercentageResult(query,entry);
        return result;
    }
    
}
