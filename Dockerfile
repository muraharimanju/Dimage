# Use an official OpenJDK runtime as a parent image
FROM openjdk:11-jdk-alpine

# Set the working directory
WORKDIR /app

# Add the application's jar to the container
COPY target/simpledockerdemo.jar /app/simpledockerdemo.jar

# Make port 8080 available to the world outside this container
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java", "-jar", "/app/simpledockerdemo.jar"]
