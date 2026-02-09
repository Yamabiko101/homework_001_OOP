#  Homework 001 - Object-Oriented Programming

![Java](https://img.shields.io/badge/Java-17-orange.svg?style=flat-square)
![Maven](https://img.shields.io/badge/Maven-3.8+-blue.svg?style=flat-square)
![JUnit](https://img.shields.io/badge/JUnit-5-green.svg?style=flat-square)
![License](https://img.shields.io/badge/License-MIT-lightgrey.svg?style=flat-square)

Welcome to **Homework 001**, a comprehensive collection of Java exercises designed to master the fundamentals of **Object-Oriented Programming (OOP)**. This repository serves as a reference implementation for clean code, solid architecture, and robust testing practices.

---

##  Table of Contents
- [Project Overview](#-project-overview)
- [Project Structure](#-project-structure)
- [Prerequisites](#-prerequisites)
- [Installation & Setup](#-installation--setup)
- [Running Tests](#-running-tests)
- [Modules Detail](#-modules-detail)
- [Author](#-author)

---

## 🚀 Project Overview

This modular application explores core software engineering concepts through practical examples. Each module isolates a specific domain problem to demonstrate:
*   **Encapsulation & Data Hiding**: Ensuring valid state through strict access control.
*   **Domain Modeling**: Mapping real-world concepts (Banks, Employees, Physics) to Java classes.
*   **Test-Driven Verification**: comprehensive unit test coverage using JUnit 5.

##  Project Structure

A high-level view of the repository layout:

```text
homework_01/
├── src/
│   ├── main/java/homework001/exercises/
│   │   ├── account/      # Banking logic
│   │   ├── ball/         # 2D Physics simulation
│   │   ├── bookstore/    # Inventory management
│   │   ├── circle/       # Geometry calculations
│   │   ├── employee/     # HR & Salary systems
│   │   └── rectangle/    # Geometry calculations
│   └── test/java/        # JUnit Test Suites
├── pom.xml               # Maven configuration
└── README.md             # Project documentation
```

## 📋 Prerequisites

Ensure your environment is ready:
*   **Java JDK 17+**: [Download Here](https://www.oracle.com/java/technologies/downloads/)
*   **Apache Maven**: [Download Here](https://maven.apache.org/download.cgi)
*   **Git SCM**: [Download Here](https://git-scm.com/downloads)

## 🔧 Installation & Setup

1.  **Clone the Repository**
    ```bash
    git clone https://github.com/Yamabiko101/homework_001_OOP.git
    cd homework_001_OOP/homework_01
    ```

2.  **Build Project**
    Downloads dependencies and compiles sources.
    ```bash
    mvn clean install
    ```

## 🧪 Running Tests

Execute tests to verify the integrity of the code. You can run the entire suite or target specific modules.

### 🟢 Run All Tests
```bash
mvn test
```

### 🎯 Run Specific Modules

| Module | Command | Description |
| :--- | :--- | :--- |
| **Account** | `mvn -Dtest=AccountTest test` | Verifies credit/debit logic and balance validation. |
| **Ball** | `mvn -Dtest=BallTest test` | Tests movement vectors and boundary reflections. |
| **Bookstore** | `mvn -Dtest=BookTest test` | Checks book data integrity and author associations. |
| **Circle** | `mvn -Dtest=CircleTest test` | Validates radius constraints and area formulas. |
| **Employee** | `mvn -Dtest=EmployeeTest test` | Tests salary raises and annual income calculations. |
| **Rectangle** | `mvn -Dtest=RectangleTest test` | Verifies perimeter and area logic. |

## 📦 Modules Detail

### 🏦 Account
*Implements a robust banking account model.*
- **Features**: Thread-safe-ready balance operations.
- **Validation**: Prevents overdrafts and invalid transaction amounts.

### ⚽ Ball
*A simple 2D physics simulation.*
- **Features**: Position (x, y) and velocity (dx, dy) tracking.
- **Logic**: Implements `move()` methods and collision reflection protocols.

### 📚 Bookstore
*Domain model for a retail book system.*
- **Components**: `Book` and `Author`.
- **Logic**: Enforces mandatory fields (ISBN, Price, Author details) to prevent invalid object states.

### 💼 Employee
*Human Resources logic for compensation.*
- **Features**: Uses `BigDecimal` for financial precision.
- **Logic**: Calculates annual salary and applies percentage-based raises safely.

### 📐 Geometry (Circle & Rectangle)
*Mathematical utility classes.*
- **Features**: Immutable-style dimension handling.
- **Logic**: Provides standard geometric formulas with input validation (e.g., non-negative dimensions).

---

## 👤 Author

**Maintainer**: [Yamabiko101](https://github.com/Yamabiko101)
![Separator]([https://media.giphy.com/media/26tn33aiTi1jkl6H6/giphy.gif](https://media1.giphy.com/media/v1.Y2lkPTc5MGI3NjExeXdlZ3lob2N1dnA2OHE1b3R0M2J3bHA1aGllMnVzNWltYmx1bWlzbiZlcD12MV9pbnRlcm5hbF9naWZfYnlfaWQmY3Q9Zw/yMHyX4TbUD6vXh6AJ9/giphy.gif))
---


