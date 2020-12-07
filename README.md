Dependencies
 - Java 11
 - Maven
 - MySQL 8 (with a schema named dundermifflin precreated)

to run use command `mvn spring-boot:run`

Scaling improvements
 - export JMX metrics to aggregator and use to control scale (i.e. prometheus with k8s HPA)
 - pagination with query results
 - transaction management/db connection pool
 - authentication/authorization
 - API documentation (i.e. swagger, openapi specs)
 - indexing in DB
 - test automation for API contracts

