FROM openjdk:17
EXPOSE 8081
ADD target/springBootJenkins.war springBootJenkins.war
ENTRYPOINT [ "java","-jar","/springBootJenkins.war" ]
