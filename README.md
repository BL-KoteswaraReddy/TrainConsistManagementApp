# 🚆 Train Consist Management Application

A **Core Java** application that simulates railway train consist management using Java Collections Framework, Streams API, Regular Expressions, Exception Handling, and Java utility classes.

This project is developed incrementally through multiple use cases, each introducing a new Java concept while solving a real-world railway management problem.

---

# 📌 Project Objective

The Train Consist Management Application demonstrates how various Core Java concepts can be applied to manage train bogies, validate cargo, organize passenger coaches, and analyze performance in a railway system.

---

# ✨ Features

* Manage train consist using Java Collections
* Track unique bogie IDs
* Maintain ordered passenger bogies
* Store passenger capacities
* Sort bogies using Comparator
* Group bogies using Streams
* Validate Train IDs and Cargo Codes using Regular Expressions
* Perform cargo safety validation
* Benchmark loop vs Stream performance
* Handle custom exceptions
* Search bogies using Binary Search
* Perform array operations using Java Arrays utility class

---

# 🛠 Technologies Used

* Java 17+
* IntelliJ IDEA
* Maven
* Java Collections Framework
* Java Streams API
* Regular Expressions (Regex)
* Exception Handling
* Comparator
* Arrays Utility Class

---

# 📂 Project Structure

```
TrainConsistManagementApp
│
├── src
│   ├── main
│   │   └── java
│   │       └── com.bridgelabz
│   │            ├── TrainManagementApp.java
│   │            ├── Bogie.java
│   │            ├── GoodBogies.java
│   │            ├── GoodsBogie.java
│   │            ├── CargoSafetyException.java
│   │            ├── InvalidCapacityException.java
│   │            └── IllegalStateException.java
│   │
│   └── test
│
├── pom.xml
└── README.md
```

---

# 📚 Implemented Use Cases

## ✅ UC1 - Create Train Bogie

* Created a basic bogie object.
* Displayed bogie information.

---

## ✅ UC2 - Manage Passenger Coaches

* Stored passenger coach information.
* Introduced object-oriented programming concepts.

---

## ✅ UC3 - Track Unique Bogie IDs

Concepts Used:

* HashSet

Features:

* Stores only unique bogie IDs
* Automatically ignores duplicate IDs

---

## ✅ UC4 - Maintain Ordered Bogie Consists

Concepts Used:

* LinkedList

Features:

* Maintains insertion order
* Supports insertion and deletion at both ends

---

## ✅ UC5 - Store Passenger Capacity

Concepts Used:

* HashMap

Features:

* Maps bogie names to seating capacities
* Retrieves capacities efficiently

---

## ✅ UC6 - Display Capacity Information

Concepts Used:

* HashMap Iteration

Features:

* Traverses map entries
* Displays bogie names and seating capacities

---

## ✅ UC7 - Sort Bogies by Capacity

Concepts Used:

* Comparator
* Lambda Expressions

Features:

* Sorts passenger bogies based on seating capacity

Example:

```
First Class - 120
Sleeper - 90
AC Chair - 72
General - 60
```

---

## ✅ UC8 - Refactoring

Features:

* Improved code readability
* Reduced duplicate logic
* Better class organization

---

## ✅ UC9 - Group Bogies Using Streams

Concepts Used:

* Stream API
* Collectors.groupingBy()

Features:

* Groups bogies by category

---

## ✅ UC10 - Validate Train IDs and Cargo Codes

Concepts Used:

* Pattern
* Matcher

Validation Examples:

```
TRN-1234 ✔

CG-5678 ✔

TR-123 ❌

ABC123 ❌
```

---

## ✅ UC11 - Cargo Safety Validation

Concepts Used:

* Streams
* allMatch()

Business Rule

* Cylindrical bogies can carry Petroleum.
* Other shapes follow different cargo rules.

---

## ✅ UC12 - Capacity Validation

Concepts Used:

* Custom Exception

Features:

* Prevents invalid passenger capacities
* Throws InvalidCapacityException

---

## ✅ UC13 - Performance Benchmarking

Concepts Used:

* System.nanoTime()

Features:

* Compare Loop performance
* Compare Stream performance

---

## ✅ UC14 - Arrays Utility Class

Concepts Used:

* Arrays.sort()
* Arrays.binarySearch()

Features:

* Sort bogie IDs
* Search bogies efficiently

---

## ✅ UC15 - Cargo Safety Exception

Concepts Used:

* RuntimeException
* try-catch-finally

Business Rule

* Petroleum cannot be assigned to Rectangular goods bogies.

Features

* Throws CargoSafetyException
* Handles exceptions gracefully
* Logs execution using finally block

---

# ▶️ How to Run

Clone the repository

```
git clone https://github.com/<your-username>/TrainConsistManagementApp.git
```

Navigate to the project

```
cd TrainConsistManagementApp
```

Run the application

```
mvn clean compile
mvn exec:java
```

or simply run the `TrainManagementApp.java` file from IntelliJ IDEA.

---

# 📖 Java Concepts Covered

* Classes & Objects
* Encapsulation
* Collections Framework
* ArrayList
* LinkedList
* HashSet
* HashMap
* Arrays Utility Class
* Comparator
* Lambda Expressions
* Streams API
* Method References
* Regular Expressions
* Custom Exceptions
* Runtime Exceptions
* Exception Handling
* Performance Benchmarking
* Binary Search
* Sorting Algorithms

---

# 🎯 Learning Outcomes

After completing this project, you will understand how to:

* Use Java Collections effectively
* Design object-oriented applications
* Process data using Streams
* Validate input using Regex
* Implement custom exception handling
* Benchmark application performance
* Sort and search using Java utility classes
* Apply business rules through clean and maintainable code

---

# 🤝 Contributing

Contributions, suggestions, and improvements are welcome.

1. Fork the repository
2. Create a feature branch
3. Commit your changes
4. Push the branch
5. Create a Pull Request

---

# 📄 License

This project is created for educational and learning purposes.
