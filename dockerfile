FROM openjdk:17
WORKDIR /runjava
COPY src/HelloWorld.java .
CMD ["java", "HelloWorld"]