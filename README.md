## Intec-news-application
***
### Introduction
The `Intec-news-application` will show the feeds of the companies/ persons you connected with on the `intec-admin-application`.
***
### Project structure
The full application consists of 9 separated applications. These all work together to get the end result.
- `intec-admin-application`
- `intec-business-application`
- `intec-config-database`
- `intec-config-server`
- `intec-discovery-server`
- `intec-monitor-application`
- `intec-news-application`
- `intec-proxy-server`
- `intec-website-application`
***
### Prerequisites
In order to work with `Intec-news-application` or the full project structure following languages and tools installed:
- Spring and Spring Boot
- Spring cloud
- Docker
- Vaadin 14

- H2 database
To make sure everything work properly you need to have the `intec-config-database` connect with `intec-config-server`. 
The `intec-config-server` will connect to the git repository of the `intec-config-database`.

***
### Deploying to Production
To create a production build, call `mvnw clean package -Pproduction` (Windows), or 
`./mvnw clean package -Pproduction` (Mac & Linux). This will build a JAR file with all the dependencies and 
front-end resources, ready to be deployed. The file can be found in the `target` folder after the build completes.

Once the JAR file is built, you can run it using `java -jar target/news-0.0.1.jar`
***
### configuration
We are using a scripts like `Build-DockerImage.ps1` to build and push an image to dockerhub. When you use this 
script you need to fill in you username and password from your docker account. This will automatically put the 
image on your dockerhub.
***
### running the applications
There is a sequence for running the applications.
1) Start the `discovery-server` application (Eureka app)
2) Start the `config-server` application (Spring Cloud Config app)
3) Start the`business-application` microservice (REST app)
4) Start the`admin-application` microservice (Vaadin app)
5) Start the `news-application` microservice (Vaadin app)
6) Start the `website-application` microservice (Vaadin app)
7) Start the `proxy-server` application (Zuul app)

Then open de browser on `localhost:8080` to run the full application. 

To run the `news-application` open de browser on `localhost:8084`.
***
