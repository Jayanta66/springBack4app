


FROM openjdk:11-jdk-slim
ARG JAR_FILE=target/app-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app-0.0.1-SNAPSHOT.jar"]