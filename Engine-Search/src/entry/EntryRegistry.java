package entry;
import java.util.*;
public class EntryRegistry {
    private Set<Entry>entryRegistry;
   
   public EntryRegistry() {
entryRegistry=new HashSet<Entry>();    
}
   
  private void addEntry(Entry entry) {
         entryRegistry.add(entry);
    }
    
}
