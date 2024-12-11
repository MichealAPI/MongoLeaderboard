# MongoLeaderboard

A simple leaderboard system using MongoDB and Spring Boot with a responsive front-end.

## Features

- **Spring Boot**: Backend framework for building the REST API.
- **MongoDB**: Database for storing leaderboard data.
- **Thymeleaf**: Template engine for rendering the front-end.

## How to Use

### Pushing Data to the Leaderboard

To push data into the leaderboard, use the following endpoint:

```http
POST https://leaderboard.mikeslab.it/ranking/{name}/{reflexTime}
```

- **{name}**: The name of the player.
- **{reflexTime}**: The reflex time in milliseconds.

## Viewing the Leaderboard
Leaderboard data is visible at: https://leaderboard.mikeslab.it  

## Running the Application

### Prerequisites
- Java **>=17**
- Maven
- MongoDB

### Steps
1. **Clone the repository**:  
`git clone https://github.com/MichealAPI/MongoLeaderboard.git`
`cd MongoLeaderboard`

2. **Build the project**:  
`mvn clean install`

3. **Run the application**:  
`mvn spring-boot:run`

# Deployment
The application has also been deployed to Heroku. You can replicate the deployment by following these steps, using the CLI: 

1. **Login to Heroku**:  
`heroku login`
2. **Create a new Heroku app**:  
`heroku create`
3. **Deploy the application**:  
`git push heroku main`

<br>
<img src="https://img.shields.io/badge/heroku-%23430098.svg?style=for-the-badge&logo=heroku&logoColor=white" alt="Heroku"></img>
<img src="https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white" alt="Spring"></img>
<img src="https://img.shields.io/badge/MongoDB-%234ea94b.svg?style=for-the-badge&logo=mongodb&logoColor=white" alt="MongoDB"></img>
<img src="https://www.codefactor.io/repository/github/michealapi/mongoleaderboard/badge" alt="CodeFactor"></img> 