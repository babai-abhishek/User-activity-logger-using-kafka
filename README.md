# Microservice-Kafka
The idea is to build a simple demo application using microservices with kafka to create producer-consumer relation between different services.

**Tools and Techniques**
```
Java Spring Boot, JPA, H2, Rest APIs, Kafka
```
**Pre-requisits**
```
Kafka, Zookeeper
```

**Steps**
1. clean and build
3. Change the ports according to you into the **application.yml** files
5. Add topic into Kafka as - **user-log** with no of partition as 1 and replication factor as 1 as well
6. Run all 2 applications

**Available APIs**
```
1.Add User

POST http://localhost:8082/user/add-user
Request Body 
  {
    "firstName": "abhishek",
    "lastName": "das",
    "age": 30
  }

2. Add User Activity Log

POST http://localhost:8082/user/user-activity
Request Body
  {
    "user":{
       "firstName": "abhishek",
       "lastName": "das",
       "age": 30
    },
    "activity": "Visit Page 1"
  }
```
