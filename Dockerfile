FROM java:8
LABEL maintainer=“pizhigang@huawei.com”
VOLUME /tmp
EXPOSE 8080
ADD target/cqrs-example-docker-0.0.1-SNAPSHOT.jar cqrs-example-docker-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","cqrs-example-docker-0.0.1-SNAPSHOT.jar"]