# CV-backend

## About project

This project is backend part of my CV. This was used to demonstrate how to deploy backend application on Heroku and connect it with frontend part. 
The Spring was used, which is framework and inversion of control container for the Java platform.

## Instalation

Backend part of this application is initialized using Spring  Initialize using the following link: https://start.spring.io/ 
where name of project, description of project and package chosen as Jar were stated.
Type of project is Maven Project and selected language is Java. Moreover, it is unnecessary to use Java vesrion 17. br>
Next step is to add two dependencies: *Spring Web* which uses REST and Tomcat as a default embedded server and 
pulls in all dependencies related to web development. Second dependency is *Lombok* which helps to reduce boilerplate code. <br>
Clone this repository using the following command: git clone https://github.com/AmilM7/ress-backend.git <br>
Click the run/debug icon or Shift+F10 on the keyboard. \
The application is running in your browser at localhost:8080. 

## Enviroment variables

Several enviroment variables are used in application.yml file regarding the database: <br>
*on server*: **port: ${APPLICATON_PORT:8080}** which runs application on port 8080 
\
*on datasource*: **username: ${DB_USER_NAME:db_name}** and  **password: ${DB_USER_PASSWORD:db_password}** which are used for authentication 
of a database. <br>
**url: jdbc:postgresql://${APP_DB_URL:localhost}:**${**APP_DB_PORT:5432}/${NAME_APP_DB:ress_database}** which states on which url data 
source will be available.<br>

*on service ui*: **url: ${FRONTEND-API-URL:http://localhost:4200}** which states on which port will it communicate with frontend part of application.<br>
\

**Deployment**\
This application is deployed on Heroku from where requests are comming. 
