💼 Employee Payroll System (Java – OOP Project)

📌 Project Overview

The Employee Payroll System is a simple Java console-based application designed to demonstrate core Object-Oriented Programming (OOP) concepts such as:

✅ Abstraction

✅ Inheritance

✅ Polymorphism

✅ Encapsulation

✅ Method Overriding

This project allows users to:

Add different types of employees

Calculate salaries based on employee type

Generate employee payslips

It is a beginner-friendly learning project to strengthen Java OOP fundamentals.

🏗️ Project Structure

1️⃣ Abstract Class: Employee

Base class that contains:

id

name

calculateSalary() (abstract method)

generatePayslip()

This class ensures all employee types implement salary calculation.

2️⃣ FullTimeEmployee

Inherits from Employee

Additional Field:

baseSalary

bonus

Salary Formula:

Salary = baseSalary + bonus

3️⃣ PartTimeEmployee

Inherits from Employee

Additional Fields:

hoursWorked

hourlyRate

Salary Formula:

Salary = hoursWorked × hourlyRate

4️⃣ ContractEmployee

Inherits from Employee

Additional Field:

contractAmount

Salary Formula:

Salary = contractAmount

5️⃣ PayrollSystem (Main Class)

Displays menu options

Accepts user input

Stores employees in a collection (e.g., ArrayList)

Generates payslips

🖥️ How to Run the Project

🔹 Step 1: Compile the Project

If using terminal:

javac *.java
🔹 Step 2: Run the Application
  java PayrollSystem
📋 Sample Output
===== Employee Payroll System =====
1. Add Full-Time Employee
2. Add Part-Time Employee
3. Add Contract Employee
4. Generate Payslips
5. Exit
Example Payslip Output
----------Employee Payslip-------
Name : nav1
Employee id: 200
Employment Type: FullTimeEmployee
Salary : 500500.0
-----------------------------------
🎯 Learning Objectives

This project helps you understand:

How abstract classes work

Why method overriding is important

Runtime polymorphism

How to design a clean class hierarchy

How to build a simple real-world console application

🚀 Possible Improvements

You can enhance this project by adding:

🔹 File storage (save employee data to file)

🔹 Exception handling for invalid inputs

🔹 Search employee by ID

🔹 Delete employee

🔹 Update employee details

🔹 GUI using JavaFX or Swing

🔹 Database integration (MySQL)

🧠 Concepts Practiced

OOP Design

Constructor usage

Getter and Setter methods

ArrayList

Switch case

User input using Scanner

Clean code structure

👨‍💻 Author

Developed as a Java learning project to strengthen OOP fundamentals.