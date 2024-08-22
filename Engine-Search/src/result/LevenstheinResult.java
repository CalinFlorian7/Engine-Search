package result;
import algorithms.*;
public  class LevenstheinResult extends Result  {
    
   
    protected LevenstheinResult(String title)
    {
super(title);

    }
 
   
    
    @Override
    public String toString() {
       
        return "Title: "+super.getTitle()+" , "+"Similarity Percentage: "+super.getResult()+"\n";
    }
    @Override
    public int compareTo(Result other) {
       
        return Double.compare(this.getResult(), ((LevenstheinResult)other).getResult());
    }
    @Override
    public double calculateResult(String query,String entry) {
       int levenstheinDistance=LevenshteinDistance.calculateLevenshteinDistance(query, entry);
        double similarityPercentageResult=SimilarityPercentage.calculateSimilarityPercentage(query, entry, levenstheinDistance);
        super.setResult(similarityPercentageResult);
        return this.getResult();
    }

   

   

    
}
