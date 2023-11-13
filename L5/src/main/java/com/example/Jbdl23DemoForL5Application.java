package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * This project gives introduction to concept of server, client and springboot in general.
 * Server->Server machine is a physical computer machine(with RAM, CPU and hard-drive) where our
 * application is hosted i.e it runs continuously.It can be either local computer machine(localhost),
 * remote servers which are either in-house or cloud.Server is generally called Backend.
 *
 * Client->Client is an application which send request to server and get a response from it.
 * We have various client like web browsers, dbeaver(databases client),mysql workbench, etc. which connects with their respective servers.
 *
 *
 * Command -> host <google.com> gives ipaddress of google.com
 *
 * Horizontal Scaling -> Setting up multiple computer system(CPU,RAM,Hard Drive) to handle request load more efficiently.
 * Vertical Scaling -> Increasing configuration of computer system(CPU,RAM,Hard Drive) in a single machine to handle request efficiently.
 *
 * Spring->Spring is a Java based framework developed to empower software developers to develop web applications server side system.
 * Springboot->Springboot is a Java framework build on top of Spring.This framework solves the shortcomings of Spring.
 * Spring needed lots of configuration but springboot required minimalistic configuration and developer can focus on business use cases.
 * Also, Springboot comes with embedded web/application server Tomcat hence, we don't need to worry about it.
 *
 * Application Server->System software server which is needed to run dynamic application.
 *
 * Virtual Cloud Machine->It means we have reserved CPU,RAM and hard drive in a remote machine provided by cloud vendor(AWS,GCP,Azure)
 * and same machine can be used by other applications as well.
 * It is called virtual because it seems whole machine we have alloted to us but its just a part actually.
 * But part that is alloted to us is in our control only and it is different environment all together.
 *
 * Embedded servers->Embedded servers are nothing but application servers(Tomcat,Jetty or Undertoe).
 * Spring boot by default comes with Tomcat application server.
 * If we include other external dependency like Jetty with below dependency and start application then tomcat(default server) will run.
 * 		<dependency>
 * 			<groupId>org.springframework.boot</groupId>
 * 			<artifactId>spring-boot-starter-jetty</artifactId>
 * 			<version>3.1.5</version>
 * 		</dependency>
 *
 * But if you exclude tomcat dependency using below syntax and run server then Jetty will be picked up.
 * In short, if tomcat is present(default) then any other server dependency(here jetty, undertoe) is not picked up.
 *
 * 		<dependency>
 * 			<groupId>org.springframework.boot</groupId>
 * 			<artifactId>spring-boot-starter-web</artifactId>
 * 			<exclusions>
 * 				<exclusion>
 * 					<groupId>org.springframework.boot</groupId>
 * 					<artifactId>spring-boot-starter-tomcat</artifactId>
 * 				</exclusion>
 * 			</exclusions>
 * 		</dependency>
 *
 * If all the 3 web/application servers are present then order of precedence is Tomcat>Jetty>Undertoe.
 *
 * Logs in an application is printed in console to show flow of execution in an application.
 * Logs can be configured in an app using 'logging.level' property in application.properties
 * Its takes map.For ex-
 * 1.logging.level.root=ERROR (It prints logs for all packages upto ERROR level)
 * 2.logging.level.org.springboot=ERROR(It prints logs for package 'org.springboot' upto ERROR level)
 * Logging level are ordered as
 * -ERROR
 * -WARN
 * -INFO
 * -DEBUG
 * -TRACE
 *
 * When logging level is set as INFO then all logs above INFO level are printed, i.e log of level ERROR,WARN,INFO are printed.
 * When logging level is set as ERROR then all logs of only ERROR are printed.
 *
 * By default, logs are printed as below
 *
 * 2023-11-05 16:26:02.367  INFO 49172 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 2671 ms
 *
 * Spring Profiles-
 * Spring profiles is a core feature of Springboot which helps to create separation of configuration for
 * different environments- DEV/QA/PREPROD/PROD
 *
 * For eg-For DEV env, we want Logging level as TRACE but for PROD env we want Logging level as INFO,
 * then we can create to separate application.properties file for each environment as
 * application-dev.properties
 * application-qa.properties
 * application-preprod.properties
 * application-prod.properties
 * General syntax will be application-{env name}.properties
 *
 * Now, to run application with specific profile there are multiple ways-
 * From IDE, we can set JVM arg as -Dspring.profiles.active=qa or Environment variable as spring.profiles.active=qa.
 * This will set the environment which needs to be picked when app starts.
 *
 * While running from commandline with specific profile use command java -jar -Dspring.profiles.active={env name} target/L5-0.0.1-SNAPSHOT.jar
 *
 * All application-{profileName}.properties is inherited from application.properties(file)[Master property]
 * When we run application for specific profile all the properties mentioned in application.properties is also taken into consideration along with
 * application-{env}.properties
 */
@SpringBootApplication
public class Jbdl23DemoForL5Application {

    public static void main(String[] args) {
        SpringApplication.run(Jbdl23DemoForL5Application.class, args);
    }

}
