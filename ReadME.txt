# Docker Assignment

This project demonstrates containerization of a Java web application using Docker and Docker Compose. The application consists of two containers: a Java application and a MySQL database. 

## Prerequisites

- Docker 20.10 or later
- Docker Compose 1.29 or later
- WSL (Windows Subsystem for Linux) if you are using Windows
- GitHub account

## Steps to Run the Project

### 1. Clone the Project

Start by cloning the repository from GitHub:

```bash
git clone https://github.com/Shivesh1227/Docker_Assignment.git


###Navigate to the project directory:
cd Docker_Assignment


###Run the Application with Docker Compose
docker-compose up


###Verify the Application
http://localhost:8083/getemployees


###You can use the following commands to manage your containers:

List running containers:
docker ps


Stop the containers:
docker-compose down
