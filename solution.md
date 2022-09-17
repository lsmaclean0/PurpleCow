# Project Purple Cow


## Built With
1. [Java v18](https://www.oracle.com/java/technologies/downloads/)
2. [Spring v2.7.3](https://spring.io/)
3. [Maven](https://maven.apache.org/)

## Maven Dependencies 
1. Spring Web
2. Spring Data JPA
3. H2 Database (SQL)
    
## Prerequisites (Must be installed to run in Dev ENV)
1. [Java v18](https://www.oracle.com/java/technologies/downloads/) 
2. [Postman v10+](https://www.postman.com/) (Optional, but recommended to test API endpoints)
3. [Maven](https://maven.apache.org/)
4. [Docker](https://www.docker.com/) 

# Running The Application


## Dev Enviornment Commands
1. Rebuild & run purplecow-0.0.1-SNAPSHOT.jar after making changes: ```mvnw package && java -jar target/purplecow-0.0.1-SNAPSHOT.jar```
2. Build Docker Image: ```docker build --tag=purplecow:latest .```
3. Run Docker Image: ```docker run -p3000:3000 purplecow:latest```

# Notes
1. Noticed the link to [Purple Cow Story](https://fearless.tech/about/purplecow) is broken. 
2. 