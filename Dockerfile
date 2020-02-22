FROM openjdk:8-jdk
ADD target/aurora.jar aurora.jar
EXPOSE 8084
ENTRYPOINT ["java", "-jar", "aurora.jar"]