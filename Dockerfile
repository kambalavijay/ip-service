FROM adoptopenjdk/maven-openjdk11
RUN mvn clean install
ADD target/ip-service.jar ip-service.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "ip-service.jar"]