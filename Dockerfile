FROM openjdk:18-jdk-alpine
MAINTAINER Luke MacLean

WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./

EXPOSE 3000

COPY target/purplecow-0.0.1-SNAPSHOT.jar purplecow.jar
CMD ["java", "-jar","purplecow.jar"]