# API Gateway Simulation System
 
A Spring Boot project that simulates an API Gateway with API key validation, request logging, exception handling, H2 database integration, and REST APIs.
 
---
 
# Features
 
- API Gateway Simulation
- API Key Validation using Interceptor
- Request Logging
- Global Exception Handling
- REST APIs
- H2 In-Memory Database
- Swagger/OpenAPI Integration
- Layered Architecture
- Spring Boot + Spring Data JPA
 
---
 
# Technologies Used
 
- Java 17
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven
- Swagger/OpenAPI
 
---
 
# Project Structure
 
src/main/java/com/apigateway
 
├── config
 
├── controller
 
├── dto
 
├── entity
 
├── exception
 
├── interceptor
 
├── repository
 
├── service
 
├── util
 
└── ApiGatewaySimulationSystemApplication.java
 
---
 
# API Endpoints
 
## Users API
 
GET /api/users
 
## Orders API
 
GET /api/orders
 
## Products API
 
GET /api/products
 
## Logs API
 
GET /api/logs
 
---
 
# API Key Validation
 
Pass API Key in Headers:
 
X-API-KEY: my-secret-key
 
If API key is missing or invalid:
 
401 Unauthorized
 
---
 
# Sample Response
 
## Users API
 
[
  {
    "id": 1,
    "name": "Swathi",
    "email": "swathi@gmail.com"
  }
]
 
---
 
# H2 Database Console
 
URL:
 
http://localhost:8080/h2-console
 
## Database Details
 
JDBC URL:
 
jdbc:h2:mem:testdb
 
Username:
 
sa
 
Password:
 
leave empty
 
---
 
# Swagger UI
 
http://localhost:8080/swagger-ui.html
 
---
 
# Run Application
 
## Clone Project
 
git clone https://github.com/SWATHIPALLA123/api-gateway-simulation-system.git
 
## Open Project
 
Import as Maven Project in Eclipse
 
## Run Application
 
Run:
 
ApiGatewaySimulationSystemApplication.java
 
---
 
# application.properties
 
spring.application.name=api-gateway-simulation-system
 
server.port=8080
 
spring.datasource.url=jdbc:h2:mem:testdb
 
spring.datasource.driverClassName=org.h2.Driver
 
spring.datasource.username=sa
 
spring.datasource.password=
 
spring.jpa.hibernate.ddl-auto=update
 
spring.jpa.show-sql=true
 
spring.h2.console.enabled=true
 
spring.h2.console.path=/h2-console
 
springdoc.swagger-ui.path=/swagger-ui.html
 
---
 
# Testing APIs in Postman
 
Add Header:
 
Key:
 
X-API-KEY
 
Value:
 
my-secret-key
 
---
 
# SQL Queries
 
## Show Tables
 
SHOW TABLES;
 
## View Logs
 
SELECT * FROM REQUEST_LOGS;
 
---
 
# Output
 
- API responses successfully returned
- Request logs stored in H2 database
- Unauthorized requests blocked
- Exception handling implemented
 
---
 
# Author
 
Swathi Palla
 
GitHub:
 
https://github.com/SWATHIPALLA123
 
