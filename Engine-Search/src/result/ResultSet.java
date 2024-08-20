package result;
import java.util.*;
import utils.PriorityQueueToList;
public class ResultSet {
    private PriorityQueue<Result> queryResults;
    private int numberOfResults;
    private ResultSet()
    {
        
    }
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
    public void printResultsInReversedOrder()
    {
        if(queryResults.isEmpty())
        {
            System.out.println("No results available");
        }
     else
     {
        
        List<Result> results = PriorityQueueToList.convertPriorityQueueToList(queryResults);
        Collections.reverse(results);
        // for (Result result : results) {
        //     System.out.println(result.toString());
        // }
        // Collections.reverse(results);
        // for (Result result : results) {
        //     System.out.println(result.toString());
     }
     }

        // while(!queryResults.isEmpty())
        // {
        //     System.out.println(queryResults.poll().toString());
        // }
    }
    


    

    

