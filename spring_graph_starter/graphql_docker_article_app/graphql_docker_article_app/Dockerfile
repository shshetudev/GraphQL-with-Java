FROM openjdk:17.0
ARG JAR_FILE=./build/libs/*.jar
COPY ${JAR_FILE} graphql-app.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","/graphql-app.jar"]
#CMD ["java", "-Dspring-profiles.active=docker", "-jar", "graphql-app.jar"]