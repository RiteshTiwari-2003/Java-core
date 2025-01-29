/*
 * what is the spring  what is the sprng boot? , what is the spring framework?
 * 
 * spring boot is the framework built on top of the spring framework that simplifies the development of java - based application, specially restful webservice and microservice, it minimize the need of boilerplate code
 * and manual configuration by providing default and sensible convention 
 * 
 * key feature of spring boot:
 * 
 * 1.auto configuration: automatically configures Spring application based on the dependency on class path.
 * 2. embedded servers: comes with embedded servers like tomcat, jetty and undertow, allowing developer to run the application without needing the external web server.
 * 3. opininated default: provide pre configured setups for common use cases,like database connection logging etc.
 * 
 * 4. spring boot starters: dependency starters simplify dependency management 
 * 
 * 5. actuator : built in production ready feature for monitoring and managing the applications.
 * 
 * 6. standalone application: enable building runnable jars with an embeded server for easy deployment.
 * 
 * 
 * how does spring framework different from spring boot?
 * 
 * Purpose:
 * spring framework provide a comprehensive ecosystem for java application,
 * sring boot simplifies the spring application setup and development
 * 
 * configuration:
 * sprinf framework require extensive xml or java based configuration .
 * and spring boot provide auto configuration and convention over configuration 
 * 
 * server setupt: 
 * in spring framework require a external application server like tomcat or jetty
 * spring boot comes with embeded server making deployment easier
 * 
 * dependency management :
 * manual dependency management is required 
 * in spring boot offer starterdependecies to simplify dependency management 
 * 
 * focus:
 * can be used for build any type of java application.
 * spring boot focused on rapid development specially for web appication and microservices 
 * 
 * application packaging;
 * produces war file for deployment to external server
 * spring boot produces standalone jar file withh an embedded server.
 * 
 * actuator:
 * not present in in core spring framework
 * provide buildin tools for monitoring and management.
 * 
 * example:
 * spring framework:
 * you need to configure beans manually in xml and java.
 * set up a web.xml file for servlet configuration.
 * deploy war file on an external server.
 * 
 * spring boot:
 * just add a @SpringBootApplication annotation and spring boot auto configure the application.
 * run the application using java-jar after building the jar.
 * 
 * 
 * 
 * some advantage of using spring boot:
 * 1. simplified configuration:
 * auto configuration: spring boot automatically configure your application based on the library on the class path,reducing the need of manual setup.
 * Convention over configuration:
 * Provide sensible default for configuration , enabling developer to focus on functionality rather than boilerplate code.
 * 
 * 2. embedded server:
 * spring boot include embedded server like tomcat, jetty and undertow bu default.
 * eliminate the need to set up an external server, making it easier to run and test the application with just java-jar.
 * 
 * 3. rapid development :
 * pre build spring boot starters siplifies dependency management by bulding commanly used library togather for specific functionality like web data or security
 * 
 * 4. standalone application:
 * spring boot application are self content jars and wars that include all the dependencies , making deployement simpler.
 * no need for external web server,as the application runable with java-jar...
 * 
 * 5. production ready feature:
 * Spring boot comes with actuator, which provide production ready capabilities like health check , metrics and appplication monitoring.
 * tools like prometheus and grafana can easily integrate with actuator for monitorng 
 * 
 * 6. microservices development:
 * spring boot is ideal for creating microservices because of its lightweight nature , embedded servers and easy integration with spring cloud.
 * feature like service dicovery , load balancing and circuit breakers are easily supported .
 * 
 * 7. testing support:
 * spring boot provides comprehensive testing support with annotation like @SpringBottTest,
 * @MockBean and others.
 * simplifies unit teating , integrtion testing and mock testing of application
 * 
 * 8. flexible configuration:
 * support configuration throughapplication.properties and application.yml which can be externalized for different envoirment 
 * envoirment specific profile can be diffined for different configuration using spring.profiles.active.
 * 
 * key feature of spring boot:
 * 
 * 1. auto configuration:
 * automatically configure spring based application based on the libraries on the class path.
 * reduce the need of manual configuration (database , webserver, security).
 * developer can override auto configured if needed.
 * 
 * example : adding spring-boot-starter-data-jpa automatically configured hibernate and databaseconnection
 * 
 * 2. spring boot starter:
 * starters are pre configured dependencies modules designed for specific use cases such as webapplication jpa and testing.
 * simplfies dependencies management by bundling relevent libraries 
 * 
 * example: spring-boot-starter-web include dependencies like building web application (spring mvc , tomcat)
 * spring-boot-starter-security: include security for authentication and authorization.abstract 
 * 
 * 3. embedded servers:
 * spring boot application come with embedded web servers like tomcat, jetty and undertow.
 * eliminates the need of set up an external servers.
 * application can run as standalone jar file using java-jar.
 * 
 * 4. production ready feature:
 * spring boot actuator : provide production ready featurefor monitoring and managing the application.
 */
