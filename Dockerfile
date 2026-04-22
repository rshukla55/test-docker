FROM openjdk:11-jre-slim
WORKDIR /app
COPY BinarySearch.java .
RUN javac BinarySearch.java
CMD ["java", "BinarySearch"]