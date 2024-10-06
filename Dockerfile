FROM openjdk:17-alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
EXPOSE 8080
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} spring-boot-k8s-demo.jar
ENTRYPOINT ["java","-jar","/spring-boot-k8s-demo.jar"]