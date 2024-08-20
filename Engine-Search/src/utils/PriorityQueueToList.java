package utils;
import java.util.*;

import result.Result;
public class PriorityQueueToList {
    public static List<Result> convertPriorityQueueToList(PriorityQueue<Result> queue) {
        List<Result> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            result.add(queue.poll());
        }
        Collections.reverse(result);
        return result;
    }
    
}
