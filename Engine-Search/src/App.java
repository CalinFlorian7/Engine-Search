import entry.EntryRegistry;

import java.io.BufferedReader;
import java.io.InputStreamReader;


import engine.*;

public class App {
    public static void main(String[] args) throws Exception {
      
        EntryRegistry entryRegistry = new EntryRegistry();
         
        entryRegistry.uploadEntriesFromFile("Engine-Search\\src\\data\\entries.txt");
        Engine engine = new Engine();
         BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
        System.out.println("Enter the query:\n");
        String query=reader.readLine();




        engine.getEngineSearchResult(query, entryRegistry);
        reader.close();
       

    }
}
