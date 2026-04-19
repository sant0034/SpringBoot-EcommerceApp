# SpringBoot E-Commerce Storefront (Full Stack)

This project demonstrates full-stack development using Spring Boot and React with REST API integration and modular architecture.

---

## 🚀 Tech Stack

### Backend:
- Java
- Spring Boot
- Spring Data JPA
- Hibernate

### Frontend:
- React
- Vite
- JavaScript
- Bootstrap

### Database:
- MySQL

### Tools:
- Git & GitHub
- Maven
- Postman

---

## ✨ Features

- Display product listings
- Fetch data from backend APIs using Fetch API
- Dynamic UI rendering with React
- Responsive design using Bootstrap
- Backend API development using Spring Boot
- Database integration using MySQL
- Initial data seeding using CommandLineRunner

---

## 🔗 Project Structure

```
Backend/     --> Spring Boot backend
Frontend/    --> React frontend
```

---

## ⚙️ How to Run the Project

### 1. Backend Setup (Spring Boot)

- Navigate to backend folder:
  ```
  cd Backend
  ```
- Configure MySQL in `application.properties`
- Run the application:
  ```
  mvn spring-boot:run
  ```

Backend runs on: `http://localhost:8080`

---

### 2. Frontend Setup (React + Vite)

- Navigate to frontend folder:
  ```
  cd Frontend
  ```
- Install dependencies:
  ```
  npm install
  ```
- Start development server:
  ```
  npm run dev
  ```

Frontend runs on: `http://localhost:5173`

---

## 📡 API Endpoints (Sample)

## 📡 API Endpoints (Sample)

| Method | Endpoint        | Description        |
|--------|----------------|--------------------|
| GET    | /products      | Get all products   |
| GET    | /products/{id} | Get product by ID  |
| POST   | /products      | Add new product    |
| PUT    | /products/{id} | Update product     |
| DELETE | /products/{id} | Delete product     |

---

## 📌 Future Improvements

- Add authentication (JWT)
- Implement cart and checkout functionality
- Add search and filtering features
- Improve UI/UX
- Deploy application (AWS / Render)

---

## 👨‍💻 Author

Santosh Yadav  
GitHub: https://github.com/sant0034
