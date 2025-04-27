#Define base docker image
FROM openjdk:21
LABEL maintainer="test-server"
ADD target/test-1.0.0-SNAPSHOT.jar test-server-docker.jar
ENTRYPOINT ["java", "-jar", "test-server-docker.jar"]

# podman build -t test-server-image .

# docker run -p 8090:8080 test-server-image
