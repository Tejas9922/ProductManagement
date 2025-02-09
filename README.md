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
