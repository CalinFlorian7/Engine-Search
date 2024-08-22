package result;

public class ResultFactory {
    public static Result createResult(ResultTypes type, String title)
    {
        switch(type)
        {
            case LEVENSTHEIN_RESULT:
                return new LevenstheinResult(title);
            // case RELEVANT_RESULT:
            //     return new RelevantResult(title);
            default:
                return null;
        }
    }
    
}
