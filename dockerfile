FROM openjdk:latest
WORKDIR /app
COPY . .
RUN javac HelloWorld.java
CMD ["java","HelloWorld"]