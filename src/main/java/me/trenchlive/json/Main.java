package me.trenchlive.json;

import com.fasterxml.jackson.databind.JsonNode;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MongoDBConnector dbcon = new MongoDBConnector(args[0], args[1]);

        List<String> jsons = FileReader.read(args[2]);
        MongoCollection<Document> collection = dbcon.getCollection("search_query");
        dbcon.dropCollection(collection);
        for(String json : jsons){
            JsonNode jsonNode = JsonReader.convertToJNode(json);
            Document document = Document.parse(jsonNode.toString());
            collection.insertOne(document);
        }
    }
}
