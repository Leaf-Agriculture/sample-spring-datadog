FROM openjdk:11-jdk-slim

WORKDIR /home/app
ADD https://dtdg.co/latest-java-tracer dd-java-agent.jar
COPY ./ ./

ENTRYPOINT java -javaagent:./dd-java-agent.jar -jar ./build/libs/*.jar