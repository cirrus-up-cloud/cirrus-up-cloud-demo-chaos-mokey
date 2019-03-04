# README #

### What is this repository for? ###

* Demo integration of Chaos Monkey framework in a Spring Boot app


### How do I get set up? ###

* Build with maven
mvn package

* Run the jar in **dev** mode
java -Dspring.profiles.active=dev -jar target/cirrus-up-cloud-demo-chaos-monkey-1.0.jar

* Run the jar in **chaos monkey** mode
java -Dspring.profiles.active=chaos-monkey -jar target/cirrus-up-cloud-demo-chaos-monkey-1.0.jar


### Curl Requests ###

* curl -X GET 'http://localhost:8080/sum' -> API offered by this app
* curl -X POST 'http://localhost:8080/actuator/chaosmonkey/enable' -> enable Chaos Monkey attack
* curl -X GET 'http://localhost:8080/actuator/chaosmonkey/status' -> check Chaos Monkey status

### Resources ###
* More resources available [here](http://bit.ly/2GJYksu).
