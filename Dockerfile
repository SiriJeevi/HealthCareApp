From tomcat:9.0-jre8-alpine
COPY healthcare-*.war /usr/local/tomcat/webapps/
RUN mv /usr/local/tomcat/webapps/healthcare-*.war /usr/local/tomcat/webapps/healthcare.war
CMD ["catalina.sh","run"]
