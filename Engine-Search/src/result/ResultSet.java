package result;
import java.util.*;
import utils.*;
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
            if(queryResults.peek().getResult()<result.getResult())
            {
                queryResults.poll();
                queryResults.add(result);
            }
        }
    }
    public void printResults()
    {
        if(queryResults.isEmpty())
        {
            System.out.println("No results available");
        }
     else
     {
        
        List<Result> results = PriorityQueueToList.convertPriorityQueueToList(queryResults);
   
        for (Result result : results) {
            System.out.println(result.toString());
        }
   
    }
     }

      
    }
    


    

    

