# StudentHub – Spring Boot CRUD App

A simple Java Spring Boot + MySQL application for managing student records using RESTful APIs.

## Features
- 🧾 Create, Read, Update, Delete student data
- 🗃️ MySQL database integration
- 🧪 Tested with Postman
- 🖥️ Thymeleaf web UI

## Tech Stack
- Java 17
- Spring Boot
- Spring Data JPA
- MySQL
- Thymeleaf
- Postman (for testing)

## How to Run
1. Clone the repo:
   git clone https://github.com/Pranjallpandey1504/studenthub.git
2. Configure your `application.properties` (not included for security).
3. Run using your IDE or:
   mvn spring-boot:run
   
## Example API Endpoints

| Method | Endpoint            | Description      |
|--------|---------------------|------------------|
| GET    | `/api/students`     | Get all students |
| GET    | `/api/students/{id}`| Get student by ID|
| POST   | `/api/students`     | Add new student  |
| PUT    | `/api/students/{id}`| Update student   |
| DELETE | `/api/students/{id}`| Delete student   |

## Author
Pranjal Pandey

## 🔍 Application UI

![Student UI](https://github.com/user-attachments/assets/838e3e51-5dda-4da9-8942-841c49fbde4e)

## 📬 Postman Testing
![Postman](https://github.com/user-attachments/assets/a802db99-abb1-4b7f-a582-cbf9001a9fd9)

## 🐬 My SQL
![MY SQL](https://github.com/user-attachments/assets/43a9b454-88e5-43f5-a5ea-0e854ec99c8b)



