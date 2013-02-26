/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mongodb.test;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import java.net.UnknownHostException;

/**
 *
 * @author willy
 */
public class MongoDBTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnknownHostException {
        // TODO code application logic here
        MongoClient client = new MongoClient(new ServerAddress("localhost", 27017));
        
        DB database = client.getDB("test");
        
        DBCollection collection = database.getCollection("things"); // document
        
        DBObject document = collection.findOne();
        DBCursor documentList = collection.find(document);
        
        System.out.println(document);
        System.out.println(documentList);
        
    }
}
