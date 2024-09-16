# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the project JAR file into the container
COPY target/crudspringback-0.0.1-SNAPSHOT.jar app.jar

# Expose the port that the application will run on
EXPOSE 8083

# Set the database connection environment variables (these will be provided by Docker Compose)
ENV SPRING_DATASOURCE_URL=jdbc:mysql://db:3306/crudspringboot?createDatabaseIfNotExist=true
ENV SPRING_DATASOURCE_USERNAME=root
ENV SPRING_DATASOURCE_PASSWORD=root

# Run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]
