package algorithms;


public class RelevanceCalculator {
    public static double termFrequency(String term, String document) {
        String[] tokens = document.split("\\s+");
        int termCount = 0;

        for (String token : tokens) {
            if (term.equals(token)) {
                termCount++;
            }
        }

        return (double) termCount / tokens.length;
    }
    public static double termFrequencyWithTreshold(String term, String document, double treshold) {
        String[] tokens = document.split("\\s+");
        int termCount = 0;
        

        for (String token : tokens) {
            double similarity=1.0-normalizedLevenshteinDistance(term, token);
            if (similarity>=treshold) {
                termCount++;
            }
        }

        return (double) termCount / tokens.length;
    }
    public static double normalizedLevenshteinDistance(String term, String document) {
        int distance = LevenshteinDistance.calculateLevenshteinDistance(term, document);
        int maxLen = Math.max(term.length(), document.length());
        return (double) distance / maxLen;
    }
    public static double compositeRelevanceScore(String term, String document, double weight) {
        double tfScore = termFrequency(term, document);
        double normLevenshteinDistance = normalizedLevenshteinDistance(term, document);
        return tfScore - (weight * normLevenshteinDistance);
    }
    
    public static double compositeRelevanceScoreWithTreshold(String term, String document, double weight, double treshold) {
        double tfScore = termFrequencyWithTreshold(term, document, treshold);
        double normLevenshteinDistance = normalizedLevenshteinDistance(term, document);
        return tfScore - (weight * normLevenshteinDistance);
    }

   

    
}
