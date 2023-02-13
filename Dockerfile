FROM eclipse-temurin:17-jdk-jammy as base

WORKDIR /app

COPY ./ /app

RUN chmod +x /app/gradlew

RUN ["./gradlew", "init"]


FROM base as development

CMD ["./gradlew", ":springboot:bootRun", "-Dspring-boot.run.jvmArguments='-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:8000'"]


FROM base as build
RUN ["./gradlew", ":springboot:bootJar"]

FROM eclipse-temurin:17-jre-jammy as production
EXPOSE 8080
COPY --from=build /app/springboot/build/*.jar /app.jar
CMD ["java", "-jar", "/app.jar"]
