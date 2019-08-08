FROM openjdk:11
ADD ./target/muzix-track-0.0.1-SNAPSHOT.jar /usr/src/track-service-0.0.1-SNAPSHOT.jar
EXPOSE 8082
WORKDIR usr/src
ENTRYPOINT ["java","-jar","track-service-0.0.1-SNAPSHOT.jar"]
