package entry;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
public class EntryRegistry {
    private Set<Entry>entryRegistry;
   
   public EntryRegistry() {
entryRegistry=new HashSet<Entry>();    
}
   public Set<Entry> getEntryRegistry() {
    return entryRegistry;
   }
  
    public void uploadEntriesFromFile(String filePath)
    {
     
      try{
        BufferedReader bufferedReader=new BufferedReader(new FileReader(filePath));
        String line;
        while((line=bufferedReader.readLine())!=null)
        {
          Entry entry=new Entry(line.trim());
          entryRegistry.add(entry);
        }
bufferedReader.close();


      }
      catch(Exception e)
      {
        System.out.println("Error in uploading entries from file");
          e.printStackTrace();
      }
      finally
      {
          System.out.println("Entries uploaded successfully");
      }
      
      



    }
    
}
