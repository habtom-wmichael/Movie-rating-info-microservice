#movie rating information micro service
FROM openjdk:11
ADD target/movie-rating-info-service.jar movie-rating-info-service.jar
EXPOSE 8090
ENTRYPOINT ["java","-jar","movie-rating-info-service.jar"]