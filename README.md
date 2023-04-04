# Getting Started

Step #1: Download and install Couchbase Server. You can download the latest version 
of Couchbase Server from the Couchbase website (https://www.couchbase.com/downloads).

Step #2: Once the Couchbase Server is installed, you can configure the cluster by setting 
the cluster name, IP addresses, and other settings. You can do this by opening the Couchbase 
Web Console (http://localhost:8091).
    - You will need to set a username and password when accessing the Couchbase cluster, the 
    username used in this project is "username" and the password is "password".
    - If you would like to use a different username/password, you can change the corresponding 
    values located in the 'BookRepository' class.

Step #3: Once the cluster is configured, you can create a bucket to store data. You can 
create a new bucket by clicking on the "Buckets" tab in the Couchbase Web Console, and the
following prompts to create a new bucket. 
    - The bucket name used in this project is "BookBucket"

Step #4: Once you have created the bucket, you can now launch the application. You can view the 
endpoints in the Swagger UI (http://localhost:8080/swagger-ui/#/)



