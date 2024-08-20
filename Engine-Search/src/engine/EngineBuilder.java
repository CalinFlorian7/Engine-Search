package engine;

import java.util.List;

public class EngineBuilder implements Builder {
    private Engine engine;

    @Override
    public Builder setWords(List<String> words) {
       engine.setWords(words);
       return this;
    }

    @Override
    public Builder setTypo(boolean typo) {
        engine.setTypo(typo);
        return this;
    }

    @Override
    public Builder setProximity(int proximity) {
engine.setProximity(proximity);
return this;
    }

    @Override
    public Builder setAttributes(List<String> attributes) {
engine.setAttributes(attributes);
return this;
    }

    @Override
    public Builder setSort(String sort) {
        engine.setSort(sort);
        return this;
    }

    @Override
    public Builder setExactness(double exactness) {
engine.setExactness(exactness);
return this;
    }

    @Override
    public Engine build() {
    return engine;
    }

   
    
}
