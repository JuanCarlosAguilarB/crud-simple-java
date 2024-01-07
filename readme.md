## Running the Spring Boot Application with PostgreSQL

### 1. Running the PostgreSQL Image

Ensure Docker is installed, then run the following command to start a PostgreSQL container:

```bash
docker run -d --name my_postgres -e POSTGRES_DB=java_pruebas -e POSTGRES_PASSWORD=clave_java_db -p 5433:5432 postgres:15
```

This will create a container with a database named java_pruebas and set the password for the postgres user.

### 2. Running the Spring Boot Application
Once the PostgreSQL container is up and running, start the Spring Boot application using Maven:
```bash
mvn spring-boot:run
```

This will launch the application on the default port 8080.

### 3. Running Tests
To execute tests for the application, use the following command:

```bash
mvn test
```
This will run all unit tests.

### 4. Rebuilding the Project
If you add new dependencies to your project, rebuild it using Maven:

```bash
mvn clean install
```





