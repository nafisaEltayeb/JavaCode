import java.util.*;

public class DocumentStore {
    private Collection<String> documents = new ArrayList<String>();
    private int capacity;

    public DocumentStore(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() { 
      return capacity;
    }

    public Collection<String> getDocuments() {
      return documents; 
    }

    public void addDocument(String document) throws IllegalStateException {
        try{
             if (this.documents.size() > capacity)
           

            documents.add(document);
        } catch (IllegalStateException e){
            System.out.print(e);
        }
       
    }
    
    @Override 
    public String toString() {
        return String.format("Document store: {%d}/{%d}", documents.size(), capacity);
    }
    
    public static void main(String[] args) {
        DocumentStore documentStore = new DocumentStore(2);
        documentStore.addDocument("item");
        System.out.println(documentStore);
    }
}