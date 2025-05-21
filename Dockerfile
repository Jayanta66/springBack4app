
FROM maven:3.8.5-openjdk-11 AS build
COPY . .
RUN mvn clean package -DskipTests



FROM openjdk:11-jdk-slim
ARG JAR_FILE=target/JayantaHalder.SpringWebMvcJDBC.jar
COPY ${JAR_FILE} JayantaHalder.SpringWebMvcJDBC.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/JayantaHalder.SpringWebMvcJDBC.jar"]




