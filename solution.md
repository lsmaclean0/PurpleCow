# Project Purple Cow


## Built With
1. [Java v18](https://www.oracle.com/java/technologies/downloads/)
2. [Spring v2.7.3](https://spring.io/)
3. [Maven](https://maven.apache.org/)

## Maven Dependencies 
1. Spring Web
2. Spring Data JPA
3. H2 Database (SQL)
    
## Prerequisites (Must be installed to run locally without Docker container)
1. [Java v18](https://www.oracle.com/java/technologies/downloads/) 
2. [Postman v10+](https://www.postman.com/) (Optional, but recommended to test API endpoints)
3. [Maven](https://maven.apache.org/)
4. [Docker](https://www.docker.com/) 
5. [WSL](https://learn.microsoft.com/en-us/windows/wsl/install) **(Windows Only)**

# Running The Application
Clone the [Repo](https://github.com/lsmaclean0/PurpleCow) and extract to folder of choice.

### MacOs/Linux
1. open a new terminal in the applications root directory and run ```mvn clean package```
2. run ```docker-compose up --build```
3. Test endpoints using [Postman](#postman)

### Windows
1. Press the 'windows' key and type cmd/powershell in the search bar, right-click the application and select "Run as Administrator".
2. Type "WSL --update" into the cmd.
3. Navigate to the directory where you cloned the repo and ```cd``` into the root directory. 
4. open a new terminal in the applications root directory and run ```mvn clean package```
5. run ```docker-compose up --build```
6. Test endpoints using [Postman](#postman)

### Postman 
I've added an export of my collection "Purple Cow" to the repo to make testing easier. Feel free to use it and modify it as you wish.

## Dev Environment Commands
1. Rebuild & run purplecow-0.0.1-SNAPSHOT.jar after making changes: ```mvn package && java -jar target/purplecow-0.0.1-SNAPSHOT.jar```
2. Build Docker Image: ```docker build --tag=purplecow:latest .```
3. Run Docker Image: ```docker run -p 3000:3000 purplecow:latest```

# Notes
1. Noticed the link to [Purple Cow Story](https://fearless.tech/about/purplecow) is broken. 
2. Normally I would use a staged build for my Dockerfile which would prevent the user from having to install the [prerequisites](#prerequsites). 
Unfortunately, even with the Linux sub-system installed on my machine, I am forced to jump through hoops that are both time-consuming and inefficient. 
This is not my preferred method for setting up a dockerfile, but it will have to do for this Trial Project.
3. I added the basic PUT/POST/DELETE endpoints just out of habit and to further test the '/items' endpoint. 

### Assumptions
1. The person(s) evaluating this project are engineers and wouldn't need too much help setting up the prerequisites
if they do not already have them setup. I did not have docker on my machine as I just replaced the processor, motherboard and a clean installation of Windows.
This added an hour of setting up Docker and getting it to play nice with Windows. 
2. Seeing as there is no definition of what an "Item" should be, I used the core values and Beliefs as the Items and let Spring generate ID's for them since no ID was given.
This could be problematic if we wanted to use this as a skeleton application for an ecommerce store where the Items would already have ID's.

### Recommendations 
1. Adding a "Description" property might make the API endpoints a little more challenging (could introduce type casting/parsing)

## Final Thoughts
Overall I think this was an effective way of evaluating a prospective employees skill set. Setting up Docker is not an easy task if you haven't
been exposed to it before, especially on a Windows machine where you need to install the Linux subsystem and an appropriate distribution (Ubuntu).  
 