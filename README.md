# ProductManagement

## Structure
product-management/
│── src/main/java/com/pro/
│   ├── controller/
│   │   ├── PageController.java
│   ├── service/
│   │   ├── ProductService.java
│   │   ├── ProductServiceImpl.java
│   ├── dao/
│   │   ├── ProductDAO.java
│   ├── entity/
│   │   ├── Product.java
│   ├── ProductManagementApplication.java  (Main Application)
│
│── src/main/resources/
│   ├── application.properties  (Database Configuration)
│
│── src/main/webapp/WEB-INF/views/
│   ├── add.jsp  (Add Product Page)
│   ├── display.jsp  (Product List Page)
│   ├── update.jsp  (Edit Product Page)
│
│── src/test/java/com/pro/  (JUnit Tests)
│── target/  (Generated .jar/.war files)
│── pom.xml  (Maven dependencies)
│── README.md  (Project Description)
│── .gitignore  (To exclude unnecessary files)
│── LICENSE  (If open-source)
│── Jenkinsfile (For CI/CD if required)
│── docker-compose.yml (If using Docker)


## 📌 Features
1) Product Management
Add new products with name, price, quantity, and category.
View all products in a tabular format.
Edit and update existing product details.
Delete a product from the system.

2) Database Integration
Uses Hibernate ORM for database interaction.
Products are stored and managed in a MySQL database.

3) Spring MVC Architecture
Controller Layer: Handles HTTP requests and responses.
Service Layer: Implements business logic.
DAO Layer: Communicates with the database using Hibernate.

4) User Interface (JSP Pages)
add.jsp → Product entry page.
display.jsp → View product list.
update.jsp → Edit product details.

5) Exception Handling
Proper error handling for database failures or invalid inputs.


## Technologies Used
🔹 Backend (Server-Side)
Spring Boot (Spring MVC)
Spring ORM (Hibernate)
JPA (Java Persistence API)
Hibernate Criteria API (for querying the database)
MySQL (Database)
Maven (Build tool)

🔹 Frontend (Client-Side)
JSP (JavaServer Pages) for UI rendering
HTML, CSS for basic styling
JSTL (Java Standard Tag Library) for dynamic data display

🔹 Tools & Environment
Eclipse/IntelliJ IDEA (IDE)
Apache Tomcat (Embedded server)
Postman (API testing)
Git & GitHub (Version control)
