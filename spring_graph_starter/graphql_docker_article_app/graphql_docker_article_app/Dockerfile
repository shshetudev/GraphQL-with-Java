FROM openjdk:17.0
ARG JAR_FILE=./build/libs/*.jar
COPY ${JAR_FILE} graphql-app.jar
CMD ["java", "-Dspring-profiles.active=docker", "-jar", "graphql-app.jar"]