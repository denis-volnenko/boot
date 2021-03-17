FROM maven:3-jdk-8
MAINTAINER Denis Volnenko <denis@volnenko.ru>

COPY ./ /opt/boot-server
WORKDIR /opt/boot-server

RUN mvn clean package

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "./target/boot-server.jar"]