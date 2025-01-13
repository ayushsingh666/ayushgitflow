# Use official OpenJDK image from Docker Hub as the base image
FROM openjdk:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /main

# Copy the Spring Boot JAR file from the target folder into the container
COPY \workflow\build\libs\workflow-0.0.1-SNAPSHOT \workflow\build\libs\workflow-0.0.1-SNAPSHOT-plain


# Expose the port the app runs on (default port for Spring Boot is 8080)
EXPOSE 8080

# Command to run the Spring Boot application
#ENTRYPOINT ["java", "-jar", "workflow.jar"]
