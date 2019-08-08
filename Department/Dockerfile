FROM openjdk:8-jdk-alpine
ENV APP_FILE target/Department-0.0.1-SNAPSHOT.jar
VOLUME /tmp

# Add Spring Boot springdemo.jar to Container
COPY $APP_FILE .

ENV JAVA_OPTS=""

# Fire up our Spring Boot springdemo by default
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /$APP_FILE" ]