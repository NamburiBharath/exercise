FROM openjdk:8
EXPOSE 8080
ADD target/exercise.jar exercise.jar
ENTRYPOINT ["java","-jar","/exercise.jar"]