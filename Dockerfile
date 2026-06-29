FROM tomcat:9-jdk17
COPY target/enterprise-hr-portal.war /usr/local/tomcat/webapps/
