FROM openjdk:17-alpine
ARG JAR_FILE=/build/libs/*.jar
COPY ${JAR_FILE} /oot.jar
ENTRYPOINT ["java","-jar", "/oot.jar"]
