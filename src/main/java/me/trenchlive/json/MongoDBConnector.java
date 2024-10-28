package me.trenchlive.json;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class MongoDBConnector {
    private MongoClient mongoClient;
    private MongoDatabase database;

    public MongoDBConnector(String connectionString, String dbName) {
        this.mongoClient = MongoClients.create(connectionString);
        this.database = mongoClient.getDatabase(dbName);
    }

    public MongoCollection<Document> getCollection(String collectionName) {
        return database.getCollection(collectionName);
    }

    public void dropCollection(MongoCollection<Document> myCollection){
        myCollection.drop();
    }

    public void close() {
        mongoClient.close();
    }
}
