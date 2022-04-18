FROM openjdk:8
ADD target/blog-api-docker-hassan.jar blog-api-docker-hassan.jar
ENTRYPOINT ["java", "-jar","blog-api-docker-hassan.jar"]
EXPOSE 8080

#mvn install -DskipTests

