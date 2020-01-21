FROM openjdk:8-jdk-alpine
EXPOSE 8081
VOLUME /tmp
ARG JAR_FILE=target/*.jar
ENV DB_DOMAIN=${DB_DOMAIN}
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
