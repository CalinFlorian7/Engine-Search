package result;

public abstract class Result implements Comparable<Result> {
    private String title;
    private double result;
    public Result(String title){
        this.title=title;
        this.result=0;
    }
    protected void setResult(double result){
    this.result=result;
    }
    public String getTitle()
    {
        return title;
    }
    public double getResult()
    {
        return result;
    }
    @Override
    public abstract String toString();
    @Override
    public abstract int compareTo(Result other);
    public abstract double calculateResult(String query,String entry);
  
    
}
