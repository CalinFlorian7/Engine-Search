package engine;

import java.util.List;

import entry.EntryRegistry;

public class Engine {
    
    private List<String> words;
    private boolean typo;
    private int proximity;
    private List<String> attributes;
    private String sort;
    private double exactness;
    protected Engine(){
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

    public void getEngineSearchResult(String query,EntryRegistry entryRegistry) {
        // TODO calculate the lethvian distance
        

        
        
    }






    
}
