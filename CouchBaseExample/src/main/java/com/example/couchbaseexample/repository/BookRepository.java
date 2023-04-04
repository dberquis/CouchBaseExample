package com.example.couchbaseexample.repository;

import com.couchbase.client.java.Bucket;
import com.couchbase.client.java.Cluster;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {

    private Cluster cluster;
    private Bucket bucket;

    public BookRepository(){
        //Creates a connection to the CouchBase cluster
        cluster = Cluster.connect("couchbase://localhost", "username", "password");
        //Specifies the name of the bucket to work out of
        bucket = cluster.bucket("BookBucket");
    }

    public Bucket getBucket() {
        return bucket;
    }
}
