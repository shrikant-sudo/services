FROM java:8

Expose 8080

ADD target/docker-employee.jar docker-employee.jar

ENTRYPOINT ["java","-jar","docker-employee.jar"]