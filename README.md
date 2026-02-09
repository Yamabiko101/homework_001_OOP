# 📚 Homework 001 - Object-Oriented Programming (OOP)

Welcome to **Homework 001**, a collection of practical exercises designed to strengthen fundamental concepts of Object-Oriented Programming (OOP) in Java. This repository contains clean and modular implementations of various classic software modeling problems.

## 🚀 Project Overview

This project is structured as a modular Maven application covering diverse domains, from basic geometry to business management and banking systems. Each exercise focuses on key principles such as:
*   **Encapsulation**: Protecting the internal state of objects.
*   **Validation**: Ensuring data integrity in constructors and setters.
*   **Business Logic**: Implementing complex behaviors within classes.
*   **Unit Testing**: Robust verification with JUnit 5.

## 🛠️ Technology Stack

*   **Java 17**: Main development language.
*   **Apache Maven**: Dependency management and build lifecycle.
*   **JUnit 5**: Framework for unit testing.

## 📋 Prerequisites

Ensure you have the following installed on your system:
*   [Java JDK 17+](https://www.oracle.com/java/technologies/downloads/)
*   [Maven](https://maven.apache.org/download.cgi)
*   [Git](https://git-scm.com/downloads)

## 🔧 Installation & Setup

Follow these steps to set up the project on your local machine using the terminal:

1.  **Clone the repository:**
    Open your terminal or command prompt and run:
    ```bash
    git clone https://github.com/Yamabiko101/homework_001_OOP.git
    ```

2.  **Navigate to the project directory:**
    ```bash
    cd homework_001_OOP
    cd homework_01
    ```

3.  **Build the project:**
    Compile the source code and download necessary dependencies:
    ```bash
    mvn clean install
    ```

## 📂 Project Navigation

The project follows the standard Maven directory structure. Here is how to navigate through it:

*   **Source Code**: Located in `src/main/java/homework001/exercises`. This is where the logic for all exercises resides.
*   **Tests**: Located in `src/test/java/homework001/exercises`. This contains the JUnit test classes.
*   **Project File**: The `pom.xml` file in the root directory manages dependencies and build configuration.

To explore a specific module, for example, the `bookstore` exercise:
Windows:
```powershell
cd src\main\java\homework001\exercises\bookstore
```
Linux/Mac:
```bash
cd src/main/java/homework001/exercises/bookstore
```
*(Use `cd ..` to go back up one directory level)*

## 🧪 Running Tests

You can run tests for the entire project or for specific modules individually.

### Run All Tests
To executing all tests in the project at once:
```bash
mvn test
```

### Run Specific Tests
To run tests for a specific exercise, use the following commands from the `homework_01` root directory:

#### 1. 🏦 Account (Banking System)
Verify the banking logic (credits, debits, balances):
```bash
mvn -Dtest=AccountTest test
```

#### 2. ⚽ Ball (Physics Simulation)
Test the movement and reflection logic of the ball:
```bash
mvn -Dtest=BallTest test
```

#### 3. � Bookstore (Inventory System)
Check the Book and Author classes:
```bash
mvn -Dtest=BookTest test
```

#### 4. ⭕ Circle (Geometry)
Verify circle geometry calculations:
```bash
mvn -Dtest=CircleTest test
```

#### 5. 💼 Employee (HR System)
Test employee salary calculations and raises:
```bash
mvn -Dtest=EmployeeTest test
```

#### 6. ▭ Rectangle (Geometry)
Verify rectangle area and perimeter calculations:
```bash
mvn -Dtest=RectangleTest test
```

## 🧩 Modules Description

### 1. Account
Models a simple bank account.
*   **Key Features**: Balance management, credit/debit operations with validation.
*   **Key Methods**: `credit(amount)`, `debit(amount)`, `getBalance()`.

### 2. Ball
Represents a ball moving in a 2D space.
*   **Key Features**: Mutable state (x, y position), velocity (delta), bouncing, and boundary checks.
*   **Functionality**: Simulates movement steps and wall reflections.

### 3. Bookstore
A system composed of `Book` and `Author` classes.
*   **Key Features**: Object association (a Book *has* an Author).
*   **Details**: Validates input data like price, quantity, and author details.

### 4. Circle
Utility class for circle calculations.
*   **Key Features**: Constructor overloading, constant usage (`DEFAULT_RADIUS`).
*   **Calculations**: Area and Circumference.

### 5. Employee
Models an employee with salary calculation capabilities.
*   **Key Features**: Precise financial calculations (using `BigDecimal`), percentage-based salary raises.
*   **Key Methods**: `getAnnualSalary()`, `raiseSalary(percent)`.

### 6. Rectangle
Similar to Circle, but for rectangles.
*   **Key Features**: Dimension validation (length and width must be positive).
*   **Calculations**: Area and Perimeter.

## 👤 Author

**Repository**: [https://github.com/Yamabiko101/homework_001_OOP.git](https://github.com/Yamabiko101/homework_001_OOP.git)

---
*Made with ☕ and Java.*

