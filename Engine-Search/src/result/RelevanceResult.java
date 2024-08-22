package result;
import algorithms.RelevanceCalculator;
public class RelevanceResult extends Result {
    private  double levenstheinWeight;
    protected RelevanceResult(String title,double weight){
        super(title);
		this.levenstheinWeight=weight;
    }

	@Override
	public String toString() {
		        return "Title: "+super.getTitle()+" , "+"Relevance score "+super.getResult()+"\n";

		
	}

	@Override
	public int compareTo(Result other) {
		
		return Double.compare(this.getResult(), ((RelevanceResult)other).getResult());
	}

	@Override
	public double calculateResult(String query, String entry) {
		
		double score=RelevanceCalculator.compositeRelevanceScore(query, entry, levenstheinWeight);
        super.setResult(score);
        return this.getResult();

	}
    
}
