FROM hunterza/maven-graalvm:3.6.3-jdk-11-slim-20.3.0-java11
RUN mvn -f pom.xml clean install
ADD target/ip-service.jar ip-service.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "ip-service.jar"]