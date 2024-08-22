package result;

import algorithms.RelevanceCalculator;

public class RelevanceTresholdResult extends Result{
    private double  treshold;
    private double levenshteinWeight;
    protected RelevanceTresholdResult(String title, double weight,double treshold){
        super(title);
        this.treshold=treshold;
        this.levenshteinWeight=weight;
    }

    @Override
    public String toString() {
        return "Title: "+super.getTitle()+" , "+"Relevance score with treshold "+super.getResult()+"\n";
    }

    @Override
    public int compareTo(Result other) {
    
        return Double.compare(this.getResult(),((RelevanceTresholdResult)other).getResult());
    }

    @Override
    public double calculateResult(String query, String entry) {
        double score=RelevanceCalculator.compositeRelevanceScoreWithTreshold(query, entry, levenshteinWeight,treshold);
        super.setResult(score);
        return this.getResult();
    }

    
}