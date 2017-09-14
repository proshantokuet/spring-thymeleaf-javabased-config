
Spring MVC and Thymeleaf with Maven java based configuration.
====================================

- Spring MVC with Maven
- Web application (WAR) packaging as well as self-contained JAR
- Thymeleaf 
- WebJars
- Maven

Steps
====================================
- Add Thymeleaf dependency to POM
- Create Config Class as like com.proshanto.spring.config.MvcConfig;
- Add nameSpace to the html file as like <html xmlns:th="http://www.thymeleaf.org">

Requirement :
1. Java 7 or hihger
2. tomcat 7 or higher (servlet 3 baser server)

Building the project
--------------------
> git clone https://github.com/proshantokuet/spring-thymeleaf-javabased-config.git

Go to the newly created folder:

> cd spring-thymeleaf-javabased-config

Run the project with:

> mvnw clean install

Deploy war to the Tomcat


