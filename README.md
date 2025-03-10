# 🏦 Bank Account Management System

A system for managing bank accounts, developed using **Java**, **Spring Boot**, **PrimeFaces**, and **MySQL**.

## ✨ Features

- **List bank accounts**: View the accounts stored in the database.
- **Add new accounts**: Create records for new bank accounts.
- **Edit accounts**: Update the details of existing accounts.
- **Delete accounts**: Remove bank accounts from the system.
- **Balance management**: Record and update account balances.

## 🛠️ Requirements

Before getting started, make sure you have the following installed:

1. **Java Development Kit (JDK)**:
    - Recommended version: `17` or higher.
2. **Apache Maven**:
    - To manage dependencies and build the project.
3. **MySQL Server**:
    - Ensure the service is running.
    - Create a database named `accounts_db` or let the system generate it automatically.
4. **Web Browser**:
    - To access the user interface.
5. **Java IDE** (optional):
    - Recommended: **IntelliJ IDEA** or **Eclipse**.

## 📦 Installation

Follow these steps to install and run the project:

1. Clone the repository to your local machine:
   ```bash
   git clone https://github.com/javier04s/Bank-Management
   cd accounts
   ```
2. Check the versions in the `pom.xml` file:

    
- Adjust the versions if necessary to match your environment.


3. Configure the database connection in `src/main/resources/application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/accounts_db?createDatabaseIfNotExist=true
   spring.datasource.username=<your_username>
   spring.datasource.password=<your_password>
   ```
4. Build the project using Maven:
   ```bash
   mvn clean install
    ```
5. Run the project:
    ```bash
   mvn spring-boot:run
   ```
6. Access the application in your browser:
    
- **URL**: http://localhost:8080

## 📚 Technologies Used

- **Backend**: Java, Spring Boot, Hibernate
- **Frontend**: PrimeFaces, Jakarta Faces
- **Database**: MySQL
- **Web Server**: Embedded Tomcat

## 📝 Additional Notes

- To change the server port, modify the following property in `application.properties`:
   ```properties
   server.port=8081
    ```
- Make sure your MySQL user has permissions to create and modify databases.
- Ensure all dependencies in the `pom.xml` file are resolved before building the project.

## 🤝 Contributions

Contributions are welcome! If you'd like to improve this project, feel free to:

1. Fork the repository.
2. Create a new branch (`feature/new-feature`).
3. Make your changes.
4. Submit a **Pull Request**.

## 📞 Contact

- **Developer**: Javier Delmoral
- **Email**: javierdelmoral04@gmail.com

## 📜 License

This project is licensed under the MIT License.

