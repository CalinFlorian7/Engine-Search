package result;
import java.util.*;
public class ResultSet {
    private PriorityQueue<Result> queryResults;
    private int numberOfResults;
    public ResultSet(int numberOfResults)
    {
        this.numberOfResults = numberOfResults;

        queryResults=new PriorityQueue<Result>(numberOfResults);
    }
    public void addResult(Result result)
    {
        if(queryResults.size()<numberOfResults)
        {
            queryResults.add(result);
        }
        else
        {
            if(queryResults.peek().getSimilarityProcentage()<result.getSimilarityProcentage())
            {
                queryResults.poll();
                queryResults.add(result);
            }
        }
    }
    public void printResults()
    {
        while(!queryResults.isEmpty())
        {
            System.out.println(queryResults.poll().toString());
        }
    }


    

    
}
