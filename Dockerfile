FROM tomcat:9-jdk17
COPY target/student-portal.war /usr/local/tomcat/webapps/
