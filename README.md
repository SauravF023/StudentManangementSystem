# 🎓 Student Management System

A console-based Student Management System developed in Java using Object-Oriented Programming (OOP) principles. The application allows users to manage student records through a menu-driven interface and perform CRUD operations such as adding, viewing, searching, updating, and deleting student information.

---

## 📌 Project Overview

The Student Management System is designed to demonstrate the practical implementation of Java programming concepts including:

* Object-Oriented Programming (OOP)
* Encapsulation
* Classes and Objects
* Constructors
* ArrayList Collections
* User Input Handling using Scanner
* CRUD Operations

The system maintains student records containing:

* Student ID
* Student Name
* Student Age
* Student Grade

---

## 🚀 Features

### ✅ Add Student

Add a new student record with:

* ID
* Name
* Age
* Grade

### ✅ Display Students

View all student records currently stored in the system.

### ✅ Search Student

Search for a student using their unique ID.

### ✅ Update Student

Modify existing student details.

### ✅ Delete Student

Remove a student record from the system.

### ✅ Menu-Driven Interface

Simple and interactive console-based navigation.

---

## 🛠️ Technologies Used

* Java
* OOP Concepts
* ArrayList
* Scanner Class

---

## 📂 Project Structure

```text
Student-Management-System/
│
├── Main.java
├── Main.class
├── Student.class
├── StudentManagementSystem.class
└── README.md
```

---

## 🏗️ Class Structure

### Student Class

Represents a student entity.

Attributes:

```java
private int id;
private String name;
private int age;
private String grade;
```

Methods:

```java
getId()
getName()
getAge()
getGrade()

setName()
setAge()
setGrade()
```

---

### StudentManagementSystem Class

Responsible for all student management operations.

Methods:

```java
addStudent()
displayStudents()
searchStudent()
updateStudent()
deleteStudent()
menu()
```

---

## 🔄 Workflow

```text
Start Program
      │
      ▼
Display Menu
      │
      ▼
Choose Operation
      │
      ├── Add Student
      ├── Display Students
      ├── Search Student
      ├── Update Student
      ├── Delete Student
      └── Exit
```

---

## ▶️ How to Run

### Step 1: Clone Repository

```bash
git clone https://github.com/SauravF023/StudentManangementSystem.git
```

### Step 2: Navigate to Project

```bash
cd StudentManagementSystem
```

### Step 3: Compile

```bash
javac Main.java
```

### Step 4: Run

```bash
java Main
```

---

## 💻 Sample Output

```text
===== Student Management System =====

1. Add Student
2. Display Students
3. Search Student
4. Update Student
5. Delete Student
6. Exit

Enter choice: 1

Enter ID: 101
Enter Name: Saurav
Enter Age: 21
Enter Grade: A

✅ Student added successfully!
```

---

## 📚 Concepts Demonstrated

### Object-Oriented Programming (OOP)

* Classes
* Objects
* Encapsulation
* Constructors
* Method Overriding

### Core Java

* Loops
* Conditional Statements
* Collections Framework
* User Input Handling
* Exception-Free Program Flow

---

## ⚠️ Current Limitations

* Data is not stored permanently.
* Records are deleted when the program exits.
* No database connectivity.
* No duplicate ID validation.
* No authentication system.
* No graphical user interface.

---

## 🔮 Future Enhancements

* JDBC + MySQL Integration
* File Handling
* Student Result Management
* Attendance Tracking
* Login System
* Admin Dashboard
* Java Swing GUI
* JavaFX Application
* Report Generation
* Export to CSV/PDF

---

## 🎯 Learning Outcomes

This project helped in understanding:

* Java Programming Fundamentals
* Object-Oriented Programming
* Collection Framework
* CRUD Application Development
* Console-Based Application Design

---

## 👨‍💻 Author

Saurav Mishra

B.Tech (ECE) Graduate | Java Developer | MERN Stack Developer | Aspiring Software Engineer

---

## ⭐ If you found this project useful

Please consider giving it a star on GitHub.
