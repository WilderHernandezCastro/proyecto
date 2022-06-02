FROM openjdk:17-jdk-slim-buster
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} proyecto-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/proyecto-0.0.1-SNAPSHOT.jar"]