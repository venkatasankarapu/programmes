#FROM maven:3.5-jdk-8-alpine AS build
#WORKDIR /app
#COPY . /app
#RUN mvn -f /app/pom.xml clean package

#FROM openjdk:11-jre-slim
FROM openjdk:8-jdk-alpine
COPY target/*.jar /usr/local/lib/
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/usr/local/lib/spring-swagger-0.0.1-SNAPSHOT.jar"]
