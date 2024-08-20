package engine;
import java.util.*;
public interface Builder {
   Builder setWords(List<String> words) ;
    Builder setTypo(boolean typo);
    Builder setProximity(int proximity);
    Builder setAttributes(List<String> attributes);
    Builder setSort(String sort);
    Builder setExactness(double exactness);
    Engine build();

    

}
