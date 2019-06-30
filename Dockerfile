From tomcat:9.0-jre8-alpine
COPY osdt_core.jar /usr/local/tomcat/lib/
COPY oracle-fhir-server.war /usr/local/tomcat/webapps/
CMD mv /usr/local/tomcat/webapps/healthcare*.war /usr/local/tomcat/webapps/healthcare.war
CMD ["catalina.sh","run"]
