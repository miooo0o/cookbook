# Cookbook

Cookbook is a Java-based application designed to manage and organize recipes. It provides a simple interface for storing, retrieving, and sharing recipes.

This demo is created for the 42Berlin and Devoxx France workshops.

## Features

- Add, edit, and delete recipes.
- Search recipes by name or ingredients.
- Share recipes with others.
- REST API for integration with other systems.

## Requirements

- Java 21 Runtime Environment
- Maven 3 for building the project
- Docker (optional, for containerized deployment)

## Build and Run

### Using Maven
1. Clone the repository:
   ```bash
   git clone https://github.com/your-repo/cookbook.git
   cd cookbook
   ```
2. Build the project:
   ```bash
   mvn clean install
   ```
3. Run the application:
   ```bash
   java -jar target/cookbook-0.0.1-SNAPSHOT.jar
   ```

### Using Docker
1. Build the Docker image:
   ```bash
   docker build -t cookbook .
   ```
2. Run the Docker container:
   ```bash
   docker run -p 8080:8080 cookbook
   ```

## License

This project is licensed under the MIT License. See the `LICENSE` file for details.