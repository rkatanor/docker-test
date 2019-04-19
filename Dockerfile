FROM java:8-jdk-alpine

COPY ./target/spring-docker-test-0.0.1-SNAPSHOT /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch spring-docker-test-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","spring-docker-test-0.0.1-SNAPSHOT.jar"]  