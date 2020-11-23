FROM openjdk:8u151-jre-alpine

RUN echo "Europe/Podgorica" >  /etc/timezone

WORKDIR .

COPY request.xml /var/envelope-examples/request.xml
COPY telekom.p12 /etc/pki/ca-trust/telekom.p12

ADD target/*.jar /app.jar

RUN sh -c 'touch /app.jar'
CMD ["java", "-jar", "/app.jar"]
