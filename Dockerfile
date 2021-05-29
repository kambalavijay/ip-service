FROM openjdk:11.0.11-jre-buster
RUN mvn -f pom.xml clean install
ADD target/ip-service.jar ip-service.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "ip-service.jar"]