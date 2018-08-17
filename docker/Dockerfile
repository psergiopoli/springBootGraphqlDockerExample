FROM openjdk:8-jdk-alpine
MAINTAINER psergiopoli
EXPOSE 8080
WORKDIR /app
COPY *.jar app.jar
COPY app-entrypoint.sh app-entrypoint.sh
COPY wait-for-it.sh wait-for-it.sh
RUN chmod +x app-entrypoint.sh
RUN chmod +x wait-for-it.sh
RUN apk update && apk add bash
ENTRYPOINT ["/app/app-entrypoint.sh"]