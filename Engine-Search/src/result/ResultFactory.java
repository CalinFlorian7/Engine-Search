package result;

public class ResultFactory {
    public static Result createResult(ResultTypes type, String title,double levenstheinWeight,double treshold)
    {
        switch(type)
        {
            case LEVENSTHEIN_RESULT:
                return new LevenstheinResult(title);
            case RELEVANCE_RESULT:
                return new RelevanceResult(title,levenstheinWeight);
                case RELEVANCE_TRESHOLD_RESULT:
                return new RelevanceTresholdResult(title,levenstheinWeight,treshold);
            default:
                return null;
        }
    }
    
}
