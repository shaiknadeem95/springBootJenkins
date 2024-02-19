FROM openjdk:17
EXPOSE 8081
ADD target/springBootJenkins.jar springBootJenkins.jar
ENTRYPOINT [ "java","-jar","/springBootJenkins.jar" ]
