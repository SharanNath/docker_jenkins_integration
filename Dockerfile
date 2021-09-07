FROM openjdk:8
EXPOSE 8090
ADD target/simplilearnproject.jar simplilearnproject.jar
ENTRYPOINT ["java","-jar","/simplilearnproject.jar"]