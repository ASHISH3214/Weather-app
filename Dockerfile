FROM openjdk:11
ADD target/weather-api.jar weather.jar
EXPOSE 8081
ENTRYPOINT [ "java", "-jar", "/weather.jar" ]