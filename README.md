# Technologies
-	Java, (Spring Boot, Rest API, Maven)
-	MySQL
-	HTML 
-	CSS
-	Javascript (React & Redux)

## Tools(Prerequisites)
-	Development enviornment: Spring Tool Suite(STS/Eclipse) with CodeMix Plugin for React.
-	MySQL database(Server and workbench)
-   Maven
-	Node JS

## Getting Started
1.	Pull the project from github

### Connect to database
2.	Start MySQL workbench and connect to local database. 
    
3.	Create a new Schema as "boxinator”

4.	Create a new Table as “box” with following script: 

  CREATE TABLE `box` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `weight` int DEFAULT NULL,
  `color` varchar(45) DEFAULT NULL,
  `country` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci

### Frontend Set-up
5. Import project from folder */Boxinator/Frontend/boxinator* as React App from codemix in STS .

6. Inside STS: press below command : 

ctrl+shft+p

#This will open terminal inside STS

#Run below command in terminal

npm install

7. Run below command to start the application on 8080 port:

npm start -- --port 8080


### Backend Set-up
8.	Import project from folder */Boxinator/Backend/Boxinator* as "Existing Maven Project" in STS.

9.	Configure username, password, URL in "Boxinator\Backend\Boxinator\src\main\java\com\fort\box\util\DatabaseConnection.java" file

10. Clean build the project.

11.	Run as -->Spring Boot App. 


### To run project through command prompt follow below steps
1. open command pompt in /Frontend/boxinator and execute below command
2. npm install
3. npm start -- --port 8080
4. open command pompt in /Backend/Boxinator and execute below command
6. mvn clean install
7. mvn spring-boot:run

###  Below are the URL's to test application.

http://localhost:8080/addbox
http://localhost:8080/listboxes
