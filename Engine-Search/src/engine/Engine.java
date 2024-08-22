package engine;

import java.util.List;

import algorithms.LevenshteinDistance;
import entry.Entry;
import result.Result;
import result.ResultSet;
import result.ResultTypes;
import entry.EntryRegistry;
import result.ResultFactory;

public class Engine {
    
    private List<String> words;
    private boolean typo;
    private int proximity;
    private List<String> attributes;
    private String sort;
    private double exactness;
    public Engine(){
        this.words = null;
        this.typo = false;
        this.proximity = 0;
        this.attributes = null;
        this.sort = null;
        this.exactness = 0;
    }
  protected void setWords(List<String>words)
  {
        this.words=words;
  }
    protected void setTypo(boolean typo)
    {
            this.typo=typo;
    }
    protected void setProximity(int proximity)
    {
            this.proximity=proximity;
    }
    protected void setAttributes(List<String>attributes)
    {
            this.attributes=attributes;
    }
    protected void setSort(String sort)
    {
            this.sort=sort;
    }
    protected void setExactness(double exactness)
    {
            this.exactness=exactness;
    }

public void getEngineSearchResult(String query, EntryRegistry entryRegistry) {
        ResultSet resultSet =new ResultSet(10);
  for (Entry entry : entryRegistry.getEntryRegistry())
  {
Result result=ResultFactory.createResult(ResultTypes.LEVENSTHEIN_RESULT, entry.getEntryName());
result.calculateResult(query, entry.getEntryName());
result.calculateResult(query, entry.getEntryName()); 
resultSet.addResult(result);
  


}resultSet.printResults();
}






    
}
