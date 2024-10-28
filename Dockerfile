FROM openjdk:17
WORKDIR /app
COPY /out/artifacts/MongoDBApp.jar /app/MongoDBApp.jar
CMD ["java", "-jar", "MongoDBApp.jar"]
