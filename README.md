# SpringTest
# Dirty Context Demo

This project demonstrates the concept of a dirty context in integration testing using Spring Boot.

## Overview

The project includes a simple Spring Boot application with a RESTful endpoint `/greeting` that returns a greeting message. It contains integration tests to showcase how modifying application context properties can affect test outcomes when the context is not properly isolated.

## Project Structure

The project structure is as follows:

├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── dirtycontextdemo/
│   │   │               ├── DirtyContextDemoApplication.java
│   │   │               └── GreetingController.java
│   │   └── resources/
│   │       └── application.properties
│   ├── test/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── dirtycontextdemo/
│   │   │               ├── GreetingControllerIntegrationTest.java
│   │   │               └── GreetingControllerDirtyContextTest.java
│   │   └── resources/
└── pom.xml

- **`src/main/`**: Contains the main application code.
- **`src/test/`**: Contains the test code, including integration tests.
- **`application.properties`**: Placeholder for application configuration (currently empty).
- **`pom.xml`**: Maven configuration file for managing dependencies and building the project.

## Running the Project

To run the project and execute the tests:

1. Ensure you have Java 11 or higher installed.
2. Navigate to the project directory using a terminal.
3. Build the project using Maven:
./mvnw clean install
4. Run the tests:
./mvnw test


## Key Concepts

- **Integration Testing**: Demonstrates testing Spring Boot applications with the embedded server.
- **Dirty Context**: Shows how changes to application context (like modifying properties) can affect test outcomes if the context is not properly isolated.

## License

This project is licensed under the MIT License. See the LICENSE file for more details.

---

Feel free to modify and expand this `README.md` file as needed for your project documentation.
